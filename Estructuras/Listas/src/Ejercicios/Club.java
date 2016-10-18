/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Iterator;
import listas.ListaOrdenada;

/**
 *
 * @author hca
 */
public class Club {
    
    private String nomClub;
    private ListaOrdenada <Persona> lisSoc;
    
    public Club(){
        lisSoc = new ListaOrdenada();
    }
    
    public Club(String nom){
        this();
        nomClub = nom;
    }
    
    public String generaRepSoc(){
        return lisSoc.toString();
    }
    
    public String consultaDatosSoc(){
        String res;
        Persona temp = null;
        Persona aux = new Persona();
        Iterator <Persona> it = lisSoc.iterator();
        boolean resp = true;
        while(it.hasNext() && resp){
            temp = it.next();
            if(temp.compareTo(aux) >= 0)
                resp = false;
        }
        if(!resp && temp.equals(aux))
            res = temp.toString();
        else
            res = null;
        return res;
    }   
    
    public boolean altaSocio(){
        boolean resp = false;
        Persona nuevo = new Persona();
        if(!lisSoc.contiene(nuevo)){
            resp = true;
            lisSoc.agrega(nuevo);
        }
        return resp;
    }
    
    public boolean quitaSocio(int clave){
        boolean resp = false;
        Persona aux = new Persona();
        aux.setNum(clave);
        resp = lisSoc.quita(aux) != null;
        return resp;
    }
    
    //TAREA 37, 39 Y 40
    //PROBAR 38
}
