/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

/**
 * Representa el lugar que se incluirá en la base de datos.
 * 
 * @author hhade
 */
public class Lugar {
    
    private String nombre;
    
    private int x;
    
    private int y;
    
    /**
     * Crea un objeto lugar con su posición en el restaurante, este objeto solo
     * debería ser creado por una clase LugarImagen, y hacer parte del ella como 
     * una sola entidad
     * @param x Posición horizontal del lugar
     * @param y Posición vertical del lugar
     * @param nombre Nombre del lugar que representa
     */
    public Lugar(int x, int y, String nombre){
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }
    
    public Lugar(){        }
    
    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

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
    
    
    
}
