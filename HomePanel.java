import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    public HomePanel() {
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);

        JLabel titleLabel = new JLabel("Welcome to the Spider-Verse Database!", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 36));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(50, 0, 20, 0));

        JTextArea desc = new JTextArea(
            "Explore the multiverse of Spider-heroes!\n\n" +
            "Click 'Characters' to view the list of all Spider-people across dimensions.\n" +
            "Navigate through the sidebar to learn more about their allies, enemies, gadgets, and more."
        );
        desc.setFont(new Font("SansSerif", Font.PLAIN, 14));
        desc.setForeground(Color.WHITE);
        desc.setBackground(Color.DARK_GRAY);
        desc.setEditable(false);
        desc.setWrapStyleWord(true);
        desc.setLineWrap(true);
        desc.setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 30));

        add(titleLabel, BorderLayout.NORTH);
        add(desc, BorderLayout.CENTER);
    }
}
