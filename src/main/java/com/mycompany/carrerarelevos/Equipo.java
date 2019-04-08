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
public class Equipo {

    private String nombre;
    private int posicionActualC1;
    private int posicionActualC2;
    private int posicionActualC3;

    /**
     * Constructor que recibe los parametros necesarios para inicializar un equipo
     * 
     * @param nombre el nombre de equipo
     */
    public Equipo(String nombre) {
        this.setNombre(nombre);
        this.setPosicionActualC1(0);
        this.setPosicionActualC2(34);
        this.setPosicionActualC3(67);
    }

    /**
     * Getters y Setters
     */
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the posicionActualC3
     */
    public int getPosicionActualC3() {
        return posicionActualC3;
    }

    /**
     * @param posicionActualC3 the posicionActualC3 to set
     */
    public void setPosicionActualC3(int posicionActualC3) {
        this.posicionActualC3 = posicionActualC3;
    }

    /**
     * @return the posicionActualC2
     */
    public int getPosicionActualC2() {
        return posicionActualC2;
    }

    /**
     * @param posicionActualC2 the posicionActualC2 to set
     */
    public void setPosicionActualC2(int posicionActualC2) {
        this.posicionActualC2 = posicionActualC2;
    }

    /**
     * @return the posicionActualC1
     */
    public int getPosicionActualC1() {
        return posicionActualC1;
    }

    /**
     * @param posicionActualC1 the posicionActualC1 to set
     */
    public void setPosicionActualC1(int posicionActualC1) {
        this.posicionActualC1 = posicionActualC1;
    }

    /**
     * Método que imprime cada equipo en la carrera
     * @return la vista de la carrera del equipo
     */
    public synchronized StringBuffer mostrarPosicion(){
        
        StringBuffer carrera = new StringBuffer("----------------------------------------------------------------------------------------------------");

        for (int i = 0; i <= carrera.length(); i++) {
            if (i == getPosicionActualC1()) {
                carrera.setCharAt(i, '1');
            } else if (i == getPosicionActualC2()) {
                carrera.setCharAt(i, '2');
            } else if (i == getPosicionActualC3()) {
                carrera.setCharAt(i, '3');
            }
        } 
        return carrera;
    }
    
}
