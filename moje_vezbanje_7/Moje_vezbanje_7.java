

package moje_vezbanje_7;

import java.util.Random;


public class Moje_vezbanje_7 {

    public static void main(String[] args) {
        
        /*Koristeći samoimplementirani neograničeni red,
        10 puta generisati
        pseudo-slučajnu vrednost true ili false (odnosno 0 ili 1).
        
            - Ukoliko je generisan TRUE iz reda ispisati (izbaciti) jednu
             celobrojnu vrednost.
        Ukoliko je red prazan ispisati poruku o tome.
            - Ukoliko je generisan FALSE u red se upisuje jedna celobrojna vrednost 
        gde su vrednosti koje su upusuje uzastopni brojevi od broja 100 do 
             broja 0.
            - Prilikom stavljanja i uklanjanja iz reda ispisati poruku o tome.
*/
        Red r= new Red();
        
       /* r.dodaj(new Element (20));
        
        r.dodaj(new Element (30));
        r.brisi();
        r.prikazi();
        */
        System.out.println("----------------------------------------");
              int broj2 =100;
          Random random = new Random(2);
          for (int i = 0; i < 10; i++) {
            int broj=  random.nextInt(2);
              if (broj==0) {
                  System.out.println("Upisivanje vrednosti");
                  if (broj2>=0) {
                      r.dodaj(new Element(broj2));
                      System.out.println(broj2);
                      broj2--;
                  }
                  }
                  if (broj==1) {
                        r.brisi();
                  System.out.println("Vrednost je obrisana!");
                  r.prikazi();
                  
                  }                        
              }
              
              
              
              
        }

        
    }


