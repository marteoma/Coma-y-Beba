/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

/**
 *
 * @author hhade
 */
public class Lugar {
    private int x;
    
    private int y;
    
    /**
     * Crea un objeto lugar con su posición en el restaurante, este objeto solo
     * debería ser creado por una clase LugarImagen, y hacer parte del ella como 
     * una sola entidad
     * @param x Posición horizontal del lugar
     * @param y Posición vertical del lugar
     */
    public Lugar(int x, int y){
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
    
    
    
}
