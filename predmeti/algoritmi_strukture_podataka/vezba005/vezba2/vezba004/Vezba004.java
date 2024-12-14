/*
        Od korisnik tražiti unos broja, a zatim taj broj pretražiti u celobrojnom nizu
        i ispisati njegovu poziciju, ili prikazati da broj ne postoji u datom nizu.
        */
    
    

package vezba004;

import java.util.Random;
import java.util.Scanner;


public class Vezba004 {

    public static void main(String[] args) {
        
        
        System.out.println("Unesi broj: ");
        Scanner scanner =new Scanner(System.in);
        int broj= scanner.nextInt();
        
        Random r= new Random();
        int []niz= new int[5];
        int min =1;
        int max =20;
          boolean nadjen_broj= false;
          
          
        for (int i = 0; i < niz.length; i++) {
      niz[i] = r.nextInt((max - min) + 1) + min;  //veci broj se oduzima od manjeg
      
            
        
      
        if (broj== niz[i]) {
            nadjen_broj=true;
            System.out.println("nasli ste broj , na poziciji"+i);
        }
        
        }
        if (!nadjen_broj) {
            System.out.println("niste pronasli broj");
        }
        //provera niza
        System.out.println("Generisani niz:");
        for (int num : niz) {
            System.out.print(num + " ");
        }
        System.out.println();
        
    }

}
