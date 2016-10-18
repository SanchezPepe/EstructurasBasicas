/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema6;

import java.util.Objects;

/**
 *
 * @author José Sánchez
 */
public abstract class Empleado {
    
    protected static int serie = 100;
    protected int claveEmpleado;
    protected String nombreEmpleado;
    protected double sueldoBase;
    protected double prestac;
    protected double deduc;
    
    public Empleado(){
        claveEmpleado = serie;
        serie++;
    }
    
    public Empleado(String nombre, double sueldo) {
        this();
        this.nombreEmpleado = nombre;
        this.sueldoBase = sueldo;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombreEmpleado + ", Serie: " + serie + ", Clave Empleado: " + claveEmpleado + ", Sueldo Base: " + sueldoBase;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (this.serie != other.serie) {
            return false;
        }
        if (this.claveEmpleado != other.claveEmpleado) {
            return false;
        }
        if (Double.doubleToLongBits(this.sueldoBase) != Double.doubleToLongBits(other.sueldoBase)) {
            return false;
        }
        if (!Objects.equals(this.nombreEmpleado, other.nombreEmpleado)) {
            return false;
        }
        return true;
    }
    //Método abstracto
    public abstract double calculaSalario();

    
}
