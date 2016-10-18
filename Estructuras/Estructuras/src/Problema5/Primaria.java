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
public class Primaria extends AlumnoMayor{
    
    
    public Primaria(){
        super();
    }
    
    public Primaria(String nombre, String curp, String fecha, String madre, String padre, String tutor, String proced, String grado){
        super(nombre, curp, fecha, madre, padre, tutor, proced, grado);
    }
    
    public String toString(){
        return "Alumno de PRIMARIA: " + super.toString();
    }
    
}
