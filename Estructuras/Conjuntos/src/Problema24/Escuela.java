package Problema24;

import conjuntos.ConjuntoA;
import conjuntos.ConjuntoADT;
import java.util.Iterator;

public class Escuela {
	
    private String nombre;
    private ConjuntoA <Alumno> ing;
    private ConjuntoA <Alumno> lic;
        
        
    public Escuela(){
	ing = new ConjuntoA();
        lic = new ConjuntoA();
    }
        
    public Escuela(String nom){
        this();
        this.nombre = nom;
    }
	
    public void altaAlumno(String nom, boolean ing, boolean lic, int clave){
        Alumno a = new Alumno(nom, ing, lic, clave);
        if(ing == true)
            this.ing.agrega(a);
        if(lic == true)
            this.lic.agrega(a);
    }
    
    public String quitaAlumno(int clave){
        Alumno aux = new Alumno(clave);
        String resp;
        Alumno elimI, elimL;
        elimI = ing.quita(aux);
        elimL = lic.quita(aux);
        if(elimL != null)
            resp = elimI.toString();
        else
            if(elimL != null)
                resp = elimL.toString();
            else
                resp = "\nError en la clave";
        return resp;
    }
    
    public double calPromIng(){
        double suma = 0;
        int n = ing.getCardinalidad();
        if(n > 0){
            for(Alumno a: ing)
                suma = suma + a.calcProm();
            suma = suma/n;
        }
        return suma;
    }
    
	
}