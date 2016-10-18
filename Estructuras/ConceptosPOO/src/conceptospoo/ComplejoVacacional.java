/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptospoo;

public class ComplejoVacacional {
    private String nombre;
    private Rectangulo albs[];
    private int numAlbs;
    private final int MAX = 10;

    public ComplejoVacacional() {
        this.numAlbs = 0;
        this.albs = new Rectangulo[MAX];
    }

    public ComplejoVacacional(String nombre) {
        this();
        this.nombre = nombre;
        this.numAlbs = numAlbs;
    }

    public int getNumAlbs() {
        return numAlbs;
    }
    
    public boolean agregaAlberca(double lado1, double lado2){
        boolean resp = false;
        if(this.numAlbs < 10){
            Rectangulo rec = new Rectangulo(lado1, lado2);
            this.albs[this.numAlbs] = rec;
            this.numAlbs++;
            resp = true;
        }
        return resp;
    }
    
    public double totalLona(){
        double suma = 0;
        for(int i = 0; i <= numAlbs; i++)
            suma = suma + this.albs[i].calculaArea();
        return suma;
    }
    
    public double totalCerca(){
        double cerca = 0;
        for(int i = 0; i <= numAlbs; i++)
            cerca = cerca  + this.albs[i].calculaPerimetro();
        return cerca;
    }
    
    public static void main(String[] args) {
        
        ComplejoVacacional c1 = new ComplejoVacacional("ITAM");
        
        c1.agregaAlberca(5, 7);
        c1.agregaAlberca(8, 2);
        c1.agregaAlberca(2, 3);
        
        System.out.print("Total albercas: " + c1.getNumAlbs());
        System.out.print("Metros de lona: " + c1.totalLona());
        System.out.print("Metros de cerca: " + c1.totalCerca());
        
        
    }
}
