import javax.swing.*;
import java.awt.*;

public class GuidesPanel extends JPanel {
    private JPanel guidesContentPanel;

    public GuidesPanel() {
        setBackground(new Color(20, 20, 40));
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Guides - Coming Soon", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel, BorderLayout.NORTH);

        guidesContentPanel = new JPanel();
        guidesContentPanel.setLayout(new CardLayout());
        add(guidesContentPanel, BorderLayout.CENTER);
    }

    // Method to add guide panels to the guides content panel
    public void addGuidePanel(String guideName, JPanel panel) {
        guidesContentPanel.add(panel, guideName);
    }

    // Method to show guide panels
    public void showGuidePanel(String guideName) {
        CardLayout cl = (CardLayout) guidesContentPanel.getLayout();
        cl.show(guidesContentPanel, guideName);
    }
}
