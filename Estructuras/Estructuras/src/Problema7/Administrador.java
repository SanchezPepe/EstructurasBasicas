/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema7;

import java.util.ArrayList;

/**
 *
 * @author José Sánchez
 */
public class Administrador {
    
    private String nombre;
    private ArrayList <Pajaro> aves;
    private ArrayList <Avion> flota;
    
    public Administrador(){
        aves = new ArrayList <Pajaro>();
        flota = new ArrayList <Avion>();
    }
    
    public Administrador(String nom){
        this();
        this.nombre = nom;
    }

    public ArrayList<Pajaro> getAves() {
        return aves;
    }

    public ArrayList<Avion> getFlota() {
        return flota;
    }
    
    public boolean altaAve(String nom){
        Pajaro a = new Pajaro(nom);
        return aves.add(a);
    }
    
    public boolean altaAvion(String mod){
        Avion a = new Avion(mod);
        return flota.add(a);
    }
}
