import javax.swing.*;
import java.awt.*;
import java.util.List;

public class CharacterGridPanel extends JPanel {
    public CharacterGridPanel(List<Character> characters) {
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(0, 4, 10, 10));
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gridPanel.setBackground(Color.DARK_GRAY);

        for (Character c : characters) {
            gridPanel.add(new CharacterCard(c));
        }

        JScrollPane scrollPane = new JScrollPane(gridPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);
    }
}


