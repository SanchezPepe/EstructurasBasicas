/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Iterator;
import listas.ListaOrdenada;
/**
 *
 * @author hca
 */
public class UneListas{
    
    public static ListaOrdenada<Persona> une(ListaOrdenada<Persona> l1, ListaOrdenada <Persona> l2){
        ListaOrdenada<Persona> nueva;
        if(l1.equals(l2)){
            nueva = l1;
            l2 = null;
        }
        else{
            nueva = new ListaOrdenada();
            une(l1.iterator(), l2.iterator(), nueva);
        }
        return nueva;
    }
    
    private static void une(Iterator<Persona> it1, Iterator<Persona> it2, ListaOrdenada<Persona> nueva){
        if(it1.hasNext()){
            nueva.agrega(it1.next());
            une(it1,it2, nueva);
        }
        if(it2.hasNext()){
            nueva.agrega(it2.next());
            une(it1, it2, nueva);        
        }    
    }
    
}
