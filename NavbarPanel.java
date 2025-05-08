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

        // Tetapkan warna langsung di sini
        JButton discordBtn = createNavButton("Join Discord", new Color(229, 57, 53)); 
        JButton koFiBtn = createNavButton("Buy us a Ko-Fi", new Color(57, 73, 171));     

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

    private JButton createNavButton(String text, Color bgColor) {
        JButton btn = new JButton(text);
        btn.setFocusPainted(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false); 
        btn.setOpaque(true);          
        btn.setBackground(bgColor);     
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("Arial", Font.PLAIN, 12));
    return btn;
    }
}
