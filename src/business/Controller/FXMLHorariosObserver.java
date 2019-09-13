/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Controller;

import business.controll.HorariosSubject;
import business.model.Horarios;
import business.model.HorariosObserver;
import infra.DAO.pacienteDAO;
import infra.DataBase.Database;

import java.net.URL;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author aliso
 */
public class FXMLHorariosObserver extends HorariosObserver implements Initializable {

    @FXML
    private TableView<Horarios> tableViewHorarios;

    @FXML
    private TableColumn<Horarios, String> tableColumnSala;
    @FXML
    private TableColumn<Horarios, String> tableColumnMedico;
    @FXML
    private TableColumn<Horarios, String> tableColumnHorario;

    private final List<Horarios> listClientes = new ArrayList<>();
    ;
    private ObservableList<Horarios> observableListClientes;

    public FXMLHorariosObserver(HorariosSubject horarios) {
        super(horarios);
    }

    @Override
    public void update() {

        tableColumnSala.setCellValueFactory(new PropertyValueFactory<>("sala"));
        tableColumnMedico.setCellValueFactory(new PropertyValueFactory<>("medido"));
        tableColumnHorario.setCellValueFactory(new PropertyValueFactory<>("horario"));

        observableListClientes = FXCollections.observableArrayList(listClientes);
        tableViewHorarios.setItems(observableListClientes);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

}
