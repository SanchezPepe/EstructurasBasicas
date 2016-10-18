/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

/**
 *
 * @author jsanchezagu
 */
public class Kinder extends Alumno {
    
    private char nivel;
    
    public Kinder(){
        super();
    }
    
    public Kinder(String nombre, String curp, String fecha, String madre, String padre, String tutor, char nivel){
        super(nombre, curp, fecha, madre, padre, tutor);
        this.nivel = nivel;
    }

    public char getNivel() {
        return nivel;
    }
    
    public String toString(){
        return "Alumno de KINDER: " + super.toString() + ", Nivel: " + this.nivel;
    }
    
}
