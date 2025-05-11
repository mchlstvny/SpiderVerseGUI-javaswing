import javax.swing.*;
import java.awt.*;

// public class CharacterInfoDialog extends JDialog {
//     public CharacterInfoDialog(JFrame parent, String name, String description, ImageIcon imageIcon) {
//         super(parent, name, true); // Modal dialog

//         setLayout(new BorderLayout(10, 10));
//         setSize(400, 300);
//         setLocationRelativeTo(parent);

//         // Image on the left
//         JLabel imageLabel = new JLabel(imageIcon);
//         imageLabel.setPreferredSize(new Dimension(150, 200));
//         add(imageLabel, BorderLayout.WEST);

//         // Description on the right
//         JTextArea descArea = new JTextArea(description);
//         descArea.setWrapStyleWord(true);
//         descArea.setLineWrap(true);
//         descArea.setEditable(false);
//         descArea.setOpaque(false);
//         descArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
//         JScrollPane scrollPane = new JScrollPane(descArea);
//         scrollPane.setBorder(null);

//         add(scrollPane, BorderLayout.CENTER);

//         // Close button at the bottom
//         JButton closeButton = new JButton("Close");
//         closeButton.addActionListener(e -> dispose());
//         JPanel buttonPanel = new JPanel();
//         buttonPanel.add(closeButton);
//         add(buttonPanel, BorderLayout.SOUTH);
//     }
// }

public class CharacterInfoDialog extends JDialog {
    public CharacterInfoDialog(JFrame parent, Character character) {
        super(parent, character.name, true);
        setLayout(new BorderLayout(10, 10));
        setSize(500, 350);
        setLocationRelativeTo(parent);

        // Left: Unmasked portrait image
        ImageIcon portraitIcon = new ImageIcon(character.unmaskedImagePath);
        Image portraitImg = portraitIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(portraitImg));
        imageLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(imageLabel, BorderLayout.WEST);

        // Center: Info panel
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        infoPanel.add(new JLabel("<html><h2>" + character.name + "</h2></html>"));
        infoPanel.add(new JLabel("Real Name: " + character.realName));
        infoPanel.add(new JLabel("Age: " + character.age));
        infoPanel.add(Box.createVerticalStrut(10));

        JTextArea descArea = new JTextArea(character.description);
        descArea.setLineWrap(true);
        descArea.setWrapStyleWord(true);
        descArea.setEditable(false);
        descArea.setOpaque(false);
        descArea.setFont(new Font("SansSerif", Font.PLAIN, 14));
        infoPanel.add(descArea);

        add(infoPanel, BorderLayout.CENTER);

        // Bottom: Close button
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(e -> dispose());
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(closeButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}

