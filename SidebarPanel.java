import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.*;

public class SidebarPanel extends JPanel {
    private final String[] menuItems = {
            "Home",
            "Characters",
            "Multiverse",
            "Allies",
            "Enemies",
            "Gadgets",
            "Guides",
            "Tools"
    };
    private final Color buttonHoverColor = new Color(50, 50, 50); // Define hover color
    private final Color buttonBackgroundColor = Color.GRAY; // Define default background color

    public SidebarPanel(CardLayout cardLayout, JPanel mainContentPanel) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(30, 30, 30));
        setPreferredSize(new Dimension(200, 0));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (String item : menuItems) {
            JButton btn = new JButton(item);
            btn.setFont(new Font("SansSerif", Font.PLAIN, 14));
            btn.setContentAreaFilled(true);
            btn.setOpaque(true);
            btn.setBackground(Color.GRAY);
            btn.setForeground(Color.WHITE);
            btn.setFocusPainted(false);
            btn.setHorizontalAlignment(SwingConstants.CENTER);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            btn.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40));

            btn.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); 

            // Action listener to switch panels
            btn.addActionListener(e -> cardLayout.show(mainContentPanel, item));

            // Mouse listener for hover effect
            btn.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(buttonHoverColor);
                    btn.repaint(); // Ensure the background updates immediately
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(buttonBackgroundColor);
                    btn.repaint(); // Ensure the background updates immediately
                }
            });

            add(btn);
            add(Box.createRigidArea(new Dimension(0, 10)));
        }
    }
}

