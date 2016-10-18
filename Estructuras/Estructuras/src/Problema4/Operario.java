/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4;

/**
 *
 * @author José Sánchez
 */
public class Operario extends Empleado{
    
    private int horasExtras;
    
    public Operario(){
        super();
    }
    
    public Operario(String nombre, double salario, int horas){
        super(nombre, salario);
        this.horasExtras = horas;
    }
    
    public String toString(){
        return super.toString() + ", Horas extras: " + this.horasExtras;
    }
    
    public double calculaSalario(double prestac, double deduc, double precioHE){
        double sal = super.calculaSalario(prestac, deduc);
        sal = sal + this.horasExtras * precioHE;
        return sal;
    }
            
}
