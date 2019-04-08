/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

/**
 *
 * @author AndreaOrjuela
 */
public class Carrera extends Thread{
    
    private Equipo equipo;

    public Carrera(Equipo equipo1) {
        super();
        this.equipo = equipo;
    }

    @Override
    public void run() {
        StringBuffer camino = new StringBuffer("----------------------------------------------------------------------------------------------------");

        try {
            synchronized (equipo) {
                
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
}
