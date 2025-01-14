

package vezba05;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Vezba05 {

    public static void main(String[] args) {
         /*
        Generisati niz A realnih vrednosti dužine N,
        gde N mora biti u opsegu 10 <= N <= 100
        Pronaći najmanji broj i sve njegove pozicije upisati u niz B.
        */
           System.out.println("Unesi duzinu niza  10-100: ");
               int N =new Scanner(System.in).nextInt();
     
         while (true) {  
             
               
             if (N <10 || N >100) {
                 System.out.println("Broj treba biti u opsegu 10-100");
                
             } 
             break;
         }
             
                 int [] niz= new int [N];
         Random r = new Random();
         for (int i = 0; i < N; i++) {
            niz[i]= r.nextInt(100)+1;
        }
         System.out.println(Arrays.toString(niz));
         System.out.println("----------------------------------------");
         
        int min = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (niz[i]<min) {
                min= niz[i];
            }
        }
        
        int brojac=0;
        for (int i = 0; i < niz.length; i++) {
            if (min== niz[i]) {
               brojac++;
            }
        }
        int []niz2= new int[brojac];
        brojac=0;
        
        for (int i = 0; i <niz.length; i++) {
            if (min== niz[i]) {
                niz2[brojac++]=i;
            }
        }
        System.out.println(min);
        System.out.println(Arrays.toString(niz2));
        }
        
         
         
         
    } 

