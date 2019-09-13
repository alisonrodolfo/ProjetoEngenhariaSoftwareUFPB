/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.controll;

import business.model.Horarios;
import business.model.HorariosObserver;
import java.util.ArrayList;

/**
 *
 * @author aliso
 */
public class HorariosSubject {

    protected ArrayList<HorariosObserver> observers;
    protected Horarios horarios;

    public HorariosSubject() {
        observers = new ArrayList<>();
    }

    public void attach(HorariosObserver observer) {
        observers.add(observer);
    }

    public void detach(int indice) {
        observers.remove(indice);
    }

    public void setState(Horarios horarios) {
        this.horarios = horarios;
        notifyObservers();
    }

    private void notifyObservers() {
        for (HorariosObserver observer : observers) {
            observer.update();
        }
    }

    public Horarios getState() {
        return horarios;
    }
}
