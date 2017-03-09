package ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;

public class LoginPanel extends BorderPane{
    
    @FXML
    Button btnCancel,btnLogin;
    
    @FXML
    Label lblMail,lblWachtwoord,lblError;
    
    @FXML
    TextField txtMail;
    
    @FXML
    PasswordField pwfWachtwoord;

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
        lblError.setVisible(false);
    }
    
    @FXML
    private void cancel()
    {
        System.exit(1);
    }
    
    @FXML
    private void login()
    {
        //todo write login method
        if(validateEmail())
        {
            //test, wijzigen naar effectieve login methode
            lblError.setText("logged in");
            lblError.setVisible(true);
        }
    }
    
    //controle geldig emailadres
    public boolean validateEmail()
    {
        Pattern validEmail = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9.-]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        Matcher m = validEmail.matcher(txtMail.getText());
        if(m.find() && m.group().equals(txtMail.getText()))
        {
            return true;
        }
        else
        {
            lblError.setText("Gelieve een geldig emailadres op te geven");
            lblError.setVisible(true);

            return false;
        }
    }
}
