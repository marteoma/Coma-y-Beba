/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.gui;

/**
 * Esta clase representa un objeto en el mapa del restaurante. Se usa para la
 * creación de las mesas y los lugares generales. No debería ser instanciada
 * nunca.
 *
 * @author hhade
 */
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Image extends javax.swing.JPanel implements MouseListener, MouseMotionListener {

    /**
     * variable que sirve para calcular el movimiento del objeto
     */
    private Point start_loc;
    /**
     * variable que sirve para calcular el movimiento del objeto
     */
    private Point start_drag;
    /**
     * variable que sirve para calcular el movimiento del objeto
     */
    private Point offset;
    /**
     * variables auxiliares para el desplazamiento del objeto
     */
    protected int nuevo_X = 1;
    protected int nuevo_Y = 1;

    protected Image() {
        this.setSize(50, 50);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);        
    }

    @Override
    public void paint(Graphics g) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.start_drag = getScreenLocation(e);
        this.start_loc = this.getLocation();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point current = this.getScreenLocation(e);
        offset = new Point((int) current.getX() - (int) start_drag.getX(), (int) current.getY() - (int) start_drag.getY());
        Point new_location = new Point((int) (this.start_loc.getX() + offset.getX()), (int) (this.start_loc.getY() + offset.getY()));
        this.setLocation(new_location);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        nuevo_X = (this.getLocation().x);
        nuevo_Y = (this.getLocation().y);
        this.setLocation(nuevo_X, nuevo_Y);
    }

    /**
     * 99 * metodo para obtener la posicion del frame en la pantalla 100
     *
     *
     * @param MouseEvent evt 101
     */
    private Point getScreenLocation(MouseEvent evt) {
        Point cursor = evt.getPoint();
        Point target_location = this.getLocationOnScreen();
        return new Point((int) (target_location.getX() + cursor.getX()),
                (int) (target_location.getY() + cursor.getY()));

    }
}
