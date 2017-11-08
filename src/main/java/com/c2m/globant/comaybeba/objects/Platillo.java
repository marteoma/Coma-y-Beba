/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.objects;

/**
 * Representación de un platillo incluido en el menú
 * @author hhade
 */
public class Platillo {
    
    private String nombre;
    
    private String descripcion;
    
    private int precio;
    
    private boolean activo;
    
    private int count;
       
    public Platillo(String name , String descr, int precio, boolean estado, int count){
        nombre = name;
        descripcion = descr;
        this.precio = precio;
        this.activo = estado;
        this.count = count;
    }
    
    public Platillo(){}
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Platillo){
            Platillo aux = (Platillo)o;
            return aux.getNombre().equals(this.getNombre());
        }
        return false;
    }
    
    /**
     * Cambia el estado de este platillo.
     * Si está activo lo pone inactivo, si está inactivo lo pone activo.
     */
    public void cambiarEstado()
    {
        activo = !activo;
    }
    
    @Override
    public String toString(){
        return nombre + " - " + (activo == true ? "Activo" : "Inactivo");
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

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return the activo
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }


    public String ToString(){
        if(activo == true){
             return nombre + "- Disponible";   
        }else{
             return nombre+ "- No Disponible";   
        }
    
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
