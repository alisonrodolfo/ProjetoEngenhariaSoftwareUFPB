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
public class JSon implements Documento {

    @Override
    public Object aceitar(DocumentoRelatorio dr) {
        return dr.visitar(this);
    }

    public void gerarJson(Relatorio[] json) {

        try {

            try (FileWriter file = new FileWriter("/relatorios/"+System.currentTimeMillis()+".json")) {
                file.write(Arrays.toString(json));
                file.flush();
            }

        } catch (IOException e) {
        }
    }
}
