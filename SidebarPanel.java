import javax.swing.*;
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

    public SidebarPanel(CardLayout cardLayout, JPanel mainContentPanel) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(new Color(30, 30, 30));
        setPreferredSize(new Dimension(200, 0));
        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        for (String item : menuItems) {
            SidebarBtn btn = new SidebarBtn(item, cardLayout, mainContentPanel);
            add(btn);
            add(Box.createRigidArea(new Dimension(0, 10)));
        }
    }
}