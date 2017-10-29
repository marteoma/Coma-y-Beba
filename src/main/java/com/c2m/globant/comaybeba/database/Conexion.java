/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.database;

import com.firebase.client.Firebase;

/**
 * Conexión con la base de datos.
 * 
 * @author hhade
 */
public final class Conexion {
    private final Firebase ref = new Firebase("https://coma-y-beba-con-genoveba.firebaseio.com/");
    
    private static Conexion instance = null;
    
    private Conexion() {
      // Exists only to defeat instantiation.
    }
    
    /**
     * Obtiene la instancia de la conexión
     * @return 
     */
   public static Conexion getInstance() {
      if(instance == null) {
         instance = new Conexion();
      }
      return instance;
   }
   
   public Firebase getRef(){
       return ref;
   }
}
