/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.controll.ContabilidadeDecorator;

/**
 *
 * @author aliso
 */
public class Salario extends ContabilidadeDecorator {

    Contabilidade contabil;

    public Salario(Contabilidade contabil, int id, String referencia, double valor) {
        super(contabil);
        this.contabil = contabil;
        contabil.setId(id);
        contabil.setReferencia(referencia);
        contabil.getValor();

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
