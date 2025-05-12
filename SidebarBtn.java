import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SidebarBtn extends JButton {
    private final Color hoverColor = new Color(50, 50, 50);
    private final Color defaultBackgroundColor = Color.GRAY;

    public SidebarBtn(String text, CardLayout cardLayout, JPanel mainContentPanel) {
        super(text);
        setFont(new Font("SansSerif", Font.PLAIN, 14));
        setContentAreaFilled(true);
        setOpaque(true);
        setBackground(defaultBackgroundColor);
        setForeground(Color.WHITE);
        setFocusPainted(false);
        setHorizontalAlignment(SwingConstants.CENTER);
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));
        setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));

        // Action listener to switch panels
        addActionListener(e -> cardLayout.show(mainContentPanel, text));

        // Mouse listener for hover effect
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(hoverColor);
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(defaultBackgroundColor);
                repaint();
            }
        });
    }
}