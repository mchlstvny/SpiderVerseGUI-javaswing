import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class KoFiBtn extends JButton {
    private final Color defaultBackgroundColor;
    private final Color hoverBackgroundColor = new Color(46, 59, 139); // Darker blue when hovered

    private String koFiURL = "https://ko-fi.com/your_ko-fi_username"; // Replace with your Ko-fi URL

    public KoFiBtn() {
        super("Buy us a Ko-Fi");
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
        setBackground(new Color(57, 73, 171)); // Blue
        setForeground(Color.WHITE);
        setFont(new Font("Arial", Font.PLAIN, 12));

        defaultBackgroundColor = getBackground();

        // Hover effect
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverBackgroundColor);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultBackgroundColor);
            }
        });

        // Action Listener to open URL
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openKoFiURL();
            }
        });
    }

    private void openKoFiURL() {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(koFiURL));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Fail to open Ko-fi.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Desktop is not supported on this platform.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Setter to update Ko-fi URL
    public void setKoFiURL(String url) {
        koFiURL = url;
    }
}