import javax.swing.*;
import java.awt.*;

public class AlliesPanel extends JPanel {
    private JPanel alliesContentPanel; 

    public AlliesPanel() {
        setBackground(new Color(20, 20, 40));
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Allies - Coming Soon", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.NORTH);

        alliesContentPanel = new JPanel();
        alliesContentPanel.setLayout(new CardLayout()); 
        add(alliesContentPanel, BorderLayout.CENTER);
    }

   // Method to add character panels to the allies content panel
    public void addCharacterPanel(String characterName, JPanel panel) {
        alliesContentPanel.add(panel, characterName); 
    }
}
