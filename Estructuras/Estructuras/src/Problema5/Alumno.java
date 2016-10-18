/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

import java.util.Objects;

/**
 *
 * @author jsanchezagu
 */
public class Alumno {
    
    private String nombre, curp, fecha, madre, padre, tutor;
    
    public Alumno(){
        
    }
    
    public Alumno(String nombre, String curp, String fecha, String madre, String padre, String tutor){
        this();
        this.nombre = nombre;
        this.curp = curp;
        this.fecha = fecha;
        this.madre = madre;
        this.padre = padre;
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCurp() {
        return curp;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMadre() {
        return madre;
    }

    public String getPadre() {
        return padre;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", CURP: " + curp + ", Tutor: " + tutor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.curp, other.curp)) {
            return false;
        }
        return true;
    }

}
