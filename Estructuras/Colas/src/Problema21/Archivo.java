/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema21;

import java.io.Serializable;

/**
 *
 * @author hca
 */
public class Archivo implements Serializable{
    
    protected double tamaño;
    protected String nombre, dueño, fecha;
    
    public Archivo(){
        
    }
    
    public Archivo(double tam, String nom, String dueño, String fecha){
        this.tamaño = tam;
        this.nombre = nom;
        this.dueño = dueño;
        this.fecha = fecha;
    }
    
}
