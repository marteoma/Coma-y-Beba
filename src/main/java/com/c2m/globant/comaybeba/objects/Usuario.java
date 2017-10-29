/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

/**
 * Representa un cliente del restaurante que realizará una reserva
 * Esta clase está en desarrollo aún.
 * @author hhade
 */
public class Usuario {
    private String id;
    
    public String getId(){
        return id;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Usuario){
            return (((Usuario) o).getId() == null ? this.getId() == null : ((Usuario) o).getId().equals(this.getId()));
        }
        return false;
    }
}
