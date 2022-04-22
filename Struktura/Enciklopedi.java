/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Struktura;

import Struktura.Liber;

/**
 *
 * @author Elma
 */
public class Enciklopedi extends Liber{
     private  String lloji;
  
    public Enciklopedi(String t,String a,String pub,int nFq,String ISBN,int r,String ll, int rT){
        super(t, a, pub, nFq, ISBN, r, rT);
        this.lloji=ll;
    }

    
    public String afisho() {
        return "Libri Enciklopedik \' "+this.getTitull()+" \' eshte enciklopedi "+this.lloji+" shkruar nga "+this.getAutor()+" dhe publikuar nga "+this.getPublisher()+".";
        
    }
    
    public String rTime() {
        return "\n\t\tKoha e dorezimit te librit te marre eshte "+getTime()+" jave!";
    }

}
