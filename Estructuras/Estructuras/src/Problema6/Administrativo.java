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
public class Administrativo extends Empleado {
    
    private String departamento;
    private String telefono;
    
    public Administrativo(){
        super();
    }
    
    public Administrativo(String nombre, double sueldo, String dep, String tel){
        super(nombre, sueldo);
        this.departamento = dep;
        this.telefono = tel;
    }
    
    public double calculaSalario(){
        double sal = this.sueldoBase + (this.sueldoBase * (prestac/100)) - (this.sueldoBase * (deduc/100));
        return sal;
    }
      
    public String toString(){
        return super.toString() + " " + this.departamento + ", " + this.telefono;
    }
       
}
