package Problema24;

import java.util.ArrayList;

public class Alumno{
    
    private String nom;
    private boolean ing;
    private boolean lic;
    private int clave;
    private ArrayList <Double> cal;
    
    public Alumno(){
        cal = new ArrayList <Double>();
    }
    
    public Alumno(int clave){
        this.clave = clave;
    }
   
    public Alumno(String nom, boolean ing, boolean lic, int clave){
        this();
        this.nom = nom;
        this.ing = ing;
        this.lic = lic;
        this.clave = clave;
    }
    
    public void agregaCal(double calif){
        this.cal.add(calif);
    }
    
    public double calcProm(){
        int i;
        double suma = 0;
        for(i = 0; i < cal.size(); i++){
            suma = suma + cal.get(i);
        }
        return suma/cal.size()-1;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isIng() {
        return ing;
    }

    public void setIng(boolean ing) {
        this.ing = ing;
    }

    public boolean isLic() {
        return lic;
    }

    public void setLic(boolean lic) {
        this.lic = lic;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
	
	
}
