package ui;

import domein.Tool;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UIController {

    private Tool tool;
    
    private LoginPanel inlogScherm;
    private ToolPanel toolScherm;
    
    Scene scenelogin = new Scene(new LoginPanel());
    
    public UIController(Stage stage,Tool tool) {
        this.tool = tool;
        stage.setScene(scenelogin);
        
        stage.setTitle("Kairos Admin Tool");
        stage.setMinWidth(900);
        stage.setMinHeight(300);
        stage.show();
    }   
}
