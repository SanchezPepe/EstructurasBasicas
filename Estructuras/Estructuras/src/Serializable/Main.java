/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

/**
 *
 * @author José Sánchez
 */
public class Main {
    public static void main(String[] args) {
        Alumno a = new Alumno("lol");
        Serializadora ser = new Serializadora();
        ser.escribeObj(a);
        
        //Alumno al = null;
        //Serializadora ser = new Serializadora();
        //al = (Alumno)ser.leeObj("objecto.dat");
        //System.out.println(al.getNom());
    }
}
