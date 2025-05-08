import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterGridPanel extends JPanel {
    public CharacterGridPanel() {
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(0, 4, 10, 10));
        gridPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        gridPanel.setBackground(Color.DARK_GRAY);

        List<Character> characters = getSpiderVerseCharacters();
        for (Character c : characters) {
            gridPanel.add(new CharacterCard(c));
        }

        JScrollPane scrollPane = new JScrollPane(gridPanel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        add(scrollPane, BorderLayout.CENTER);
    }

    private List<Character> getSpiderVerseCharacters() {
        List<Character> list = new ArrayList<>();

        list.add(new Character("Miles Morales", "images/miles.jpeg"));
        list.add(new Character("Gwen Stacy", "images/gwen.jpeg"));
        list.add(new Character("Peter B. Parker (616)", "images/peterb.jpeg"));
        list.add(new Character("Spider-Man 2099", "images/miguel.png"));
        list.add(new Character("Spider-Ham", "images/spiderham.jpeg"));
        list.add(new Character("Spider-Man Noir", "images/noir.jpeg"));
        list.add(new Character("Peni Parker", "images/peni.jpeg"));
        list.add(new Character("Jessica Drew", "images/jessica.jpeg"));
        list.add(new Character("Spider-Man India", "images/india.jpeg"));
        list.add(new Character("Spider-Punk", "images/punk.jpeg"));
        list.add(new Character("Scarlet Spider", "images/scarlet.jpeg"));
        list.add(new Character("Spectacular Spider-Man", "images/spec.jpeg"));
        list.add(new Character("Web Slinger", "images/slinger.jpeg"));
        list.add(new Character("Spider-Byte", "images/byte.jpeg"));
        list.add(new Character("Lego Spider-Man", "images/lego.jpeg"));
       
        return list;
    }
}

