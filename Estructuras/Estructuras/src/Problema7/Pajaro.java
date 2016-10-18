/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema7;

/**
 *
 * @author José Sánchez
 */
public class Pajaro implements ObjVolador{
    
    private String nombre;
    private static int serie = 100;
    private String habitat;
    private int clave;
    
    public Pajaro(){
        this.clave = serie++;
    }
    
    public Pajaro(String nom){
        this();
        this.nombre = nom;
    }
    
    public void setHabitat(String h){
        this.habitat = h;
    }
    
    public void despega(){
        System.out.print("Utlilza sus alas");
    }
    
    public void aterriza(){
        System.out.print("Tambien utliza las alas");
    }
    
    public void seDesplaza(){
        System.out.print("En grupos");
    }
    
    public String toString(){
        return "Ave: " + this.nombre + ", habitat: " + this.habitat;
    }
}    
    

