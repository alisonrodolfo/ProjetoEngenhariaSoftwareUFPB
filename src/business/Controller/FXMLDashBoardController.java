package business.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author aliso
 */
public class FXMLDashBoardController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private AnchorPane AnchorPane;
    
    @FXML
    private AnchorPane AnchorPaneBack;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLLogin.fxml"));
        AnchorPane.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonHome(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLDashBoard.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonCadastroPasciente(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLCadastroPaciente.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonEditaPasciente(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLConsultarPaciente.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonCadastroAtendimento(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLCadastroAtendimento.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonEditaAtendimento(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLConsultarAtendimento.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonCadastroProntuario(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLCadastroProntuarios.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonEditaProntuario(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLConsultarProntuarios.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonCadastroFuncionario(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLCadastroFuncionario.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonEditaFuncionario(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLConsultarFuncionario.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    
        @FXML
    private void handleButtonCadastroMedico(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLCadastroMedico.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    @FXML
    private void handleButtonEditaMedico(ActionEvent event) throws IOException {
        AnchorPane a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLConsultarMedico.fxml"));
        AnchorPaneBack.getChildren().setAll(a);
    }
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AnchorPane a;
        try {
            a = (AnchorPane) FXMLLoader.load(getClass().getResource("/view/FXMLHome.fxml"));
            AnchorPaneBack.getChildren().setAll(a);
        } catch (IOException ex) {
            Logger.getLogger(FXMLDashBoardController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
