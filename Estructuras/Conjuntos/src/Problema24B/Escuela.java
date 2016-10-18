/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema24B;

import conjuntos.ConjuntoA;
import conjuntos.ConjuntoADT;
import java.util.Iterator;

/**
 *
 * @author José Sánchez
 */
public class Escuela {
    
    private String nombre;
    private int pob;
    private ConjuntoA <Alumno> lic;
    private ConjuntoA <Alumno> ing;
    
    public Escuela(){
        lic = new ConjuntoA <Alumno>();
        ing = new ConjuntoA <Alumno>();
        pob = 0;
    }
    
    public Escuela(String nombre){
        this();
        this.nombre = nombre;
    }
    
    public int getPob(){
        return this.pob;
    }
    
    public boolean agregaAl(String nombre, int clave, char prog){
        boolean resp = false;
        Alumno aux = new Alumno(nombre, clave, prog);
        if(prog == 'I')
            resp = ing.agrega(aux);
        else
            resp = lic.agrega(aux);
        if(resp)
            pob++;
        return resp;
    }
    
    public boolean quitaAl(int clave){
        boolean resp = false;
        Iterator <Alumno> it = ing.iterator();
        Alumno aux = null;
        while(it.hasNext() && !resp){
            aux = it.next();
            if(aux.getClave() == clave){
                resp = true;
                ing.quita(aux);
            }   
        }
        it = lic.iterator();
        while(!resp && it.hasNext()){
            aux = it.next();
            if(aux.getClave() == clave){
                resp = true;
                lic.quita(aux);
            }   
        }
        if(resp)
            pob--;
        return resp;
    }
    
    public ConjuntoADT juntaTodo(){
        ConjuntoADT <Alumno> aux = new ConjuntoA <Alumno>();
        aux = ing.union(lic);
        return aux;
    }
    
    public static void main(String[] args) {
        Escuela ITAM = new Escuela("ITAM");
        ITAM.agregaAl("Jose", 156190, 'I');
        ITAM.agregaAl("Ana Paula", 156403, 'L');
        System.out.println("Población estudiantil: " + ITAM.getPob());
        //ITAM.quitaAl(156403);
        System.out.println("Población estudiantil: " + ITAM.getPob());
        System.out.println(ITAM.juntaTodo());
        
    }
}
