import ClasesAUX.PilaA;
import ClasesAUX.PilaADT;
import Extra.ConjuntoA;
import java.util.Iterator;

public class OtrosMetodos {
    
    //MÉTODO QUE COMPRUEBA SI UNA ORACION ES UN PALÍNDROMO    
    public static boolean esPalidromo(String exp){
        String aux = exp.replace(" ","");
        aux = aux.toLowerCase();
        return esPalindromo(0, aux.length()-1, aux);
    }
    
    private static boolean esPalindromo(int inicio, int fin, String exp){
        if(inicio >= fin)
            return true;
        else
            if(exp.charAt(inicio) == exp.charAt(fin))
                return esPalindromo(inicio + 1, fin - 1, exp);
            else
                return false;
    }
    
    //MÉTODO QUE INVIERTE LOS DÍGITOS DE UN NUMERO
    public static void invierteD(int n){
        if(n > 0){
            System.out.println(n % 10);
            invierteD(n/10);
        }
    }
    
    //DEFINICIÓN RECURSIVA DE LOS COEFICIENTES BINOMIALES
    public static double coefBin(int n, int k){
        if(k == 0)
            return 1;
        else
            if(k > n)
                return 0;
            else
                return coefBin(n-1,k-1) + coefBin(n-1,k);
    }
    
    //ALGORITMO DE EUCLIDES    
    public static int MCD(int m, int n){
        if(n == 0)
            return m;
        else
            return MCD(n, m % n);
    }
    
    //MÉTODOS QUE CALCULAN LA SUCESION DE FIBONACCI
    public static int fibo(int n){
        if(n == 0 || n == 1)
            return n;
        else{
            int arre[] = new int[n+1];
            arre[0] = 0;
            arre[1] = 1;
            for(int i = 2; i <= n; i++)
                arre[i] = -1;
            return fibo(n, arre);
        }
    }
    
    private static int fibo(int n, int arre[]){
        if(n == 0 || n == 1)
            return n;
        else
            if(arre[n] != 1)
                return arre[n];
            else{
                arre[n] = fibo(n-1,arre) + fibo(n-2,arre);
                return arre[n];
            }
    }
    
    //TORRES DE HANOI
    public static void impHanoi(int n, String tO, String tA, String tD){ // n > 0
        if(n == 1)
            System.out.println("Mueve 1 disco de " + tO + " a " + tD);
        else{
            impHanoi(n-1, tO, tD, tA);
            System.out.println("Mueve 1 disco de " + tO + " a " + tD);
            impHanoi(n-1, tA, tO, tD);
        }
    }
    
    //MÉTODO QUE CALCULA RAIZ DE UN NÚMERO
    public static double raiz(int n, double ap, double error){
        if(Math.abs(Math.pow(ap,2)) < error)
            return ap;
        else{
            ap = (Math.pow(ap, 2) + n) / (2 * ap);
            return raiz(n, ap, error);
        }
    }
    
    //SERIE DE ACKERMAN
    public static int Ack(int m, int n){
        if(n == 0)
            return n + 1;
        else
            if(n == 0)
                return Ack(m - 1, 1);
            else
                return Ack(m - 1, Ack(m, n - 1));
    }
    
    //MÉTODO QUE CUENTA EL NUMERO DE VECES QUE UN CARACTER ESTÁ EN UNA CADENA
    public static int vecesCar(String cad, char car){
        int n = cad.length();
        cad = cad.toLowerCase();
        return vecesCar(cad, car, 0 , 0);
    }
    
    private static int vecesCar(String cad, char c, int i, int num){
        if(num > i){
            if(c == cad.charAt(i))
                num++;
            return vecesCar(cad, c, i+1, num);
        }
        return num;
    }
    
    //MÉTODO QUE CUENTA EL NÚMERO DE DIGITOS EN UN NÚMERO
    public static int digitos(int num){
        if(num == 0)
            return 0;
        else
            return 1 + digitos(num/10);
    }
    
    //MÉTODO QUE INVIERTE EL ORDEN DE LOS DIGITOS
    public static int volteaNum(int num){
        return volteaNum(num, 0);
    }
    
    private static int volteaNum(int num, int res){
        if(num == 0)
            return res/10;
        else{
            res = res + num%10;
            return volteaNum(num/10, res*10);
        }
    }
    
    //MÉTODO QUE QUITA ESPACIOS EN BLANCO
    public static String quitaEsp(String cad){
        return quitaEsp(cad, 0, cad.length()-1, cad.length());        
    }
    
    private static String quitaEsp(String cad, int i, int j, int length){
        if(i < length)
            if(cad.charAt(i) == ' ')
                return quitaEsp(cad, i + 1, j, length);
            else
                if(cad.charAt(j) == ' ')
                    return quitaEsp(cad, i, j-1, length);
                else
                    return cad.substring(i, j + 1);
        else return " ";
    }
    
