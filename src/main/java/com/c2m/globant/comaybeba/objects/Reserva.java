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
    
    private Usuario user;
    
    private Calendar fecha;
    
    private MesaImagen mesa;
    
    
    
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
    public Usuario getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(Usuario user) {
        this.user = user;
    }

    /**
     * @return the fecha
     */
    public Calendar getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the mesa
     */
    public MesaImagen getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(MesaImagen mesa) {
        this.mesa = mesa;
    }
    
}
