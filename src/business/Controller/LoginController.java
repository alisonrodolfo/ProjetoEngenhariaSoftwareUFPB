/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Controller;


import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import business.model.Paciente;
import infra.errorMessageException;
import java.io.IOException;
import javafx.fxml.FXMLLoader;

/**
 *
 * @author aliso
 */
public class LoginController implements Initializable {

    @FXML
    private TextField LoginTextField;
    @FXML
    private PasswordField SenhaPasswordField;   

    @FXML
    private Label errorLabel;

    @FXML
    private AnchorPane AnchorPane;

    public static Paciente user;



    @FXML
    private void handleButtonLogin(ActionEvent event) throws errorMessageException, IOException {
       
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLDashBoard.fxml"));
        AnchorPane.getChildren().setAll(a);
        

    }

    public void errorMessageExceptionAmigavel(String erro) {
        errorLabel.setText(erro);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //CadastroDAO.setConnection(connection);

    }

}
