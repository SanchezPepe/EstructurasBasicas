/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema6;

/**
 *
 * @author José Sánchez
 */
public class Operario extends Empleado{
    
    private int horasExtras;
    private double precioHE;
    
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
    
    @Override
    public double calculaSalario(){
        double sal = this.sueldoBase + (this.sueldoBase * (prestac/100)) - (this.sueldoBase * (deduc/100));
        sal = sal + this.horasExtras * precioHE;
        return sal;
    }   
}
