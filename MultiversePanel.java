import javax.swing.*;
import java.awt.*;

public class MultiversePanel extends JPanel {

    private JPanel contentPanel; 

    public MultiversePanel() {
        setBackground(new Color(20, 20, 40));
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Multiverse Overview", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.NORTH);

        contentPanel = new JPanel();
        contentPanel.setLayout(new CardLayout()); 
        add(contentPanel, BorderLayout.CENTER);
    }

    // Method to add character panels to the content panel
    public void addCharacterPanel(String characterName, JPanel panel) {
        contentPanel.add(panel, characterName); 
    }

    // Method to show a specific character panel
    public void showCharacterPanel(String characterName) {
        CardLayout cl = (CardLayout) contentPanel.getLayout();
        cl.show(contentPanel, characterName);
    }
}
