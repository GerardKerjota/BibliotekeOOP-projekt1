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
public class Fjalor extends Liber{
    private String language_1;
    private String language_2;
    private String tipologji;
    
    public Fjalor(String t, String a, String pub,int nFq,String ISBN,int r,String lg1,String lg2,String tip, int rT){
      super(t, a, pub, nFq, ISBN, r, rT);//really ?yep
      this.language_1=lg1;
      this.language_2=lg2;
      this.tipologji=tip;
    }

   
   public String afisho() {
      return "Fjalori i tipit \' "+this.tipologji+" \' eshte shkruar ne gjuhen "+this.language_1+"-"+this.language_2+" nga "+this.getAutor()+"."; 
   }

   public String rTime() {
      return "\n\t\tKoha e dorezimit te librit te marre eshte "+getTime()+" jave!";
   }
}
