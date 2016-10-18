/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema9;

import java.util.Scanner;

/**
 *
 * @author hca
 */
public class MundoGeom {

    public static int menu(Scanner lee){
        int res;
        do{
            System.out.println("Opciones: ");
            System.out.println("1.- Dar de alta cuadrado.");
            System.out.println("2.- Dar de alta rectangulo.");
            System.out.println("3.- Dar de alta triangulo.");
            System.out.println("4.- Dar de alta circulo.");
            System.out.println("5.- Calcular áreas.");
            System.out.println("6.- Calcular total cuadrados.");
            System.out.println("7.- Eliminar triangulo.");
            System.out.println("8.- Salir.");
            res = lee.nextInt();
        } while (res < 1 || res > 5);
        return res;        
    }
    
    public static void main(String[] args) {
        Figura[] fig = new Figura[20];
        Scanner lee = new Scanner(System.in);
        int opc, total = 0;
        double lado1 = 0, lado2 = 0, lado3 = 0;
        opc = menu(lee);
        while(opc != 5){
            switch(opc){
                case 1:
                    System.out.println("Lado: ");
                    lado1 = lee.nextDouble();
                    total = altaCuadrado(fig, total, lado1);
                    break;
                case 2:
                    System.out.println("Lado 1: ");
                    lado1 = lee.nextDouble();
                    System.out.println("Lado 2: ");
                    lado2 = lee.nextDouble();
                    total = altaRect(fig, total, lado1, lado2);
                    break;
                case 3:
                    System.out.println("Lado 1: ");
                    lado1 = lee.nextDouble();
                    System.out.println("Lado 2: ");
                    lado2 = lee.nextDouble();
                    System.out.println("Lado 3: ");
                    lado3 = lee.nextDouble();
                    total = altaTriang(fig, total, lado1, lado2, lado3);
                    break;
                case 4:
                    System.out.println("Radio: ");
                    lado1 = lee.nextDouble();
                    total = altaCirc(fig, total, lado1);
                    break;
                case 5:
                    System.out.println("\nArea total: " + calcAreas(fig, total));
                    break;
                case 6:
                    System.out.println("\nCírculo más grande: " + encuentraCircMayor(fig, total));
                    break;
                case 7:
                    System.out.println("\nTotal de cuadrados: " + cuentaCuad(fig, total));
                    break;
                case 8:
                    total = eliminaEquil(fig, total);
                    
            }
            opc = menu(lee);
        }
    }
    
    public static int altaCuadrado(Figura j[], int total, double lado){
        if(total < j.length){
            Cuadrado c = new Cuadrado(lado);
            j[total] = c;
            total++;
        }
        return total;
    }
    
    public static int altaRect(Figura j[], int total, double lado, double lado2){
        if(total < j.length){
            Rectangulo r = new Rectangulo(lado, lado2);
            j[total] = r;
            total++;
        }
        return total;
    }
    
    public static int altaTriang(Figura j[], int total, double lado, double lado2, double lado3){
        if(total < j.length){
            Triangulo t = new Triangulo(lado, lado2, lado3);
            j[total] = t;
            total++;
        }
        return total;
    }
    
    public static int altaCirc(Figura j[], int total, double radio){
        if(total < j.length){
            Circulo c = new Circulo(radio);
            j[total] = c;
            total++;
        }
        return total;
    }
    
    public static double calcAreas(Figura fig [], int total){
        double area;
        int i;
        area = 0;
        for(i = 0; i < total; i++)
            area = area + fig[i].calArea();
        return area;
    }
    
    public static String encuentraCircMayor(Figura fig [], int total){
        int i, pos = -1;
        double max = 0, radio;
        String resp;
        for(i = 0; i < total; i++){
            if(fig[i] instanceof Circulo){
                radio = ((Circulo)fig[i]).getRadio();
                if(radio > max){
                    max = radio;
                    pos = i;
                }            
            }
        }
        if(pos != -1)
            resp = fig[pos].toString();
        else
            resp = "No hay circulos";
        
        return resp;       
    }
    
    public static int cuentaCuad(Figura fig [], int total){
        int i, cont;
        cont = 0;
        for(i = 0; i < total; i++)
            if(fig[i] instanceof Cuadrado)
                cont++;
        return cont;
    }
    
    public static int eliminaEquil(Figura[] fig, int total){
        int i = 0;
        while(i < total){
            if(fig[i] instanceof Triangulo && ((Triangulo)fig[i]).equilatero()){
                fig[i] = fig[total-1];
                fig[total-1] = null;
                total = total -1;
            }
            else
                i++;
        }
        return total;
    }
    
}
