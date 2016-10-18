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
public class Preparatoria extends AlumnoMayor {
    
    private char area;
    
    public Preparatoria(){
        super();
    }
    
    public Preparatoria(String nombre, String curp, String fecha, String madre, String padre, String tutor, String proced, String grado, char area){
        super(nombre, curp, fecha, madre, padre, tutor, proced, grado);
        this.area = area; 
    }    

    public char getArea() {
        return area;
    }
    
    public String toString(){
        return "Alumno de PREPARATORIA: " + super.toString() + ", Area de especialización: " + this.area;
    }
}
