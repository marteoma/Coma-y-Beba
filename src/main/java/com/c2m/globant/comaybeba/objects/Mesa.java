/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

/**
 * Representa la mesa que se incluirá en la base de datos.
 * 
 * @author hhade
 */
public class Mesa {
    
    private int capacidad;
    
    private int x;
    
    private int y;
    
    private int id;
    
    private int count;

    /**
     * Crea un objeto mesa con su posición en el restaurante, este objeto solo
     * debería ser creado por una clase MesaImagen, y hacer parte del ella como 
     * una sola entidad
     * @param capacidad Capacidad de la mesa
     * @param x Posición horizontal de la mesa
     * @param y Posición vertical de la mesa
     * @param id Identificación de la mesa
     * @param count Cantidad de veces que se ha reservado esta mesa
     */
    public Mesa(int capacidad, int x, int y, int id, int count){
        this.capacidad = capacidad;
        this.x = x;
        this.y = y;
        this.id = id;
        this.count = count;
    }
    
    public Mesa(){}
    
    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    @Override
    public String toString(){
        return "Mesa " + id;
    }

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
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    
    
}