    //MÉTODO EQUALS FUERA DE LA CLASE PILAA
    public static <T> boolean equals(PilaADT <T> p1, PilaADT <T> p2){
        boolean resp;
        resp = p1 != null && p2 != null;
        if(resp){
            PilaADT <T> aux = new PilaA();
            PilaADT <T> aux2 = new PilaA();
            return equals(p1, p2, aux, aux2);
            copiaPila(aux, p1);
            copiaPila(aux2, p2);
        }
        return resp;
    }
    
    private static <T> boolean equals(PilaADT <T> p1, PilaADT <T> p2, PilaADT <T> aux, PilaADT <T> aux2){
        if(p1.isEmpty() && p2.isEmpty())
            return true;
        else
            if(p1.isEmpty() || p2.isEmpty())
                return false;
            else{
                aux.push(p1.pop());
                aux2.push(p2.pop());
                if(aux.peek().equals(aux2.peek()))
                    return equals(p1, p2, aux, aux2);
                else
                    return false;
            }
                
    }
    
   //MÉTODO SIN USAR PILAS AUXILIARES
    public static <T> boolean equals2(PilaADT <T> p1, PilaADT <T> p2){
        if(p1.isEmpty() && p2.isEmpty())
            return true;
        else
            if(p1.isEmpty() || p2.isEmpty())
                return false;
            else{
                T dato1 = p1.pop();
                T dato2 = p2.pop();
                if(!dato1.equals(dato2))
                    return false;
                else
                    return equals2(p1, p2);
                p1.push(dato1);
                p2.push(dato2);
            }     
    }
    
    //MÉTODO INTERSECCION FUERA DE LA CLASE CONJUNTO
    public static <T> ConjuntoA <T> intersecExt(ConjuntoA <T> c1, ConjuntoA <T> c2){
        ConjuntoA <T> nuevo = new ConjuntoA();
        if(c1 != null && c2 != null)
        for(T elem: c1){
            if(c2.contiene(elem))
                nuevo.agrega(elem);
        }
        return nuevo;        
    }
    
    private static <T> void intersecExtRec(ConjuntoA <T> nuevo, Iterator <T> it, ConjuntoA <T> otro){
        if(it.hasNext()){
            T temp = it.next();
            if(otro.contiene(temp))
                nuevo.agrega(temp);
            intersecExtRec(nuevo, it, otro);
        }
    }
    
    public static <T> ConjuntoA <T> intersecExtRec(ConjuntoA <T> c1, ConjuntoA <T> c2){
        ConjuntoA <T> nuevo = new ConjuntoA();
        if(c1 != null && c2 != null)
            intersecExtRec(nuevo, c1.iterator(), c2);
        return nuevo;
    }
    
    //MÉTODO QUE SUMA TODOS LOS ELEMENTOS DE UNA MATRIZ RECTANGULAR O CUADRADA
    public static int sumaMat(int arre[][], int ren, int col){
        return sumaMat(arre, ren, col, 0, 0);
    }
    
    private static int sumaMat(int arre[][], int ren, int col, int m, int n){
        if(n == col)
            return sumaMat(arre, ren, col, m+1,0);
        else
            if(m == ren)
                return 0;
            else
                return arre[m][n] + sumaMat(arre, ren, col, m, n+1);       
    }
    
    //MÉTODO QUE IMPRIME TODOS LOS ELEMENTOS DE UNA MATRIZ
    public static void imprime(int arre[][], int ren, int col){
        imprime(arre, ren, col, 0, 0);
    }
    
    private static void imprime(int arre[][], int ren, int col, int aux1, int aux2){
        if(aux1 < ren){
            if(aux2 < col){
                System.out.print(" "+ arre[aux1][aux2]);
                imprime(arre, ren, col, aux1, aux2+1);
            }
            else{
                System.out.println("\n");
                imprime(arre, ren, col, aux1+1, 0);
            }
        }
    }
    
    /**
     * EJERCICIOS:
     * 1.- Multiplicación de matrices A(MXN) * B(NXP) = C(MXP)
     * 2.- Suma de columnas pares (recursión)
     * 3.- Clase Biblioteca con un arreglo de conjuntos de libros
     *      A) Lista de todos los libros de la biblioteca
     *      B) Datos de los libros que pertencen a una sola categoría
     *      C) Datos de los libros que pertenecen al menos a dos categorías
     */
    public static int sumaAB(int arre[][], int ren, int col){
        return sumaAB(arre, ren, col, ren, 0);
    } 
    
    private static int sumaAB(int arre[][], int ren, int col, int ren2, int col2){
        if(ren2 == ren && col2 == col)
            return arre[ren][col];
        else{
            if(col2 <= col)
                return arre[ren][col] + sumaAB(arre, ren, col, ren2, col2+1);
            else{
                col2 = 0;
                ren++;
                return sumaAB(arre, ren, col, ren2, col);
            }   
        }
    }

    public static void main(String[] args) {
        int arre[][] = new int[1][1];
        arre[1][1] = 2;
        arre[1][2] = 5;
        arre[2][1] = 9;
        arre[2][2] = 1;
        System.out.println("Suma del arreglo: " + sumaAB(arre, 1, 1));
    }
 
}    
    