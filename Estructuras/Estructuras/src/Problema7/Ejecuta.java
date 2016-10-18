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
public class Ejecuta {
    
    public static void main(String[] args) {
        
        Administrador ad = new Administrador("NASA");
        ad.altaAve("Aguila");
        ad.altaAve("Pichón");
        ad.altaAve("Paloma");
        
        ad.altaAvion("AIRBUS");
        ad.altaAvion("AVIONETA");
        ad.altaAvion("JET");
       
        System.out.println(ad.getFlota());
        System.out.println(ad.getAves());
        System.out.println(ad.getFlota().get(1).toString());
    }
    
}
