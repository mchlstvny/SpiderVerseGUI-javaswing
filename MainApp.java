import javax.swing.*;

import Multiverse.MilesMultiverse;
import java.awt.*;

public class MainApp {
    private CardLayout cardLayout;
    private JPanel mainContentPanel;
    private MultiversePanel multiversePanel; 
    private AlliesPanel alliesPanel;
    private EnemiesPanel enemiesPanel;
    private GadgetsPanel gadgetsPanel;
    private GuidesPanel guidesPanel;
    private ToolsPanel toolsPanel;

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

        // Instance
        multiversePanel = new MultiversePanel();
        alliesPanel = new AlliesPanel(); 
        enemiesPanel = new EnemiesPanel();
        gadgetsPanel = new GadgetsPanel();
        guidesPanel = new GuidesPanel();
        toolsPanel = new ToolsPanel();

        // Instace for Multiverse character panels
        MilesMultiverse milesPanel = new MilesMultiverse();

        // Add character panels to the multiverse panel
        multiversePanel.addCharacterPanel("Miles", milesPanel);

        // All content panels
        mainContentPanel.add(new HomePanel(), "Home");
        mainContentPanel.add(new CharacterGridPanel(), "Characters");
        mainContentPanel.add(multiversePanel, "Multiverse"); 
        mainContentPanel.add(alliesPanel, "Allies"); 
        mainContentPanel.add(enemiesPanel, "Enemies"); 
        mainContentPanel.add(gadgetsPanel, "Gadgets"); 
        mainContentPanel.add(guidesPanel, "Guides");
        mainContentPanel.add(toolsPanel, "Tools");

        // Add sidebar, pass cardLayout dan mainContentPanel 
        frame.add(new SidebarPanel(cardLayout, mainContentPanel), BorderLayout.WEST);
        frame.add(mainContentPanel, BorderLayout.CENTER);

        // Set HomePanel as default
        cardLayout.show(mainContentPanel, "Home");

        frame.setVisible(true);
    }
}

