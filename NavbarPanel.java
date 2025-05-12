import javax.swing.*;
import java.awt.*;

public class NavbarPanel extends JPanel {
    public NavbarPanel() {
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);
        setPreferredSize(new Dimension(0, 50));

        JLabel title = new JLabel("SpiderVerse : Character List");
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial", Font.BOLD, 18));

        // Gunakan kelas tombol terpisah
        JButton discordBtn = new DiscordBtn();
        JButton koFiBtn = new KoFiBtn();

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20, 0));
        buttonPanel.setOpaque(false);
        buttonPanel.add(discordBtn);
        buttonPanel.add(koFiBtn);

        JPanel topBar = new JPanel(new GridBagLayout());
        topBar.setBackground(new Color(45, 45, 45));
        topBar.setPreferredSize(new Dimension(0, 50));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 10, 0, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        topBar.add(title, gbc);

        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        topBar.add(buttonPanel, gbc);

        add(topBar, BorderLayout.CENTER);
    }
}
