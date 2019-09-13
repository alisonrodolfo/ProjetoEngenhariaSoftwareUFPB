/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controll;

import business.model.Contabilidade;

/**
 *
 * @author aliso
 */
public abstract class ContabilidadeDecorator extends Contabilidade {

    Contabilidade contabil;

    public ContabilidadeDecorator(Contabilidade contabil) {
        this.contabil = contabil;
    }

    @Override
    public int getId() {
        return contabil.getId();
    }

    @Override
    public String getReferencia() {
        return contabil.getReferencia();
    }

    @Override
    public double getValor() {
        return contabil.getValor();
    }

}
