/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Iterator;
import listas.ListaDesordenada;
import listas.ListaDoble;
import listas.ListaOrdenada;

/**
 *
 * @author hca
 */
public class Materia{
    
    private String nom;
    private ListaOrdenada<Persona> lisA;
    private ListaDesordenada<Persona> lisL;
    
    public Materia(){
        lisA = new ListaOrdenada();
        lisL = new ListaDesordenada();
    }
    
    public Materia(String nom){
        this();
        this.nom = nom;
    }
    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        cad.append(nom).append("\n");
        cad.append("\nLista de alumnos: ").append(lisA.toString());
        return cad.toString();
    }
    
    public boolean altaAlumno(String nom){
        boolean resp = false;
        Persona p = new Persona(nom);
        if(!lisA.contiene(p)){
            lisA.agrega(p);
            resp = true;
        }
        return resp;
    }
    
    public Persona bajaAlumno(String nom){
        Persona res = null;
        Persona aux = new Persona(nom);
        if(lisA.contiene(aux))
            res = lisA.quita(aux);
        return res;
    }
    
    public double calcProm(){
        double suma = 0;
        int cont = 0;
        for(Persona p: lisA){
            p.getProm();
            cont++;
        }
        try{
            suma = suma/cont;
        }catch(Exception e){
            suma = -1;
        }
        return suma;
    }
    
    public double consProm(String nom){
        return consProm(new Persona(nom), lisA.iterator());
    }
    
    private double consProm(Persona p, Iterator<Persona> it){
        if(it.hasNext())
            return -1;
        else{
            Persona temp;
            temp = it.next();
            if(temp.equals(p))
                return temp.getProm();
            else
                return consProm(p, it);
        }
    }
    
    public boolean consAlumnos(int n, double prom){
        boolean resp;
        int cont = 0;
        Iterator<Persona> it = lisA.iterator();
        while(cont < n && it.hasNext())
            if(it.next().getProm() > prom)
                cont++;
        resp = cont < n;
        return resp;
    }
    
    
}