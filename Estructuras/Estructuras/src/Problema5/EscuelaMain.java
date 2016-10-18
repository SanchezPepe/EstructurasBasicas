/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problema5;

/**
 *
 * @author jsanchezagu
 */
public class EscuelaMain {
    
    public static void main(String[] args) {
        Escuela lol = new Escuela("ITAM");
        
        lol.almacenaAlum("Miguel", "FARG836738", "01/08/2301", "Rosario Lopez" , "Miguel Ruiz", "Ambos");
        lol.almacenaAlum("Andrea", "TARG836738", "01/08/2340", "Rosario Lopez" , "Miguel Ruiz", "Ambos");
        lol.almacenaAlum("Jose", "JARG836738", "01/08/2340", "Rosario Lopez" , "Miguel Ruiz", "Ambos");
        lol.almacenaAlum("Sergio", "PARG836738", "01/08/2020", "Rosario Lopez" , "Miguel Ruiz", "Ambos");
        
        System.out.println(lol.generaReporte());
       
    }
    
}

