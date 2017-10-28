/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.gui;

import com.c2m.globant.comaybeba.objects.Mesa;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 * Objeto sobre el cual se hace una reserva
 * @author hhade
 */
public class MesaImagen extends Image{
            
    private Mesa mesa;
    
    private String claveFirebase = null;
        
    
    /**
     * Crea una Mesa a partir de una capacidad y una identificacion
     * @param capacidad Capacidad de la mesa
     * @param id Identificación de la mesa
     */
    public MesaImagen(int capacidad, int id){
        super();
        mesa = new Mesa(capacidad, 0, 0, id);
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof MesaImagen)
            return (claveFirebase == null ? ((MesaImagen) o).getClaveFirebase() == null :
                    claveFirebase.equals(((MesaImagen) o).getClaveFirebase()));
        return false;
    }
    
    public MesaImagen(Mesa mesa){
        super();
        this.mesa = mesa;
        this.setLocation(mesa.getX(), mesa.getY());
    }
    
    
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(getClass().getResource("/mesa.png"));
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);        
        g.drawString(String.valueOf(getMesa().getCapacidad()), 10, 10);
        g.drawString("Mesa " + String.valueOf(getMesa().getId()), 10, 40);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        nuevo_X = (this.getLocation().x);
        nuevo_Y = (this.getLocation().y);
        getMesa().setX(nuevo_X);
        getMesa().setY(nuevo_Y);
        this.setLocation(nuevo_X, nuevo_Y);
    }

    /**
     * @return the mesa
     */
    public Mesa getMesa() {
        return mesa;
    }

    /**
     * @param mesa the mesa to set
     */
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    /**
     * @return the claveFirebase
     */
    public String getClaveFirebase() {
        return claveFirebase;
    }

    /**
     * @param claveFirebase the claveFirebase to set
     */
    public void setClaveFirebase(String claveFirebase) {
        this.claveFirebase = claveFirebase;
    }
}
