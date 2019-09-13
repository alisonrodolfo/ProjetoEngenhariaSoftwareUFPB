/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Controller;

import Fachada.FachadaBusiness;
import business.model.Paciente;
import infra.DAO.DAOFactoryIF;
import infra.DAO.usuariosDAO;
import infra.DataBase.Database;
import infra.DataBase.DatabaseFactoryImpl;
import java.net.URL;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import infra.errorMessageException;
import java.awt.Button;
import java.awt.TextArea;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.Pane;

/**
 *
 * @author aliso
 */
public class FXMLPacienteController implements Initializable {

    @FXML
    private TextField LoginTextField;
    @FXML
    private PasswordField SenhaPasswordField;
    @FXML
    private TextField TextNome;
    @FXML
    private TextField TextEndereco;
    @FXML
    private TextField TextRG;
    @FXML
    private TextField TextCPF;
    @FXML
    private TextField TextEmail;
    @FXML
    private ComboBox<String> ComboBoxSexo;
    @FXML
    private TextArea TextAreaHistss;

    @FXML
    private Pane PaneConfirmacao;
    @FXML
    private Label LabelConfirmacao;
    @FXML
    private Button BSIM;
    @FXML
    private Button BNAO;

    @FXML
    private Label errorLabel;

    SimpleDateFormat formatoRetorno = new SimpleDateFormat("dd/MM/yyyy");

    @FXML
    private DatePicker DatePickerNasc;

    //Atributos para manipulação de Banco de Dados
    private final Database database = DatabaseFactoryImpl.getDatabase("mysql");
    private final Connection connection = database.conectar();
    private final usuariosDAO usuariosDAO = new usuariosDAO();

    public FachadaBusiness fachada;

    @FXML
    private void handleButtonCadastro(ActionEvent event) throws errorMessageException {
        LocalDate dataAtual = DatePickerNasc.getValue();
        if (validaEntradadeDados()) {
            usuariosDAO.inserir(new Paciente(0, TextNome.getText(), TextCPF.getText(), TextRG.getText(), ComboBoxSexo.getValue(),
                    LoginTextField.getText(), TextEmail.getText(), SenhaPasswordField.getText(), dataAtual, TextEndereco.getText(), ""));
        }

    }

    @FXML
    private void handleButtonConsultar(ActionEvent event) throws errorMessageException {
        Paciente paciente = usuariosDAO.buscar(new Paciente(TextCPF.getText()));
        System.out.println(paciente.toString());

        
            TextNome.setText(paciente.getNome());
            TextCPF.setText(paciente.getCPF());
            TextRG.setText(paciente.getRG());
            //ComboBoxSexo.set
            LoginTextField.setText(paciente.getLogin());
            //TextEmail.setText(paciente.getEmail());
            SenhaPasswordField.setText("******");
            TextEndereco.setText(paciente.getEndereco());
            //TextAreaHistss.setText(paciente.getHistorico());
            DatePickerNasc.setValue(paciente.getNascimento());
        

    }

    @FXML
    private void handleButtonAlterar(ActionEvent event) throws errorMessageException {
        PaneConfirmacao.setVisible(true);

        if (BSIM.isEnabled()) {

        }

    }

    @FXML
    private void handleButtonRemover(ActionEvent event) throws errorMessageException {
        
    }

    public boolean validaEntradadeDados() throws errorMessageException {
        boolean valid = true;

        if (LoginTextField.getText().length() > 12) {
            valid = false;
            errorMessageExceptionAmigavel("Campo login é inválido\n"
                    + "Deve conter no máximo 12 letras! por favor, verifique novamente...\n");
            //throw new errorMessageException("Campo login é inválido\n"
            //        + "Deve conter no máximo 12 letras! por favor, verifique novamente...\n");

        } else if (LoginTextField.getText().equalsIgnoreCase("")) {
            valid = false;
            errorMessageExceptionAmigavel("Campo login é inválido\n"
                    + "Não pode ser vazio! por favor, verifique novamente...\n");
            ////throw new errorMessageException("Campo login é inválido\n"
            ////        + "Não pode ser vazio! por favor, verifique novamente...\n");
        } else if (LoginTextField.getText().matches(".*\\d.*")) {
            valid = false;
            errorMessageExceptionAmigavel("Campo login é inválido\n"
                    + "Não Deve conter números! por favor, verifique novamente...\n");
            ////throw new errorMessageException("Campo login é inválido\n"
            ////        + "Não Deve conter números! por favor, verifique novamente...\n");
            //
        }
        if (SenhaPasswordField.getText().length() > 20) {
            valid = false;
            errorMessageExceptionAmigavel("Campo senha é inválido\n"
                    + "Deve conter no máximo 20 caracteres! por favor, verifique novamente...\n");
            ////throw new errorMessageException("Campo senha é inválido\n"
            ////        + "Deve conter no máximo 20 caracteres! por favor, verifique novamente...\n");
            //
        } else if (SenhaPasswordField.getText().length() < 8) {
            valid = false;
            errorMessageExceptionAmigavel("Campo senha é inválido\n"
                    + "Deve conter pelo menos 8 caracteres! por favor, verifique novamente...\n");
            ////throw new errorMessageException("Campo senha é inválido\n"
            ////        + "Deve conter pelo menos 8 caracteres! por favor, verifique novamente...\n");
            //
        } else if ((!SenhaPasswordField.getText().matches("[a-zA-Z]*")) && (!SenhaPasswordField.getText().matches(".*\\d.*")) || (!SenhaPasswordField.getText().matches(".*\\d{2,}.*"))) {
            valid = false;
            errorMessageExceptionAmigavel("Campo senha é inválido\n"
                    + "Deve conter letras e pelo menos 2 números! por favor, verifique novamente...\n");
            ////throw new errorMessageException("Campo senha é inválido\n"
            ////        + "Deve conter letras e pelo menos 2 números! por favor, verifique novamente...\n");

        }
        return valid;
    }

    public void errorMessageExceptionAmigavel(String erro) {
        errorLabel.setText(erro);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        usuariosDAO.setConnection(connection);

    }

}
