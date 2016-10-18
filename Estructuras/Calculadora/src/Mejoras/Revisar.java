/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Pilas.EmptyCollectionException;
import Pilas.EmptyCollectionException;
import Pilas.InvierteCad;
import Pilas.PilaA;
import Pilas.PilaA;
import java.util.ArrayList;

/**
 *
 * @author hca
 */
public class Revisar {
    
    public Revisar(){        
    }
   
    public static boolean estaBalanceada(String exp){
        int n = exp.length();
        boolean resp = false;
        if(n > 0){
            PilaA <Character> p = new PilaA(n);
            int i = 0;
            char car;
            boolean band = true;
            while(i < n && band){
                car = exp.charAt(i);
                if(car == '(')
                    p.push(car);
                else
                    if(car == ')')
                        try{
                            p.pop();
                        }
                        catch(EmptyCollectionException e){
                            band = false;
                        }
                i++;
            }
            resp = band && p.isEmpty();
        }
        return resp;
    }
    
    public static boolean compOper(String exp){
        boolean resp = false;
        if(exp.charAt(0) == '*' || exp.charAt(0) == '/')
            return resp;
        int n = 0, cont = 0;
        while(n < exp.length() && cont != 2){
            int pos = Character.getNumericValue(exp.charAt(n));
            if(pos == -1)
                cont++;
            else
                if(cont > 0)
                    cont--;
            n++;
        }    
        if(cont == 0)
            resp = true;
        return resp;
    }
    
    public static <T> String inPost(String exp){
        PilaA <Character> p1 = new PilaA <Character>();
        StringBuilder cad = new StringBuilder();
        int i;
        char c = 0;
        for(i = 0; i < exp.length(); i++){
            c = exp.charAt(i);
            if(Character.getNumericValue(c) != -1)
                cad.append(c);
            else{
                if(c != ')' && p1.isEmpty())
                    p1.push(c);
                else{ //Si la pila NO está vacía
                    if(c != ')')
                        if(pInf(c) > pPila((p1.peek())))
                            p1.push(c);
                        else{
                            cad.append(p1.pop()); //Se vacia la pila
                            p1.push(c); //Como la pila ya está vacia se puede agregar el operador
                        }  
                }
            }  
        }
        while(!p1.isEmpty())
                cad.append(p1.pop());
        if(cad.charAt(cad.length()-1) == '(')
            cad.deleteCharAt(cad.length()-1);
        return cad.toString();
    }      
    
    public static int pInf(char c){
        if(c == '*' || c == '/')
            return 2;
        if(c == '+' || c == '-')
            return 1;
        else //El caracter es '('
            return 3;
    }
    
    public static int pPila(char c){
        if(c == '*' || c == '/')
            return 2;
        if(c == '+' || c == '-')
            return 1;
        else //El caracter es 0
            return 0;
    }
    
    public static void main(String[] args) {
        String exp = "1+2*3+(4*5+6)*7";
        System.out.println(exp);
        System.out.println(inPost(exp));
        
    }
    

}
