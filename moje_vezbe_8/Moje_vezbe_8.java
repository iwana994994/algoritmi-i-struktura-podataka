

package moje_vezbe_8;

import java.util.Scanner;


public class Moje_vezbe_8 {

    public static void main(String[] args) {
        
        /*      Na steku se nalaze podaci o rezultatima ispita:
              ---- šifra ispita, šifra studenta i ocena.
     Realizovati funkcije za stavljanje elemenata na stek  
        i uzimanje elemenata sa steka,
        čiji je maksimalni  kapacitet N. 
        Napisati program tako da na stek možemo imati samo  prolazne ocene. ocena >6
        Elementima steka pristupati samo  preko realizovanih funkcija.
Zapisi o rezutlatima ispita se učitavaju dok se za ocenu ne unese 0 ili se ne dođe do punog steka.
*/
       
        Stek stek= new Stek (10);
        while (true) {            
            System.out.println("unesi Sifru ispita");
            int sifra_ispita= new Scanner(System.in).nextInt();
            if (sifra_ispita == 0) {
                System.out.println("Izlaz iz programa");
                break;
            }
            System.out.println("Unesi sifru studenta: ");
            int sifra_studenta=new Scanner(System.in).nextInt();
            
            System.out.println("Unesi ocenu: ");
            int ocena = new Scanner(System.in).nextInt();
            
            if (ocena>=6) {
                Student s= new Student(sifra_ispita, sifra_studenta, ocena);
                System.out.println("Student je uspesno unet.");
            }
            else{
                System.out.println("Student ima manju ocenu od 6! ");
            break;}
            
            
        }
        stek.prikazi();
        
        
    }

}
