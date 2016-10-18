/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema4;

import java.util.ArrayList;

/**
 *
 * @author jsanchezagu
 */
public class Empresa {
    
    private String nombre, direccion, dueño;
    private ArrayList <Administrativo> adm;
    private ArrayList <Operario> ope;
    
    public Empresa(){
        adm = new ArrayList <Administrativo>();
        ope = new ArrayList <Operario>();
        
    }
    
    public Empresa(String nombre, String direccion, String dueño){
        this();
        this.nombre = nombre;
        this.dueño = dueño;
        this.direccion = direccion;
    }
    
    public boolean altaAdm(String nombre, double sueldo, String dep, String tel){
        Administrativo admin = new Administrativo(nombre, sueldo, dep, tel);
        return adm.add(admin);
    }
            
    public boolean altaOper(String nombre, double salario, int horas){
        Operario oper = new Operario(nombre, salario, horas);
        return ope.add(oper);
    }
    
    public String generaRep(){
        StringBuilder cad = new StringBuilder("Empleados: ");
        if(!adm.isEmpty()){
            System.out.print("Administrativos: ");
            for(int i = 0; i < adm.size(); i++)
                cad.append("\n" + adm.get(i).toString());
        }    
        if(!ope.isEmpty()){
            System.out.print("Operarios: ");
            for(int i = 0; i < ope.size(); i++)
                cad.append("\n" + ope.get(i).toString());
        }    
        return cad.toString();
    }
}
