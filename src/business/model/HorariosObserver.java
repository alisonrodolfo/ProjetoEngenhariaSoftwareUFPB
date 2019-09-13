/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.controll.HorariosSubject;

/**
 *
 * @author aliso
 */
public abstract class HorariosObserver {

    protected HorariosSubject horarios;

    public HorariosObserver(HorariosSubject horarios) {
        this.horarios = horarios;
    }

    public abstract void update();
}
