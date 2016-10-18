/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EiemploConjunto;

import conjuntos.ConjuntoA;
import java.util.Iterator;

/**
 *
 * @author hca
 */
public class EjemUsoConj {
    
    public static void main(String[] args) {
        ConjuntoA <String> dias = new ConjuntoA();
        dias.agrega("lunes");
        dias.agrega("martes");
        dias.agrega("miercoles");
        dias.agrega("jueves");
        dias.agrega("viernes");
        dias.agrega("sabado");
        
        Iterator <String> it = dias.iterator();
        if(it.hasNext())
            System.out.println(it.next().toUpperCase());
        for(String s: dias)
            System.out.print(s.toUpperCase() + " ");
        
    }
    
}
