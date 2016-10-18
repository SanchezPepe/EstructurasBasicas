/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema24B;

import java.util.ArrayList;

/**
 *
 * @author José Sánchez
 */
public class Alumno {
    
    private String nombre;
    private int clave;
    private char prog;
    private ArrayList <Double> cal;
    
    public Alumno(){
        cal = new ArrayList <Double>();
    }
    
    public Alumno(String nom, int clave, char prog){
        this.nombre = nom;
        this.clave = clave;
        this.prog = prog;
        cal = new ArrayList <Double>();
    }
    
    public double prom(){
        double resp = 0;
        if(!cal.isEmpty()){
            int i;
            for(i = 0; i < cal.size(); i++)
                resp = resp + cal.get(i);
            resp = resp/i;
        }
        return resp;           
    }
    
    public int getClave(){
        return this.clave;
    }
    
    public String toString(){
        return "[" + this.nombre + ", " + this.clave + "]";
    }
}
