/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

import java.io.FileOutputStream;

/**
 *
 * @author José Sánchez
 */
public class Alumno implements java.io.Serializable{
    
    private String nom;
    
    public Alumno(){
        
    }
    
    public Alumno(String nom){
        this.nom = nom;
    }
    
    public String getNom(){
        return this.nom;
    }
    
    public void setNom(String nuevo){
        this.nom = nuevo;
    }
    
    public String toString(){
        return "Alumno: " + this.nom;
    }
}    
 