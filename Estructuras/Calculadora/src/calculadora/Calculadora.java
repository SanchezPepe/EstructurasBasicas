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
public class Calculadora {
    
    public Calculadora(){        
    }
    
    //MÉTODOS
   
    //Método que comprueba si la expresión está balanceada de parentesis, si no tiene parentesis regresa un true
    public static boolean revisaParentesis(String exp){
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
    
    //Método que comprueba si la expresion está correcta en sus operadores
    public static boolean validaExp(String exp){
        boolean resp = false;
        if(exp.charAt(0) == '*' || exp.charAt(0) == '/')
            return resp;
        int n = 0, cont = 0, i = 0;
        char c;
        while(n < exp.length() && cont != 2){
            c = exp.charAt(n);
            if(esOperador(c) && c != '(' && c != ')'){
                cont++;
                if(c == '-' && esNumero(exp.charAt(n+1)))
                    cont--;
            }
            else
                if(cont > 0)
                    cont--;
            n++;
        }    
        if(cont == 0)
            resp = true;
        
        return resp;
    }
   
    //Método que convierte la expresion infija a postfija
    public static <T> String inPost(String exp){
        PilaA <Character> p1 = new PilaA <Character>();
        StringBuilder cad = new StringBuilder();
        int i, j = 0;
        char c = 0;
        if(exp.charAt(0) == '-'){
            cad.append("-");
            j = 1;
        }
        for(i = j; i < exp.length(); i++){
            c = exp.charAt(i);
            if(esNumero(c) || c == '.' && esNumero(exp.charAt(i-1))){
                cad.append(c);
            }
            else{
                if(!esParentesis(c))
                    cad.append(" "); //Inserta un espacio para diferenciar los numeros
                if(c != ')' && p1.isEmpty()) //Si la pila está vacía
                    p1.push(c);
                else //Si la pila NO está vacía
                    if(c != ')')
                        if(pInf(c) > pPila((p1.peek())))
                            p1.push(c);                        
                        else{
                            cad.append(p1.pop());//Se vacia la pila
                            p1.push(c); //Como la pila ya está vacia se puede agregar el operador
                        }
                    else{ //Si es un ')'
                        while(!p1.peek().equals('(')){ //Se vacia la pila hasta encontrar '('
                            cad.append(p1.pop());
                        }    
                        p1.pop(); //Elimina el '('    
                    }
            }
        }
        while(!p1.isEmpty()){
            cad.append(p1.pop());
        }
        return cad.toString();
    }
    
    //Método que evalua la expresion postfija y hace la operación
    public static double operacion(String post){
        PilaA <Double> num = new PilaA(); //Pila que almacena los numeros de la expresión
        PilaA <Character> op = new PilaA(); //Pila que almacena los operadores
        PilaA <Double> ops = new PilaA(); //Pila que almancena las operaciones que se van realizando
        double aux, aux2, resp = 0;
        llenaPilas(num, op, post);
        if(pPila(post.charAt(post.length()-1)) == 1){
            invPila(num);
            invPila(op);
        }
        else
            invPila(op);  
        while(!num.isEmpty()){
            aux = num.pop();
            try{
                aux2 = num.pop();
                ops.push(opSigno(aux2, aux, op.pop()));
            }catch(Exception e){
                ops.push(opSigno(aux, ops.pop(), op.pop()));
            }
            
        }
        invPila(ops);
        if(!op.isEmpty())
            resp = opSigno(ops.pop(), ops.pop(), op.pop());
        else
            resp = ops.pop();
        return resp;
    }
    
    public static String filtroFinal(String exp){
        if(revisaParentesis(exp) && validaExp(exp))
            return Double.toString(operacion(inPost(exp)));
        else
            return "ERROR DE SINTAXIS";    
    }


    //MÉTODOS AUXILIARES
    
    //Método auxilar que indica si es un operador el caracter parametrizado
    public static boolean esOperador(char c){
        return c == '*' || c == '/' || c == '+' || c == '-';
    }
    
    //Método auxilar que indica si es un número el caracter parametrizado
    public static boolean esNumero(char c){
        return Character.getNumericValue(c) != -1 && !esParentesis(c);
    }
    
    //Método auxilar que indica si es un parentesis el caracter parametrizado
    public static boolean esParentesis(char c){
        return c == '(' || c == ')';
    }

    //Método auxilar que da la prioridad a los operadores en una expresión infija
    public static int pInf(char c){
        //Prioridad de operadores en expresion infija
        if(c == '*' || c == '/')
            return 2;
        if(c == '+' || c == '-')
            return 1;
        else //El caracter es '('
            return 3;
    }
    
    //Método auxilar que da la prioridad a los operadores dentro de una pila
    public static int pPila(char c){
        //Propiedad de los operadores dentro de la pila
        if(c == '*' || c == '/')
            return 2;
        if(c == '+' || c == '-')
            return 1;
        else //El caracter es '('
            return 0;
    }
    
   //Método auxilar que realiza la operación deseada de acuerdo al caracter(un operador) dado-
    public static double opSigno(double n1, double n2, char c){
        double resp = 0;
        switch(c){
            case '*':
                resp = n1 * n2;
                break;
            case '/':
                resp = n1 / n2;
                break;
            case '+':
                resp = n1 + n2;
                break;
            case '-':
                resp = n1 - n2;
        }
        return resp;
    }
    
    public static void llenaPilas(PilaA <Double> num, PilaA <Character> op, String expPos){
        StringBuilder cad = new StringBuilder();
        int i = 0;
        for(i = 0; i < expPos.length(); i++){
            while(expPos.charAt(i) == ' ')
                i++;
            while(esNumero(expPos.charAt(i)) || expPos.charAt(i) == '.'){
                cad.append(expPos.charAt(i));
                i++;
            }
            if(cad.length() > 0){
                num.push(Double.parseDouble(cad.toString()));
                cad = new StringBuilder();
            }
            if(esOperador(expPos.charAt(i)))
                op.push(expPos.charAt(i));  
        }
    }

    //Método auxiliar que invierte los elementos de la pila ingresada
    public static <T> void invPila(PilaA <T> pila){
        int cont = 0;
        ArrayList <T> aux = new ArrayList();
        if(!pila.isEmpty()){
            while(!pila.isEmpty()){
                aux.add(pila.peek());
                pila.pop();
                cont++;
            }
            int i = 0;
            while(i != cont){
                pila.push(aux.get(i));
                i++;
            }        
        }
    }
 

    public static void main(String[] args) {
        String exp = "-7*6/-4+8.3";
        
        System.out.println(inPost(exp));
        
        System.out.println(validaExp(exp));
        
        System.out.println(filtroFinal(exp));
        
        
        
    }
 
}