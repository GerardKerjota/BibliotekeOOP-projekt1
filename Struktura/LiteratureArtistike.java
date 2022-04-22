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
public class LiteratureArtistike extends Liber{
   private int readingAge;
   private String programType;
   private String zhanri;
   
   public LiteratureArtistike(String t, String a, String pub, int nFq, String ISBN,int r,int rE,String zh,String prgT, int rT){
        super(t, a, pub, nFq, ISBN, r, rT);
        this.readingAge=rE;
        this.zhanri=zh;
        this.programType=prgT;
    }


public String afisho() {
  return "Libri \' "+getTitull()+" \' shkruar nga "+this.getAutor()+" eshte i zhanrit "+this.zhanri+" dhe eshte nje "+this.programType+"."+"\n\tKeshillohet te lexohet nga mosha "+this.readingAge+"+ !"; 
}



public String rTime() {

  return "\n\t\tKoha e dorezimit te librit te marre eshte "+getTime()+" jave!";
}
}
