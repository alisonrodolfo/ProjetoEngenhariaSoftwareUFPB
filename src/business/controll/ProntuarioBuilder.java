/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controll;

import business.model.Prontuario;

/**
 *
 * @author aliso
 */
public abstract class ProntuarioBuilder {
    protected Prontuario prontuario;
 
    public ProntuarioBuilder() {
        this.prontuario = new Prontuario();
    }
 
    public abstract void buildId(int id);
 
    public abstract void buildIDPaciente(int id);
 
    public abstract void buildhistorico(String historico);
 
 
    public Prontuario getProntuario() {
        return this.prontuario;
    }
}
