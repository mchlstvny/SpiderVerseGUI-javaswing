// import javax.swing.*;
// import java.awt.*;

// public class CharacterCard extends JPanel {
//     public CharacterCard(Character character) {
//         setLayout(new BorderLayout());
//         setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
//         setPreferredSize(new Dimension(180, 220)); 

//         JLabel imgLabel = new JLabel();
//         imgLabel.setHorizontalAlignment(SwingConstants.CENTER);

//         ImageIcon icon = new ImageIcon(character.imagePath);
//         Image scaledImage = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);  
//         imgLabel.setIcon(new ImageIcon(scaledImage));

//         JLabel nameLabel = new JLabel(character.name, SwingConstants.CENTER);
//         nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
//         nameLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0)); 

//         add(imgLabel, BorderLayout.CENTER);
//         add(nameLabel, BorderLayout.SOUTH);
//     }
// }

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CharacterCard extends JPanel {
    public CharacterCard(Character character) {
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        setPreferredSize(new Dimension(180, 220)); 

        JLabel imgLabel = new JLabel();
        imgLabel.setHorizontalAlignment(SwingConstants.CENTER);

        ImageIcon icon = new ImageIcon(character.imagePath);
        Image scaledImage = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);  
        imgLabel.setIcon(new ImageIcon(scaledImage));

        JLabel nameLabel = new JLabel(character.name, SwingConstants.CENTER);
        nameLabel.setFont(new Font("Arial", Font.BOLD, 14));
        nameLabel.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0)); 

        add(imgLabel, BorderLayout.CENTER);
        add(nameLabel, BorderLayout.SOUTH);

        // Click listener to open dialog
        // addMouseListener(new MouseAdapter() {
        //     @Override
        //     public void mouseClicked(MouseEvent e) {
        //         ImageIcon dialogIcon = new ImageIcon(character.imagePath);
        //         CharacterInfoDialog dialog = new CharacterInfoDialog(
        //             (JFrame) SwingUtilities.getWindowAncestor(CharacterCard.this),
        //             character.name,
        //             character.description,
        //             dialogIcon
        //         );
        //         dialog.setVisible(true);
        //     }
        // });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CharacterInfoDialog dialog = new CharacterInfoDialog(
                    (JFrame) SwingUtilities.getWindowAncestor(CharacterCard.this),
                    character
                );
                dialog.setVisible(true);
            }
        });
    }
}

