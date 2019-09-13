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
public class MedicoBuilderC {
    protected ProntuarioBuilder prontuario;
 
    public MedicoBuilderC(ProntuarioBuilder prontuario) {
        this.prontuario = prontuario;
    }
 
    public void construirProntuario(int id, int idP, String historico) {
        prontuario.buildId(id);
        prontuario.buildIDPaciente(idP);
        prontuario.buildhistorico(historico);
    }
 
    public Prontuario getProntuario() {
        return this.prontuario.getProntuario();
    }
}
