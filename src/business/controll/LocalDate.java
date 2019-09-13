/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controll;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aliso
 */
public class LocalDate extends LocalDateInterpreter {

    java.util.Date dataFormatada;
    @Override
    public String Data(String dataSistema) {
        String dataBanco = "";
        try {
            dataFormatada = new SimpleDateFormat("dd/MM/yyyy").parse(dataSistema);
            dataBanco = new SimpleDateFormat("yyyy-MM-dd").format(dataFormatada);
        } catch (ParseException ex) {
            Logger.getLogger(LocalDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataBanco;
    }

    @Override
    public String Hora(String horaSistema) {
        String dataBanco = "";
        try {
            dataFormatada = new SimpleDateFormat("hh:mm").parse(horaSistema);
            dataBanco = new SimpleDateFormat("hh:mm").format(dataFormatada);
        } catch (ParseException ex) {
            Logger.getLogger(LocalDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataBanco;
    }

    @Override
    public String DataeHora(String dataEhora) {
        String dataBanco = "";
        try {
            dataFormatada = new SimpleDateFormat("dd/MM/yyyy hh:mm").parse(dataEhora);
            dataBanco = new SimpleDateFormat("yyyy-MM-dd  hh:mm").format(dataFormatada);
        } catch (ParseException ex) {
            Logger.getLogger(LocalDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataBanco;
    }

}
