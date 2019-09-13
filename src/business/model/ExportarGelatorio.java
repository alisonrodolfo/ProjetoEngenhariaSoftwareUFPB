/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.Controller.Relatorio;

/**
 *
 * @author aliso
 */
public class ExportarGelatorio implements DocumentoRelatorio {

    Relatorio[] relt;

    public ExportarGelatorio(Relatorio[] relt) {
        this.relt = relt;
    }

    @Override
    public Object visitar(JSon j) {
        j.gerarJson(relt);
        return null;
    }

    @Override
    public Object visitar(XML x) {
        x.gerarXML(relt);
        return null;
    }

    @Override
    public Object visitar(CSV c) {
        c.gerarCSV(relt);
        return null;
    }

}
