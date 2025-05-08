import javax.swing.*;
import java.awt.*;

public class GadgetsPanel extends JPanel {
    private JPanel gadgetsContentPanel;

    public GadgetsPanel() {
        setBackground(new Color(20, 20, 40));
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Gadgets - Coming Soon", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel, BorderLayout.NORTH);

        gadgetsContentPanel = new JPanel();
        gadgetsContentPanel.setLayout(new CardLayout());
        add(gadgetsContentPanel, BorderLayout.CENTER);
    }

    // Method to add gadget panels to the gadgets content panel
    public void addGadgetPanel(String gadgetName, JPanel panel) {
        gadgetsContentPanel.add(panel, gadgetName);
    }

    // Method to show gadget panels
    public void showGadgetPanel(String gadgetName) {
        CardLayout cl = (CardLayout) gadgetsContentPanel.getLayout();
        cl.show(gadgetsContentPanel, gadgetName);
    }
}
