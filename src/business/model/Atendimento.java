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
public class Atendimento {

    private int ID;
    private String CPFPasciente, nome, horario, IDMedico, IDTipo, setor, sala;

    public Atendimento(int ID, String CPFPasciente, String nome, String horario, String IDMedico, String IDTipo, String setor, String sala) {
        this.ID = ID;
        this.CPFPasciente = CPFPasciente;
        this.nome = nome;
        this.horario = horario;
        this.IDMedico = IDMedico;
        this.IDTipo = IDTipo;
        this.setor = setor;
        this.sala = sala;
    }

    public Atendimento() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCPFPasciente() {
        return CPFPasciente;
    }

    public void setCPFPasciente(String CPFPasciente) {
        this.CPFPasciente = CPFPasciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getIDMedico() {
        return IDMedico;
    }

    public void setIDMedico(String IDMedico) {
        this.IDMedico = IDMedico;
    }

    public String getIDTipo() {
        return IDTipo;
    }

    public void setIDTipo(String IDTipo) {
        this.IDTipo = IDTipo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

}
