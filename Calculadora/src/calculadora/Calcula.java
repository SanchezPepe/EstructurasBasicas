/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import Pilas.EmptyCollectionException;
import Pilas.PilaA;
import java.util.ArrayList;

/**
 *
 * @author José Sánchez
 * Andrea Avila
 * Tabata Gonzalez
 * Gabriela Soria
 */
public class Calcula {
    
    //Método por omisión
    public Calcula(){        
    }
   
   
    //MÉTODOS
   
    /**Método que comprueba si la expresión está balanceada de paréntesis
     * @param exp String a evaluar
     * @return boolean <ul>
     * <li> true si los paréntesis de la expresión tienen un número y orden correctos </li>
     * <li> false si los paréntesis no están bien balanceados </li>
     * </ul>
     */
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
    
    /**  Método que comprueba si la expresión es válida
     * @param exp String a evaluar
     * @return boolean <ul>
     * <li> true si la expresión es correcta </li>
     * <li> false si no lo es </li>
     * </ul>
     */
    public static boolean validaExp(String exp){
        boolean resp = false;
        if(exp.charAt(0) == '*' || exp.charAt(0) == '/')
            return resp;
        int n = 0, cont = 0, i = 0;
        char c;
        while(n < exp.length() && cont != 2){
            c = exp.charAt(n);
            if(esOperador(c) || c == '.' && c != '(' && c != ')'){
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
   
    /**Método que convierte la expresión infija a postfija
     * @param exp String a evaluar
     * @param <T> String a evaluar
     * @return String <ul>
     * <li> Regresa una cadena con notación postfija
     * </ul>
     */
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
            if(esNumero(c) || c == '.' && esNumero(exp.charAt(i-1)) || c == '-' && i > 0 && !esNumero(exp.charAt(i-1)) && esNumero(exp.charAt(i+1))){
                if(c == '.' && esOperador(exp.charAt(i-1)))
                    cad.append('0');
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
    
    /** Método que evalúa la expresión postfija y hace la operación
     * @param post String a evaluar
     * @return double <ul>
     * <li> Regresa un double, que es el valor de la operación denotada por la expresión recibida
     * </ul>
     */
    public static double realizaOp(String post){
        PilaA <Double> num = new PilaA(); //Pila que almacena los numeros de la expresión
        PilaA <Character> op = new PilaA(); //Pila que almacena los operadores
        PilaA <Double> ops = new PilaA(); //Pila que almancena las operaciones que se van realizando
        double aux, aux2, resp = 0;
        llenaPilas(num, op, post);
        invPila(num);
        invPila(op);
        while(!num.isEmpty()){
            aux = num.pop();
            
            try{
                aux2 = num.pop();
                ops.push(opSigno(aux, aux2, op.pop()));
            }catch(Exception e){
                ops.push(opSigno(ops.pop(), aux, op.pop()));
            }
            
        }
        invPila(ops);
        if(!op.isEmpty()){
            aux = ops.pop();
            aux2 = ops.pop();
            resp = opSigno(aux, aux2, op.pop());
        }
            
        else
            resp = ops.pop();
        return resp;
    }
    
    /** Método que valida la expresión, los paréntesis y realiza la operación
     * @param exp String a evaluar
     * @return String <ul>
     * <li> Si el tanto los paréntesis como la expresión son correctas 
     * convierte la expresión a Postfija
     * <li> Si alguna no procede, regresará: "ERROR DE SINTAXIS"
     * </ul>
     */
    public static String filtroFinal(String exp){
        if(revisaParentesis(exp) && validaExp(exp) && exp.length() >= 3)
            return Double.toString(realizaOp(inPost(exp)));
        else
            return "ERROR DE SINTAXIS";    
    }


    
    /** Método auxilar que indica si es un operador el caracter parametrizado
     * @param  c  Caracter a evaluar
     * @return boolean <ul>
     * <li> Regresa true si el caracter es de tipo, suma, resta, multiplicación 
     * o división.
     * <li> Regresa false si no es ninguno de los mencionados anteriormente
     * </ul>
     */
    public static boolean esOperador(char c){
        return c == '*' || c == '/' || c == '+' || c == '-';
    }
    
    /** Método auxilar que indica si es un número el caracter parametrizado
     * @param  c  Caracter a evaluar
     * @return boolean <ul>
     * <li> Regresa true si efectivamente es un número
     * <li> Regresa false si se trata de un operador o paréntesis
     * </ul>
     */
    public static boolean esNumero(char c){
        return Character.getNumericValue(c) != -1 && !esParentesis(c);
    }
    
    /**Método auxilar que indica si es un paréntesis el caracter parametrizado
     * @param c  Caracter a evaluar
     * @return boolean <ul>
     * <li> Regresa true si es un paréntesis
     * <li> Regresa false si no lo es
     * </ul>
     */
    public static boolean esParentesis(char c){
        return c == '(' || c == ')';
    }

    /**Método auxilar que da la prioridad a los operadores en una expresión 
     * infija
     * @param c  Caracter a evaluar
     * @return int <ul>
     * <li> Regresa un entero según el valor de cada operador
     * </ul>
     */
    public static int pInf(char c){
        //Prioridad de operadores en expresión infija
        if(c == '*' || c == '/')
            return 2;
        if(c == '+' || c == '-')
            return 1;
        else //El caracter es '('
            return 3;
    }
    
    /** Método auxilar que da la prioridad a los operadores dentro de una pila
     * @param c Caracter a evaluar
     * @return int <ul>
     * <li> Regresa un entero según el valor de cada operador 
     * </li>
     * </ul>
     */
    public static int pPila(char c){
        //Propiedad de los operadores dentro de la pila
        if(c == '*' || c == '/')
            return 2;
        if(c == '+' || c == '-')
            return 1;
        else //El caracter es '('
            return 0;
    }
    
   /** Método auxilar que realiza la operación deseada de acuerdo al caracter
    (un operador) dado.
     * @param n1  número a evaluar
     * @param n2  número a evaluar
     * @param c Operador de tipo Caracter
     * @return double <ul>
     * <li> Regresa un double, que es el resultado de la operación con 
     * dos números.
     * </ul>
     */
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

    /** Método auxilar llena las pilas con los elementos de un arreglo 
     * dependiendo de su tipo (doble o caracter)
     * @param num Pila de doubles
     * @param op Pila de Caracteres
     * @param expPos cadena a evaluar
    */
    public static void llenaPilas(PilaA <Double> num, PilaA <Character> op, String expPos){
        StringBuilder cad = new StringBuilder();
        int i = 0;
        for(i = 0; i < expPos.length(); i++){
            if(expPos.charAt(i) == '-'){
               if(i == 0){
                   cad.append("-");
                   i++;
               }
                else
                    if(i > 0 && i < expPos.length()-1 && esOperador(expPos.charAt(i-1)) || esParentesis(expPos.charAt(i-1)) || expPos.charAt(i-1) == ' '){
                        cad.append("-");
                        i++;
                    }       
            }
            while(esNumero(expPos.charAt(i)) || expPos.charAt(i) == '.'){
                cad.append(expPos.charAt(i));
                i++;
            }
            
            if(cad.length() > 0){
                num.push(Double.parseDouble(cad.toString()));
                cad = new StringBuilder();
            }
            if(esOperador(expPos.charAt(i))){
                op.push(expPos.charAt(i));
            } 
        }          
    }
    
    /** Método auxiliar que invierte la pila ingresada
     * @param pila  Pila Genérica
     * @param <T> Pila Genérica
     */
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
 
 
}