/*3.   Napisati funkciju koja će generisati i vratiti niz realnih 
    vrednosti. Funkcija prihvata dve celobrojne vrednosti, jednu 
    za broj elemenata, a drugu za opseg nasumičnih brojeva.*/

package vezba003;

import java.util.Arrays;
import java.util.Random;


public class Vezba003 {
    
  

    public static void main(String[] args) {
        
       int [] niz= generator(10,50);
        
        /* Sortiramo te brojve*/
        for (int i = 0; i < niz.length; i++) {
            for (int j = 0; j < niz.length; j++) {
                if (niz[i]>niz[j]) {
                    int temp= niz[i];
                niz[i]=niz[j];
                niz[j]=temp;
            }
            }
        }
 System.out.println(Arrays.toString(niz));

}

    private static int[] generator(int broj_elementa, int opseg) {
        Random r= new Random();
        int[] niz=new int[broj_elementa];
        for (int i = 0; i < niz.length; i++) {
            niz[i]= r.nextInt(opseg);
           
            
    
            
        }
        return niz;
        
    }
    }



