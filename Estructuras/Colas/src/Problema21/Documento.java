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
public class Documento extends Archivo{
    
    private String tipoPro;
    
    public Documento(){
        super();
    }
    
    public Documento(double tam, String nom, String dueño, String fecha, String tipo){
        super(tam, nom, dueño, fecha);
        this.tipoPro = tipo;
    }
}
