/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema27;

/**
 *
 * @author José Sánchez
 */
public class ArregloGenerico <T extends Comparable <T>>{
   
    private T arre[];
    private int tam;
    private final int MAX = 10;
    
    public ArregloGenerico(){
        arre = (T[]) new Comparable[MAX];
        tam = 0;
    }
    
    public boolean altaD(T dato){
        boolean resp = false;
        if(tam < arre.length){
            arre[tam] = dato;
            resp = true;
            tam++;
        }
        return resp;
    }
    
    
    
    
    public int busqSec(T dato){
        if(tam == 0)
            return -1;
        else
            return busqSec(dato, 0);  
    }
    
    private int busqSec(T dato, int i){
        if(i == tam || arre[i].compareTo(dato) > 0)
            return -i * (i + 1);    //NO ESTÁ
        else
            if(arre[i].equals(dato))
                return i;           // SI ESTÁ
            else
                return busqSec(dato, i+1);
    }
    
    public int busqBin(T dato){
        return busqBin(0, tam-1, dato);
    }
    
    private int busqBin(int izq, int der, T dato){
        if(izq > der)
            return -1 * (izq + 1);
        else{
            int cen = (izq + der)/2;
            if(arre[cen].equals(dato))
                return cen;
            else
                if(arre[cen].compareTo(dato) > 0)
                    return busqBin(izq, cen-1, dato);
                else
                    return busqBin(cen + 1, der, dato);
        }
    }
    
    public String toString(){
        return toString(new StringBuilder(), 0);
    }
    
    private String toString(StringBuilder cad, int i){
        if(i == tam)
            return cad.toString();
        else{
            cad.append(arre[i] + " ");
            return toString(cad, i + 1);        
        }
    }
    
    public int encPosMayor(){
        if(tam == 0)
            return -1;
        else
             return encPosMayor(0,0);
    }
    
    private int encPosMayor(int posM, int i){
        if(i == tam)
            return posM;
        else{
            if(arre[i].compareTo(arre[posM]) > 0)
                posM = i;
            return encPosMayor(posM, i + 1);
        }
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public int eliminaTodo(T dato){
        if(tam == 0)
            return 0;
        else
            return eliminaTodo(dato, 0);
    }
    
    private int eliminaTodo(T dato, int i){
        if(i == tam)
            return 0;
        else
            if(arre[i].equals(dato)){
                arre[i] = arre[tam-1];
                arre[tam-1] = null;
                tam--;
                return eliminaTodo(dato, i) + 1;
            }
            else{
                return eliminaTodo(dato, i+1);
            }
    }
    
    public void ordSelDir(){
        if(tam > 0)
            ordSelDir(0,1,0);
    }
    
    private void ordSelDir(int i,int j, int pos){
        if(i < this.tam-1)
            if(j < tam){
                if(arre[j].compareTo(arre[pos]) < 0)
                    pos = j;
            ordSelDir(i , j + 1, pos);
            }
        else{
            T aux = arre[i];
            arre[i] = arre[pos];
            arre[pos] = aux;
            ordSelDir(i+1, i+2, i+1);
        }
            
    }
    
    public static void main(String[] args) {
        ArregloGenerico <Integer> a = new ArregloGenerico();
        a.altaD(41);
        a.altaD(15);
        a.altaD(9);
        a.altaD(37);
        a.altaD(16);
        
        int dato = 9;
        
        System.out.println("Busqueda secuencial de " + dato + ": " + a.busqSec(dato));
        
        System.out.println("Tamaño del arreglo: " + a.getTam());
        
        System.out.println("Arreglo toString: " + a.toString());
 
        System.out.println("Eliminar todos los " + dato + "s " + a.eliminaTodo(dato));
        
        System.out.println("Arreglo toString: " + a.toString());
    
        System.out.println("Posición del mayor " + " " + a.encPosMayor());
        
        a.ordSelDir();
        
        System.out.println("Arreglo toString: " + a.toString());
    
        
        
        
    }
    
}
