/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problema12;

import pilas.EmptyCollectionException;
import pilas.PilaA;

/**
 *
 * @author hca
 */
public class RevisorParentesis {
    
    private String expres;
    
    public RevisorParentesis(){
    }
    
    public RevisorParentesis(String exp){
        this.expres = exp;
    }

    public void setExpres(String expres) {
        this.expres = expres;
    }
   
    public boolean estaBalanceada(){
        int n = expres.length();
        boolean resp = false;
        if(n > 0){
            PilaA <Character> p = new PilaA(n);
            int i = 0;
            char car;
            boolean band = true;
            while(i < n && band){
                car = expres.charAt(i);
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
}
