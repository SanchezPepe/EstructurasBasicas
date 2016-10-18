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
public class Secundaria extends AlumnoMayor {
    
    private String actividad;
    
    public Secundaria(){
        super();
    }
    
    public Secundaria(String nombre, String curp, String fecha, String madre, String padre, String tutor, String proced, String grado, String actividad){
        super(nombre, curp, fecha, madre, padre, tutor, proced, grado);
        this.actividad = actividad;
    }    

    public String getActividad() {
        return actividad;
    }
    
    public String toString(){
        return "Alumno de SECUNDARIA: " +  super.toString() + ", Actividad: " + this.actividad;
    }
}
