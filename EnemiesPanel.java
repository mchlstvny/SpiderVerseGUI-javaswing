import javax.swing.*;
import java.awt.*;

public class EnemiesPanel extends JPanel {
    private JPanel enemiesContentPanel;

    public EnemiesPanel() {
        setBackground(new Color(20, 20, 40));
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Enemies - Coming Soon", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        add(titleLabel, BorderLayout.NORTH);

        enemiesContentPanel = new JPanel();
        enemiesContentPanel.setLayout(new CardLayout());
        add(enemiesContentPanel, BorderLayout.CENTER);
    }

    // Method to add enemy panels to the enemies content panel
    public void addEnemyPanel(String enemyName, JPanel panel) {
        enemiesContentPanel.add(panel, enemyName);
    }

    // Method to show enemy panels
    public void showEnemyPanel(String enemyName) {
        CardLayout cl = (CardLayout) enemiesContentPanel.getLayout();
        cl.show(enemiesContentPanel, enemyName);
    }
}
