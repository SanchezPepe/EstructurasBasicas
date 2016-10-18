/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author José Sánchez
 */
public class Serializadora {
    private ObjectInputStream lector;
    private ObjectOutputStream escritor;
    
    public void escribeObj(Object o){
        try {
            escritor = new ObjectOutputStream
                (new FileOutputStream("Alumno.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Serializadora.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        
    }
    
    public Object leeObj(String nom){
        Object ret = null;
        
        try {
            
            ret = lector.readObject();
            
            lector = new ObjectInputStream(new FileInputStream(nom));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Serializadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Serializadora.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Serializadora.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ret;
    }
}
