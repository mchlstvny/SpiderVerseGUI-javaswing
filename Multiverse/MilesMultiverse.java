package Multiverse;

import javax.swing.*;
import java.awt.*;

public class MilesMultiverse extends JPanel {
    public MilesMultiverse() {
        setBackground(new Color(30, 30, 60));
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Miles Morales Multiverse", SwingConstants.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 20));
        title.setForeground(Color.WHITE);
        add(title, BorderLayout.NORTH);

        JTextArea info = new JTextArea(
                "Miles Morales berasal dari Earth-1610, tetapi dia juga\n" +
                        "telah mengunjungi dan berinteraksi dengan berbagai\n" +
                        "universe lain, termasuk Earth-TRN4145 dan Earth-9610.\n" +
                        "Kisah multiverse-nya melibatkan..." // Tambahkan detail spesifik
        );
        info.setFont(new Font("SansSerif", Font.PLAIN, 16));
        info.setEditable(false);
        info.setForeground(Color.WHITE);
        info.setMargin(new Insets(20, 40, 20, 40));
        add(info, BorderLayout.CENTER);
    }
}
