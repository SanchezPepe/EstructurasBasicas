/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problemas19y20;

/**
 *
 * @author hca
 */
public interface ColaADT <T> {
    
    public void agrega(T nuevo);
    public T quita();
    public boolean estaVacia();
    public boolean estaLlena();
    public T primero();
    
}
