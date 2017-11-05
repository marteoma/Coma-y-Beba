/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

import com.c2m.globant.comaybeba.gui.MesaImagen;
import java.util.Calendar;

/**
 * Representación lógica de la reserva realizada por un cliente.
 * Esta clase está en desarrollo aún
 * @author hhade
 */
public class Reserva {
    
    private String user;
    
    private String fecha;
    
    private String mesa;
    
    /**
     * Crea una reserva con todos sus parámetros
     * @param fecha Fecha en la que está programada la reserva
     * @param mesa Mesa en la cual se realiza la reserva
     * @param user Identificación del usuario
     */
    public Reserva(String fecha, MesaImagen mesa, String user){
        this.fecha = fecha;
        this.mesa = mesa.getClaveFirebase();
        this.user = user;
    }
    
    public Reserva(){
        
    }
    
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Reserva){
            Reserva aux = (Reserva)o;
            return aux.getFecha().equals(this.getFecha()) &&
                    aux.getMesa().equals(this.getMesa()) &&
                    aux.getUser().equals(this.getUser());
        }
        return false;
    }

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the mesa
     */
    public String getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(String mesa) {
        this.mesa = mesa;
    }
    
}
