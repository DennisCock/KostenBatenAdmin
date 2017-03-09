package main;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import ui.UIController;

public class Main extends Application {
    
    private ui.UIController uic;
    private domein.Tool tool;
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        uic = new UIController(primaryStage,tool);
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
