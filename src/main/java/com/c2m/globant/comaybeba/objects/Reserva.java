/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

import com.c2m.globant.comaybeba.gui.MesaImagen;
/**
 * Representación lógica de la reserva realizada por un cliente.
 * Esta clase está en desarrollo aún
 * @author hhade
 */
public class Reserva {
    
    private String hora_programada;
    
    private String hora_llegada;
    
    private String user;
    
    private String fecha;
    
    private String mesa;
    
    private long id;
    
    /**
     * Crea una reserva con todos sus parámetros
     * @param fecha Fecha en la que está programada la reserva
     * @param mesa Mesa en la cual se realiza la reserva
     * @param user Identificación del usuario
     * @param hora_programada Hora para la que está planeada la reserva
     * @param id Identificación única de la reserva
     */
    public Reserva(String fecha, MesaImagen mesa, String user, String hora_programada, long id){
        this.fecha = fecha;
        this.mesa = mesa.getClaveFirebase();
        this.user = user;
        this.hora_programada = hora_programada;
        this.hora_llegada = null;
        this.id = id;
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

    /**
     * @return the hora_programada
     */
    public String getHora_programada() {
        return hora_programada;
    }

    /**
     * @param hora_programada the hora_programada to set
     */
    public void setHora_programada(String hora_programada) {
        this.hora_programada = hora_programada;
    }

    /**
     * @return the hora_llegada
     */
    public String getHora_llegada() {
        return hora_llegada;
    }

    /**
     * @param hora_llegada the hora_llegada to set
     */
    public void setHora_llegada(String hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
}
