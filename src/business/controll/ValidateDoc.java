/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controll;

import business.model.CSV;
import business.model.DocumentoRelatorio;
import business.model.JSon;
import business.model.XML;

/**
 *
 * @author aliso
 */
public class ValidateDoc implements DocumentoRelatorio {

    @Override
    public Object visitar(JSon j) {
        return true;
    }

    @Override
    public Object visitar(XML x) {
        return true;
    }

    @Override
    public Object visitar(CSV c) {
        return true;
    }

}
