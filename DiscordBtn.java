import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class DiscordBtn extends JButton {
    private final Color defaultBackgroundColor;
    private final Color hoverBackgroundColor = new Color(190, 45, 42); // Darker red when hovered

    private String discordURL = "https://discord.gg/your_discord_invite_link"; 

    public DiscordBtn() {
        super("Join Discord");
        setFocusPainted(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setOpaque(true);
        setBackground(new Color(229, 57, 53)); // Red
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

        // Action Listener untuk membuka URL
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openDiscordURL();
            }
        });
    }

    private void openDiscordURL() {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(discordURL));
            } catch (IOException | URISyntaxException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Fail to open Discord.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Desktop is not supported on this platform.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Setter to update discordURL
    public void setDiscordURL(String url) {
        discordURL = url;
    }
}