package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import ui.centerpanels.*;

public class ToolPanel extends BorderPane{

    
    public ToolPanel() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/fxml/ToolPanel.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException ex) {
            Logger.getLogger(ToolPanel.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        }
        
        this.setTop(new HeaderPanel());

        
    }
}
