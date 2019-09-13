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
public class CirugiaBuilder extends ProntuarioBuilder {
    
    private Prontuario prontuario;

    @Override
    public void buildId(int id) {
       prontuario.setID(id);
    }

    @Override
    public void buildIDPaciente(int id) {
        prontuario.setIDPaciente(id);
    }

    @Override
    public void buildhistorico(String historico) {
        prontuario.setHistorico(historico);
    }

    
}
