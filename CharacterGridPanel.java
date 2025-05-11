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
        
            list.add(new Character(
                "Miles Morales", 
                "Miles Gonzalo Morales", 
                "images/masked/miles.jpeg", 
                "images/unmasked/miles.jpeg", 
                "A teenager from Brooklyn with spider powers from another dimension.", 
                17
            ));

            list.add(new Character(
                "Spider-Gwen", "Gwendolyn Maxine Stacy", 
                "images/masked/gwen.jpeg", 
                "images/unmasked/gwen.jpeg", 
                "A Spider-Woman from another universe who drums in a punk band.", 
                17
            ));

            list.add(new Character(
                "Spider-man (616)", 
                "Peter Benjamin Parker", 
                "images/masked/peterb.jpeg", 
                "images/unmasked/peterb.jpeg", 
                "An experienced Spider-Man from the main universe and mentor to Miles.", 
                38
            ));

            list.add(new Character(
                "Spider-Man 2099", 
                "Miguel O'Hara", 
                "images/masked/miguel.png", 
                "images/unmasked/miguel.jpeg", 
                "A futuristic Spider-Man leading the Spider Society in the multiverse.", 
                33
            ));

            list.add(new Character(
                "Spider-Ham",
                "Peter Porker", 
                "images/masked/spiderham.jpeg", 
                "images/unmasked/ham.jpeg", 
                "A cartoon pig version of Spider-Man from an animated slapstick universe.", 
                16
            ));

            list.add(new Character(
                "Spider-Man Noir", 
                "Peter Parker (Noir)", 
                "images/masked/noir.jpeg", 
                "images/unmasked/noir.jpeg", 
                "A 1930s black-and-white detective-style Spider-Man with a fedora.", 
                35
            ));

            list.add(new Character(
                "Peni Parker", 
                "Peni Parker", 
                "images/masked/peni.jpeg", 
                "images/unmasked/peni.jpeg", 
                "An anime-style girl who pilots a spider-robot named SP//dr.", 
                14
            ));

            list.add(new Character(
                "Spider-Woman", 
                "Jessica Drew", 
                "images/masked/jessica.jpeg", 
                "images/unmasked/jessica.jpeg", 
                "A skilled Spider-Woman and motorcyclist, also expecting a child.", 
                30
            ));

            list.add(new Character(
                "Spider-Man India", 
                "Pavitr Prabhakar", 
                "images/masked/india.jpeg", 
                "images/unmasked/india.jpeg", 
                "A colorful and agile Spider-Man from Mumbai with a lively spirit.", 
                20
            ));

            list.add(new Character(
                "Spider-Punk", 
                "Hobie Brown", 
                "images/masked/punk.jpeg", 
                "images/unmasked/punk.jpeg", 
                "A rebellious punk rock Spider-Man who fights with style and sound.", 
                19
            ));

            list.add(new Character(
                "Scarlet Spider", 
                "Ben Reilly", 
                "images/masked/scarlet.jpeg", 
                "images/unmasked/scarlet.jpeg",
                "A clone of Peter Parker, often brooding and seeking identity.", 
                25
            ));
                
            list.add(new Character(
                "Spectacular Spider-Man", 
                "Peter Parker", 
                "images/masked/spec.jpeg", 
                "images/unmasked/spec.jpeg", 
                "A sharp and witty Spider-Man from the Spectacular animated series.", 
                17
            ));

            list.add(new Character(
                "Web Slinger", 
                "Webb McGraw", 
                "images/masked/slinger.jpeg", 
                "images/unmasked/slinger.jpeg", 
                "A cowboy-themed Spider-Man from the Wild West with a spider-horse.", 
                32
            ));

            list.add(new Character(
                "Spider-Byte", 
                "Margo Kess", 
                "images/masked/byte.jpeg", 
                "images/unmasked/byte.jpeg", 
                "A virtual-reality Spider-Woman from a high-tech digital world.", 
                18
            ));

            list.add(new Character(
                "Lego Spider-Man", 
                "Peter Parker (Lego)", 
                "images/masked/lego.jpeg", 
                "images/unmasked/lego.jpeg", 
                "A brick-built Spider-Man from the Lego universe with charm and humor.", 
                16
            ));
        
            return list;
        }
}

