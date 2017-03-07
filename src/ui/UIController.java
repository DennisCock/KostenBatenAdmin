package ui;

import domein.Tool;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UIController {

    private Tool tool;
    
    private LoginPanel inlogScherm;
    private ToolPanel toolScherm;
    
    public UIController(Stage stage, Tool tool) {
        this.tool = tool;
        

        Scene scenelogin = new Scene(new LoginPanel());
        //Scene scenetool = new Scene(new ToolPanel());
        
        
        
        stage.setScene(scenelogin);
        stage.setTitle("Kairos");
        stage.setMinWidth(500);
        stage.setMinHeight(300);
        stage.show();
    }
}
