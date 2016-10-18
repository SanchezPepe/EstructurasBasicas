/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema21;

/**
 *
 * @author hca
 */
public class Foto extends Archivo{
    
    private double resolucion;
    
    public Foto(){
        super();
    }
    
    public Foto(double tam, String nom, String dueño, String fecha, double res){
        super(tam, nom, dueño, fecha);
        this.resolucion = res;
    }
    
}
