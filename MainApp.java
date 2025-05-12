import javax.swing.*;
import java.awt.*;

public class MainApp {
    private CardLayout cardLayout;
    private JPanel mainContentPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MainApp().createAndShowGUI());
    }

    void createAndShowGUI() {
        JFrame frame = new JFrame("Spider-Verse Characters");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);
        frame.setLayout(new BorderLayout());

        // Top navbar
        frame.add(new NavbarPanel(), BorderLayout.NORTH);

        // Center panel
        cardLayout = new CardLayout();
        mainContentPanel = new JPanel(cardLayout);

        // Add panels
        mainContentPanel.add(new HomePanel(), "Home");
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getSpiderVerseCharacters()), "Characters");
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getMultiverseCharacters()), "Multiverse");
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getAlliesCharacters()), "Allies"); // Perbaikan nama tab
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getEnemiesCharacters()), "Enemies");
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getGadgets()), "Gadgets");
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getGuides()), "Guides");
        mainContentPanel.add(new CharacterGridPanel(CharacterData.getTools()), "Tools");

        // Sidebar
        frame.add(new SidebarPanel(cardLayout, mainContentPanel), BorderLayout.WEST);
        frame.add(mainContentPanel, BorderLayout.CENTER);

        // Default panel
        cardLayout.show(mainContentPanel, "Home");

        frame.setVisible(true);
    }
}

