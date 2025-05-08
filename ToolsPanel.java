import javax.swing.*;
import java.awt.*;

public class ToolsPanel extends JPanel {
    private JPanel toolsContentPanel;

    public ToolsPanel() {
        setBackground(new Color(20, 20, 40));
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Tools - Coming Soon", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel, BorderLayout.NORTH);

        toolsContentPanel = new JPanel();
        toolsContentPanel.setLayout(new CardLayout());
        add(toolsContentPanel, BorderLayout.CENTER);
    }

    // Method to add tool panels to the tools content panel
    public void addToolPanel(String toolName, JPanel panel) {
        toolsContentPanel.add(panel, toolName);
    }

    // Method to show tool panels
    public void showToolPanel(String toolName) {
        CardLayout cl = (CardLayout) toolsContentPanel.getLayout();
        cl.show(toolsContentPanel, toolName);
    }
}
