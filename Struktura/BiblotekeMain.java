/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Struktura;

/**
 *
 * @author Elma
 */
public class BiblotekeMain {
    public static void main(String[] args){
       Liber[] objlib = new Liber[3];
        objlib[0] = new LiteratureArtistike("Steve Jobs", "Walter Isaacson", "Simon & Schuster Audio", 656, "B07ZMKXMTG", 477,18, "biografi", "book/audiobook",2);
        objlib[1] = new Fjalor("Spanish-English Dictionary", "Merriam-Webster", "Federal Street Press", 334,"978-1596951655", 612, "anglisht", "spanjisht", "perkthim",3);
        objlib[2] = new Enciklopedi("The Princeton Companion to Mathematics", "Timothy Gowers", "Princeton University Press", 1034, "978-0691118802", 105, "shkencave-ekzakte",3);
  
        System.out.println("\n\t\t\t\t\t\tMiresevini ne Bibloteken B.E.G! :)");
      for(Liber li: objlib){
          if(li instanceof Enciklopedi){
            System.out.println("\nSEKTORI ENCIKLOPEDI:");
            System.out.println("==========================================================================================================================================================");
            System.out.println(li.afisho());
            System.out.println(li.rTime());
          }
          
          else if(li instanceof LiteratureArtistike){
            System.out.println("\nSEKTORI LITERATURE ARTISTIKE:");
            System.out.println("==========================================================================================================================================================");
            System.out.println(li.afisho());
            System.out.println(li.rTime());
          }

          else if(li instanceof Fjalor){
            System.out.println("\n\nSEKTORI FJALOR:");
            System.out.println("==========================================================================================================================================================");
            System.out.println(li.afisho());
            System.out.println(li.rTime());
          }
          }
        
      
    }
}
