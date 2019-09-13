/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.Controller.Relatorio;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author aliso
 */
public class XML implements Documento {

    @Override
    public Object aceitar(DocumentoRelatorio dr) {
        return dr.visitar(this);
    }

    public void gerarXML(Relatorio[] xml) {
        try {

            try (FileWriter file = new FileWriter("/relatorios/"+System.currentTimeMillis()+".xml")) {
                file.write(Arrays.toString(xml));
                file.flush();
            }

        } catch (IOException e) {
        }
    }
    
}
