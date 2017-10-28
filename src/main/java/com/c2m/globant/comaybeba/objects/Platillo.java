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
    
    private boolean estado;
       
    public Platillo(String name , String descr, int precio, boolean estado){
        nombre = name;
        descripcion = descr;
        this.precio = precio;
        this.estado = estado;
    }
    
    public Platillo(){}

    @Override
    public String toString(){
        return nombre;
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
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    public String ToString(){
        if(estado == true){
             return nombre + "- Disponible";   
        }else{
             return nombre+ "- No Disponible";   
        }
    
    }
}
