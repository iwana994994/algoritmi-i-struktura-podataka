

package moje_vezbanje_4;

import java.util.Scanner;


public class Moje_vezbanje_4 {

    public static void main(String[] args) {
         /*
Napisati funkciju koja formira listu studenata tako što se prvo unosi  
šifra i ukoliko je ona različita od 0, onda se unose ime i prezime, 
a u  suprotnom se prekida formiranje liste.
        Za svakog studenta pamtiti ime,  prezime i šifru.
Ispisati tako formiranu listu.*/  

         Lista l = new Lista();
         
         while (true) {   
             int sifra;
                          
         System.out.println("Unesi podatke o studentu: sifra(veca od nule): " );
          sifra=new Scanner(System.in).nextInt();
         if (sifra==0) {
             System.out.println("Sifra nije dobra!");
             break;
             }
           
        
          System.out.println("Unesi ime: ");
         String ime= new Scanner(System.in).next();
             System.out.println("unesi prezime");
         String prezime= new Scanner(System.in).next();
         
         Student s= new Student (sifra,ime,prezime);
         
         l.dodaj(s);
        }
       
         
         l.prikazi();
    }

}
