/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author hca
 */
public class Persona implements Comparable<Persona> {
    
    protected static int serie = 1;
    protected int num;
    protected String nom;
    
    public Persona(){
        num = serie++;
    }
    public Persona(String nom){
        this();
        this.nom = nom;
    }
    
    public static int getSerie() {
        return serie;
    }

    public static void setSerie(int serie) {
        Persona.serie = serie;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.num != other.num) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public int compareTo(Persona t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double getProm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
    
}
