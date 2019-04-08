/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.carrerarelevos;

import java.util.logging.Level;
import java.util.logging.Logger;

import static com.mycompany.carrerarelevos.Utilitaria.*;

/**
 *
 * @author AndreaOrjuela
 */
public class Corredor extends Thread{

    private String nombre;
    private int posicionInicial;
    private int posicionFinal;
    Equipo equipo;

    /**
     * Constructor que recibe los parametros necesarios para inicializar a un corredor
     * @param nombre el nombre del corredor
     * @param posicionInicial la posición inicial del corredor en la carrera
     * @param posicionFinal la posición final del corredor en la carrera
     * @param equipo el equipo al que pertenece el corredor
     */
    public Corredor(String nombre, int posicionInicial, int posicionFinal, Equipo equipo) {
        this.setNombre(nombre);
        this.setPosicionInicial(posicionInicial);
        this.setPosicionInicial(posicionInicial);
        this.setEquipo(equipo);
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return the posicionFinal
     */
    public int getPosicionFinal() {
        return posicionFinal;
    }

    /**
     * @param posicionFinal the posicionFinal to set
     */
    public void setPosicionFinal(int posicionFinal) {
        this.posicionFinal = posicionFinal;
    }

    /**
     * @return the posisionInicial
     */
    public int getPosicionInicial() {
        return posicionInicial;
    }

    /**
     * @param posisionInicial the posisionInicial to set
     */
    public void setPosicionInicial(int posicionInicial) {
        this.posicionInicial = posicionInicial;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the equipo
     */
    public Equipo getEquipo() {
        return equipo;
    }

    /**
     * @param equipo the equipo to set
     */
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    /**
     * Ejecución principal de los hilos
     */
    @Override
    public void run() {
        if (getPosicionInicial() == 0) {
            relevo1();
        } else {
            esperaHilos();
        }
        if (getPosicionInicial() == 34) {
            relevo2();
        } else {
            esperaHilos();
        }
        if (getPosicionInicial() == 67) {
            relevo3();
        } else {
            esperaHilos();
        }
    }

    /**
     * Método que procesa los movimientos de corredor 1 de cada equipo
     */
    public void relevo1() {
        while (true) {
            int pasoActual = avanzar(1);
            if (pasoActual >= 33) {
                equipo.setPosicionActualC1(33);
                synchronized (equipo) {
                    equipo.notifyAll();
                    setPosicionInicial(33);
                }
                break;
            }
        }
    }

    /**
     * Método que procesa los movimientos de corredor 2 de cada equipo
     */
    public void relevo2(){
        while (true) {
            int pasoActual = avanzar(2);
            if (pasoActual >= 66) {
                equipo.setPosicionActualC2(66);
                synchronized (equipo) {
                    equipo.notifyAll();
                }
                break;
            }
        }
    }
    
    /**
     * Método que procesa los movimientos de corredor 3 de cada equipo
     */
    public void relevo3(){
        while (true) {
            int pasoActual = avanzar(3);
            if (pasoActual >= 100) {
                equipo.setPosicionActualC3(100);
                System.out.println(equipo.getNombre()+" Es el ganador!!!!!!!!");
                System.exit(0);
                synchronized (equipo) {
                    equipo.notify();
                }
                
                break;
            }
        }
    }

    /**
     * Método encargado de calcular y asignar movimientos de cada corredor en la carrera
     * @param numCorredor el numero de corredor
     * @return la posición actual del corredor
     */
    public int avanzar(int numCorredor) {
        pausa(200);
        int pasos = aleatorio();
        if (numCorredor == 1) {
            StringBuffer equipo1 = new StringBuffer(100);
            equipo.setPosicionActualC1(equipo.getPosicionActualC1() + pasos);
            equipo1 = equipo.mostrarPosicion();
            System.out.println(equipo.getNombre() + ": " + equipo1);
            return equipo.getPosicionActualC1();
        }
        if (numCorredor == 2) {
            StringBuffer equipo2 = new StringBuffer(100);
            equipo.setPosicionActualC2(equipo.getPosicionActualC2() + pasos);
            equipo2 = equipo.mostrarPosicion();
            System.out.println(equipo.getNombre() + ": " + equipo2);
            return equipo.getPosicionActualC2();
        }
        if (numCorredor == 3) {
            StringBuffer equipo3 = new StringBuffer(100);
            equipo.setPosicionActualC3(equipo.getPosicionActualC3() + pasos);
            equipo3 = equipo.mostrarPosicion();
            System.out.println(equipo.getNombre() + ": " + equipo3);

            return equipo.getPosicionActualC3();
        }
        return 0;
    }

    public void esperaHilos(){
        synchronized (equipo) {
            try {
                equipo.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
