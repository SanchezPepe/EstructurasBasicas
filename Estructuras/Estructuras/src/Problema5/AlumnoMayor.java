/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

import java.util.ArrayList;

/**
 *
 * @author jsanchezagu
 */
public class AlumnoMayor extends Alumno{
    
    private String proced, grado;
    private double prom;
    private ArrayList <Double> calif;
    
    public AlumnoMayor(){
        super();
    }
    
    public AlumnoMayor(String nombre, String curp, String fecha, String madre, String padre, String tutor, String proced, String grado){
        super(nombre, curp, fecha, madre, padre, tutor);
        this.proced = proced;
        this.grado = grado;
        calif = new ArrayList<Double>();
    }

    public String getProced() {
        return proced;
    }

    public String getGrado() {
        return grado;
    }

    public double getProm() {
        return prom;
    }

    public ArrayList<Double> getCalif() {
        return calif;
    }
    
    public String toString(){
        return super.toString() + ", Grado: " + this.grado;
    }
}
