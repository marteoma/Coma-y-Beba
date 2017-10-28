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
    
    private int id;
    
    
    /**
     * Crea una Mesa a partir de una capacidad y una identificacion
     * @param capacidad Capacidad de la mesa
     * @param id Identificacion de la mesa
     */
    public MesaImagen(int capacidad, int id){
        super();
        this.id = id;
        mesa = new Mesa(capacidad, 0, 0);
    }
    
    public MesaImagen(int id, Mesa mesa){
        super();
        this.mesa = mesa;
        this.id = id;
        this.setLocation(mesa.getX(), mesa.getY());
    }
    
    
    
    @Override
    public void paint(Graphics g){
        ImageIcon Img = new ImageIcon(getClass().getResource("/mesa.png"));
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);        
        g.drawString(String.valueOf(mesa.getCapacidad()), 10, 10);
        g.drawString("Mesa " + getId(), 10, 50);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        nuevo_X = (this.getLocation().x);
        nuevo_Y = (this.getLocation().y);
        mesa.setX(nuevo_X);
        mesa.setY(nuevo_Y);
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
}
