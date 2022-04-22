/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Struktura;

/**
 *
 * @author Elma
 */
public class Liber  implements Arkiv {
    private String titull;
    private String autor;
    private String publisher;
    private int nrFq;
    private String ISBN;
    private int rafti;
    private int time;

    public Liber(String t,String a,String pub,int nFq,String ISBN,int r,int rT){
        this.titull=t;
        this.autor=a;
        this.publisher=pub;
        this.nrFq=nFq;
        this.ISBN=ISBN;
        this.rafti=r;
        this.time=rT;
    }

    public void setTitull(String t){
        this.titull=t;
    }
    public String getTitull(){
        return this.titull;
    }

    public void setAutor(String a){
        this.autor=a;
    }
    public String getAutor(){
        return this.autor;
    }

    public void setPublisher(String pub){
        this.publisher=pub;
    }
    public String getPublisher(){
        return this.publisher;
    }

    public void setNrFq(int nFq){
        this.nrFq=nFq;
    }
    public int getNrFq(){
        return this.nrFq;
    }

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public String getISBN(){
        return this.ISBN;
    }

    public void setRafti(int r){
        this.rafti=r;
    }
    public int getRafti(){
        return this.rafti;
    }

    public void setTime(int rT){
        this.time=rT;
    }
    public int getTime(){
        return this.time;
    }

    public String afisho() {
        return null;
    }

    public String rTime() {
        return null;
    }

}
