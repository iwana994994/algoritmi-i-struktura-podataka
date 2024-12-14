

package vezba1;

import java.util.Scanner;


public class Vezba1 {

    public static void main(String[] args) {
           /*1.  Od korisnik tražiti unos broja, a zatim taj broj pretražiti u celobrojnom nizu
        i ispisati njegovu poziciju, ili prikazati da broj ne postoji u datom nizu.*/
           
           
           /* Od korisnik tražiti unos broja*/
                   
           System.out.println("Unesite broj: \n");
           Scanner s = new Scanner(System.in);
           int broj = s.nextInt();
           
           /* u slucaju da broj ne postoji , stavljamo proveru (uvek mora da postoji provera)*/
        
          boolean provera = false;
          
          /*  pravimo niz koji trebamo da proverimo da li u njemu postoji broj*/
          
          int [] niz = {1,22,33,44,55,66,77,88,99};
          
          /* proveravamo broj*/
          
          for (int i = 0; i < niz.length; i++) {
              if (niz[i]== broj) {
                  provera = true;
                  System.out.println("NIZ JE PRONADJEN!");
                  
              }
              
        } 
          if (!provera) {
          System.out.println("Broj nije pronadjen!");  
        }
          
              
         
          
        
    }

}
