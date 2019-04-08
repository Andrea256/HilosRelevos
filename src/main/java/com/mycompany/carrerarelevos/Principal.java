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
public class Principal {
    
    public void principal() {
        
    /**
    * Método que se encarga de crear los equipos, corredores e inicializa la carrera 
    */
        
        Equipo equipo1 = new Equipo("Equipo 1");
        Equipo equipo2 = new Equipo("Equipo 2");
        Equipo equipo3 = new Equipo("Equipo 3");
        
        Corredor corredor1 = new Corredor("Corredor 1", 0, 33, equipo1);
        Corredor corredor2 = new Corredor("Corredor 2", 34, 66, equipo1);
        Corredor corredor3 = new Corredor("Corredor 3", 67, 100, equipo1);
        Corredor corredor4 = new Corredor("Corredor 4", 0, 33, equipo2);
        Corredor corredor5 = new Corredor("Corredor 5", 34, 66, equipo2);
        Corredor corredor6 = new Corredor("Corredor 6", 67, 100, equipo2);
        Corredor corredor7 = new Corredor("Corredor 7", 0, 33, equipo3);
        Corredor corredor8 = new Corredor("Corredor 8", 34, 66, equipo3);
        Corredor corredor9 = new Corredor("Corredor 9", 67, 100, equipo3);  
        
        corredor1.start();
        corredor2.start();
        corredor3.start();
        corredor4.start();
        corredor5.start();
        corredor6.start();
        corredor7.start();
        corredor8.start();
        corredor9.start();
    }
    
}
