package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Dries Willems
 */
public class LoginController 
{

    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private ImageView logo;
    @FXML
    private Label lblMail;
    @FXML
    private TextField txtMail;
    @FXML
    private Label lblWachtwoord;
    @FXML
    private PasswordField pwfWachtwoord;
    @FXML
    private Label lblErrors;
    @FXML
    private Button btnCancel;
    @FXML
    private Button btnLogin;


    @FXML
    private void cancel() 
    {
        System.exit(1);
    }

    @FXML
    private void login() 
    {
    }
    
}
