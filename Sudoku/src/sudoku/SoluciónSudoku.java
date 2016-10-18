package sudoku;

import ClasesAuxiliares.ConjuntoA;

/**
 * @author CERVANTES OLIVARES MARÍA FERNANDA
 * @author LÓPEZ CORDERO CAROLINA CRISPINA
 * @author SÁNCHEZ AGUILAR JOSÉ DE JESÚS
 * @author SORIA MARROQUÍN GABRIELA  
 */

/**
 * <pre>
 * Clase Sudoku
 * 
 * Contiene los métodos necesarios para resolver un sudoku. Contiene los
 * métodos necesarios para validar la entrada de datos, agregarlos y finalmente
 * procesarlos y resolver el sudoku.
 * </pre>
 */
public class SoluciónSudoku {
    private ConjuntoA <Integer>[] columnas;
    private ConjuntoA <Integer>[] renglones;
    private ConjuntoA <Integer>[] bloques;
    protected int [][] matriz;
    
/**
 * Constructor por omisión que inicializa la matriz de números
 * así como los conjuntos y los llena de ceros.
 */
    public SoluciónSudoku(){
        matriz = new int [9][9];
        columnas = new ConjuntoA[9];
        renglones = new ConjuntoA[9];
        bloques = new ConjuntoA[9];
        for(int i = 0; i < 9; i++){
            columnas[i] = new ConjuntoA();
            renglones[i] = new ConjuntoA();
            bloques[i] = new ConjuntoA();
        }
    }
    
/**
 * Método que agrega un dato a los conjuntos de rengles, columnas, bloques
 * y a la matriz una vez validado.
 * @param dato Dato a ingresar
 * @param ren Renglón en la matriz
 * @param col Columna en la matriz
 * @return Booleano dependiendo del caso éxito/fracaso
 */    
    public boolean agregaDato(int dato, int ren, int col){
        boolean resp = false;
        if(!repetido(dato, ren, col)){
            agregaMat(dato, ren, col);
            matriz[ren][col] = dato;
            bloques[buscaBloque(ren, col)].agrega(dato);
            renglones[ren].agrega(dato);
            columnas[col].agrega(dato);
            resp = true;
        }
        return resp;
    }
    
/**
 * Método que elimina un dato de la matriz y de los conjuntos de renglones, columnas y bloques.
 * @param dato Dato a eliminar
 * @param ren Renglón de la matriz
 * @param col Columna de la matriz
 */    
    public void quitaDato(int dato, int ren, int col) {
        matriz[ren][col] = 0;
        renglones[ren].quita(dato);
        columnas[col].quita(dato);
        bloques[buscaBloque(ren, col)].quita(dato);
    }
    
/**
 * Método auxiliar que agrega unicamente el dato a la matriz.
 * @param dato Dato a ingresar
 * @param ren Renglón en la matriz
 * @param col Columna en la matriz
 * @return Booleano dependiendo del caso éxito/fracaso
 */    
    public boolean agregaMat(int dato, int ren, int col){
        this.matriz[ren][col] = dato;
        return true;
    }
    
/**
 * Método auxiliar que comprueba si un dato se encuentra previamente en
 * la columna, renglón o bloque.
 * @param dato Dato a ingresar
 * @param ren Renglón en la matriz
 * @param col Columna en la matriz
 * @return Booleano dependiendo del caso (está || no está)
 */    
    public boolean repetido(int dato, int ren, int col){
        boolean resp = true;
        if(!bloques[buscaBloque(ren, col)].contiene(dato) && !renglones[ren].contiene(dato) && !columnas[col].contiene(dato))
            resp = false;
        return resp;
    }

/**
 * Método auxiliar que valida que los índices dados estén dentro del rango
 * de números admitidos por el juego
 * @param ren Renglón de la matriz
 * @param col Columna de la matriz
 * @return Booleano según sea el caso indices (dentro || fuera) de la matriz
 */
    public boolean valida(int ren, int col){
        return ren >= 0 && ren < 9 && col >= 0 && col < 9;
    }
    
/**
 * Método auxiliar que busca el bloque al que pertenecen los índices dados.
 * @param ren Renglón de la matriz
 * @param col Columna de la matriz
 * @return Número del uno al nueve dependiendo del bloque al que pertenezcan los parámetros
 */    
    public int buscaBloque(int ren, int col){
        int resp = 404;
        
        if(valida(ren, col)){
            if(ren < 3)
                if(col < 3)
                    resp = 0;
                else if(col < 6)
                    resp = 1;
                else
                    resp = 2;
            else if(ren < 6)
                if(col < 3)
                    resp = 3;
                else if(col < 6)
                    resp = 4;
                else
                    resp = 5;
            else
                if(col < 3)
                    resp = 6;
                else if(col < 6)
                    resp = 7;
                else if(col < 9)
                    resp = 8;
        }
        return resp;
    }
    
/**
 * Método recursivo publico que resuelve el sudoku
 * ingresados por el usuario
 * @return Booleano dependiendo del caso éxito/fracaso
 */ 
    public boolean resuelve(){
       return resuelve(0,0);
    }
    
/**
 * Método recursivo privado que resuelve una vez llenada la matriz de los datos.
 * @param ren Renglón de la matriz
 * @param col Columna de la matriz
 * @return Booleano dependiendo del caso éxito/fracaso
 */    
    private boolean resuelve(int ren, int col){
        boolean res = false;
        if(ren==9)
            return true;
        else
            if(col==9)
                return resuelve(ren+1, 0);
            else
                if(matriz[ren][col] != 0)
                    return resuelve(ren, col+1);
                else{
                    int i = 1;
                    while(i < 10 && !res) {
                        if(agregaDato(i, ren, col)){
                            res = resuelve(ren, col+1);
                        if(!res)
                            quitaDato(i, ren, col);
                        }
                    i++;
                    }      
                }
        return res;
    }
}