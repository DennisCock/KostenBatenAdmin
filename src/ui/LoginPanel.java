package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;

public class LoginPanel extends BorderPane{

    public LoginPanel() {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/fxml/LoginPanel.fxml"));
        loader.setRoot(this);
        loader.setController(this);
        try {
            loader.load();
        } catch (IOException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex.getMessage());
        }
    }
}
