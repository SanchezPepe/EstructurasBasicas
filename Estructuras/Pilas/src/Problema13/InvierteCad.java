/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema13;

import pilas.PilaA;
import pilas.PilaADT;

/**
 *
 * @author José Sánchez
 */
public class InvierteCad {
    
    private String cadenaIn;
    private String cadenaInv;
    
    public InvierteCad(){
    }
    
    public InvierteCad(String in){
        this.cadenaIn = in;
    }
    
    public void setCadena(String cad){
        this.cadenaIn = cad;
    }
    
    public String getCadena(){
        return this.cadenaIn;
    }
    
    public String getCadenaInv(){
        return this.cadenaInv;
    }
    
    public void invierte(){
        int tam = this.cadenaIn.length();
        StringBuilder cad = new StringBuilder();
        if(tam > 0){    
            PilaA <Character> palab = new PilaA(100);
            for(int i = 0; i < tam; i++)
                palab.push(this.cadenaIn.charAt(i));
            while(!palab.isEmpty()){
                cad.append(palab.pop());
            }
        }
        this.cadenaInv = cad.toString();
    }    
    
}
