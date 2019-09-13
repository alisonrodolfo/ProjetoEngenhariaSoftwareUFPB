/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author aliso
 */
public class Prontuario {
    
    private int ID;
    private int IDPaciente;
    private String historico;

    public Prontuario(int ID, int IDPaciente, String historico) {
        this.ID = ID;
        this.IDPaciente = IDPaciente;
        this.historico = historico;
    }

    public Prontuario() {
    }
    
    

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDPaciente() {
        return IDPaciente;
    }

    public void setIDPaciente(int IDPaciente) {
        this.IDPaciente = IDPaciente;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
    
    

}
