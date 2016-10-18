/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema7;

/**
 *
 * @author José Sánchez
 */
public class Avion implements ObjVolador{
    
    private String modeloAv;
    private static int serie = 1000;
    private int claveAv;
    
    public Avion(){
        this.claveAv = serie++;
    }
    
    public Avion(String model){
        this();
        this.modeloAv = model;
    }
    
    public void despega(){
        System.out.print("Usa motores y turbinas");
    }
    
    public void aterriza(){
        System.out.print("Alerones, llantas, y frenado");
    }
    
    public void seDesplaza(){
        System.out.print("Al 10,000 pies de altura");
    }
    
    public String toString(){
        return "Avión no. " + this.claveAv + ", Modelo : " + this.modeloAv;
    }
    
}
