/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema17;

import Problema14.CuentaElem;
import pilas.PilaA;

/**
 *
 * @author jsanchezagu
 */
public class Main {
    
    public static void main(String[] args) {
        
        PilaA <Integer> p = new PilaA(20);
        p.push(3);
        p.push(9);
        p.push(1);
        p.push(2);
        p.push(2);
        p.push(2);
        
        System.out.println(CuentaElem.numElem(p));
        
        Repetidos.quitaRep(p);
        
        System.out.println(CuentaElem.numElem(p));
        
    }
    
}
