/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AndreaOrjuela
 */
public class Utilitaria {
    
    /**
     * Método que genera aleatoriamente los pasos de un corredor en la carrera.
     * @return
     */
    public synchronized static int aleatorio() {
        return (int) (Math.random() * 3);
    }

    /**
     * Método que genera un tiempo de espera en la ejecición del programa.
     * @param mills el tiempo de espera en milisegundos
     */
    public static void pausa(int mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
