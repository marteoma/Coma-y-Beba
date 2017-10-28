/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.gui;

import com.c2m.globant.comaybeba.objects.Lugar;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 * Espacios del restaurante que afectan el mapa pero no son relevantes para la
 * aplicación
 *
 * @author hhade
 */
public class LugarImagen extends Image {

    private String nombre;

    private Lugar lugar;

    public LugarImagen(String nombre) {
        super();
        this.nombre = nombre;
        lugar = new Lugar(0, 0);
    }
    
    public LugarImagen(String nombre, Lugar lugar){
        super();
        this.nombre = nombre;
        this.lugar = lugar;
        this.setLocation(lugar.getX(), lugar.getY());
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon Img = new ImageIcon(getClass().getResource("/general.png"));
        g.drawImage(Img.getImage(), 0, 0, 50, 50, null);
        g.drawString(getNombre(), 10, 10);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        nuevo_X = (this.getLocation().x);
        nuevo_Y = (this.getLocation().y);
        lugar.setX(nuevo_X);
        lugar.setY(nuevo_Y);
        this.setLocation(nuevo_X, nuevo_Y);
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
     * @return the lugar
     */
    public Lugar getLugar() {
        return lugar;
    }

    /**
     * @param lugar the lugar to set
     */
    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}
