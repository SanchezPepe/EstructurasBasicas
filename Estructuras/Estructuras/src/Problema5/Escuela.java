/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author José Sánchez
 */
public class Escuela {
    
    private String nombre;
    private static int numAlum = 0;
    private ArrayList <Kinder> kin;
    private ArrayList <Primaria> pri;
    private ArrayList <Secundaria> sec;
    private ArrayList <Preparatoria> pre;
    
    public Escuela(){
        numAlum++;
    }
    
    public Escuela(String nombre){
        this();
        this.nombre = nombre;
        this.kin = new ArrayList <Kinder>();
        this.pri = new ArrayList <Primaria>();
        this.sec = new ArrayList <Secundaria>();
        this.pre = new ArrayList <Preparatoria>();
    }
    
    public boolean almacenaAlum(String nombre, String curp, String fecha, String madre, String padre, String tutor){
        Scanner lee = new Scanner(System.in);
        String proced, grado, act;
        boolean resp = false;
        System.out.println("Nivel a ingresar: " + "\nK = Kinder" + "\nP = Primaria" + "\nS = Secundaria" + "\nB = Preparatoria");
        char edu = lee.nextLine().charAt(0);
        switch(edu){
            case 'K':
                System.out.println("Ingrese el nivel a ingresar: ");
                char nivel = lee.nextLine().charAt(0);
                Kinder k = new Kinder(nombre, curp, fecha, madre, padre, tutor, nivel);
                if(kin.add(k)){
                    resp = true;
                    System.out.println("Se guardó correctamente");
                }
                break;
            case 'P':
                System.out.println("Escuela de procedencia: ");
                proced = lee.nextLine();
                System.out.println("Grado que cursa: ");
                grado = lee.nextLine();
                Primaria p = new Primaria(nombre, curp, fecha, madre, padre, tutor, proced, grado);
                if(pri.add(p)){
                    resp = true;
                    System.out.println("Se guardó correctamente");
                }
                break;
            case 'S':
                System.out.println("Escuela de procedencia: ");
                proced = lee.nextLine();
                System.out.println("Grado que cursa: ");
                grado = lee.nextLine();
                System.out.println("Actividad artística/deportiva: ");
                act =  lee.nextLine();
                Secundaria s = new Secundaria(nombre, curp, fecha, madre, padre, tutor, proced, grado, act);
                if(sec.add(s)){
                    resp = true;
                    System.out.println("Se guardó correctamente");
                }
                break;
            case 'B':
                System.out.println("Escuela de procedencia: ");
                proced = lee.nextLine();
                System.out.println("Grado que cursa: ");
                grado = lee.nextLine();
                System.out.println("Area de especialización: ");
                char espec =  lee.nextLine().charAt(0);
                Preparatoria ap = new Preparatoria(nombre, curp, fecha, madre, padre, tutor, proced, grado, espec);
                if(pre.add(ap)){
                    resp = true;
                    System.out.println("Se guardó correctamente");
                }
        }
        return resp;
    }       
    
    public String generaReporte(){
        StringBuilder cad = new StringBuilder("Alumnos de la escuela: " + this.nombre + "\n");
        int i = 0;
        while(!kin.isEmpty() && i < kin.size()){
            cad.append(kin.get(i));
            cad.append("\n");
            i++;
        }
        i = 0;
        while(!pri.isEmpty() && i < pri.size()){
            cad.append(pri.get(i));
            cad.append("\n");
            i++;    
        }
        i = 0;
        while(!sec.isEmpty() && i < sec.size()){
            cad.append(sec.get(i));
            cad.append("\n");
            i++;
        }
        i = 0;
        while(!pre.isEmpty() && i < pre.size()){
            cad.append(pre.get(i));
            cad.append("\n");
            i++;
        }
        return cad.toString();
    }
}