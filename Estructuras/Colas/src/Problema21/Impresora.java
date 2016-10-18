/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema21;

import colas.ColaA;
import java.util.Scanner;

/**
 *
 * @author hca
 */
public class Impresora {
    
    private String marca;
    private ColaA <Archivo> pendientes;
    private Archivo aux;
    
    
    public Impresora(){
        pendientes = new ColaA <Archivo>();
    }
    
    public Impresora(String marca){
        this();
        this.marca = marca;
    }
}
