/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SegundoParcial;

/**
 *
 * @author jsanchezagu
 */
public class Recursión {
    
    //PRÃCTICA PARA RECURSIÃ“N
    public static int factorial(int num){
        if(num == 1)
            return num * 1;
        else{
            return num * factorial(num-1);
        }    
    }
    
    public static int sumaD(int num){
        String cad = Integer.toString(num);
        return sumaD(cad, cad.length()-1);
    }
    
    private static int sumaD(String cad, int pos){
        if(pos == 0)
            return Integer.parseInt(Character.toString(cad.charAt(0)));
        else
            return Integer.parseInt(Character.toString(cad.charAt(pos))) + sumaD(cad, pos-1);
    }
    
    public static int length2(String cad){
        return length2(cad, 0);
    }
    
    private static int length2(String cad, int pos){
        try{
            cad.charAt(pos+1);
            return 1 + length2(cad, pos+1);
        }catch(Exception e){
            return 1;
        }
    }
    
    public static int qH(int num){
        System.out.println(num);
        if(num > 100)
            return 1;
        else
            return qH(num+10) + qH(num+15)*2;
    }
    
    public static int qH2(int num){
        System.out.println(num);
        if(num == 0)
            return -1;
        else
            return qH2(num-1) + 2 + qH2(num/2);
    }
    
    public static int qH3(int n){
        return qH3(n, 0);
    }
    
    private static int qH3(int n, int i){
        System.out.println(i);
        if(n == i)
            return 0;
        else
            return 1 + qH3(n, i+1);
    }
    
    public static int pow2(int x, int n){
        if(n == 0)
            return 1;
        else{
           return x * pow2(x, n-1);
        }
    }
    
    public static String invCar(String cad){
        return invCar(cad, cad.length()-1);
    }
    
    private static String invCar(String cad, int pos){
        if(pos == 0)
            return Character.toString(cad.charAt(0));
        else
            return Character.toString(cad.charAt(pos)) + invCar(cad, pos-1);
    }
    
    public static String quitaEsp(String cad){
        return quitaEsp(cad, 0);
    }
    
    private static String quitaEsp(String cad, int pos){
        if(pos < cad.length())
            if(cad.charAt(pos) != ' ')
                return cad.charAt(pos) + quitaEsp(cad, pos+1);
            else
                return quitaEsp(cad, pos+1);
        else
            return "";
           
    }
    
    public static int sumaE(int arre[]){
        if(arre.length == 0)
            return 0;
        else
            return sumaE(arre, 0);
    }
    
    private static int sumaE(int arre[], int i){
        if(i == arre.length-1)
            return arre[i];
        else{
            return arre[i] + sumaE(arre, i + 1);
        }
    }
    
    public static String impID(int arre[]){
        if(arre.length == 0)
            return "";
        else
            return impID(arre, 0);
    }
    
    private static String impID(int arre[], int i){
        if(i == arre.length-1)
            return Integer.toString(arre[i]);
        else
            return Integer.toString(arre[i]) + " " + impID(arre, i+1);
        
    }
    
    public static String impDI(int arre[]){
        if(arre.length == 0)
            return "";
        else
            return impDI(arre, arre.length-1);
    }
    
    private static String impDI(int arre[], int tam){
        if(tam == 0)
            return Integer.toString(arre[tam]);
        else
            return Integer.toString(arre[tam]) + " " + impDI(arre, tam-1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int arre[]={};
        System.out.println("Respuesta: " + sumaE(arre));
        System.out.println("Arreglo imprimido ID: " + impID(arre));
        System.out.println("Arreglo imprimido DI: " + impDI(arre));
        
    
    }
}
