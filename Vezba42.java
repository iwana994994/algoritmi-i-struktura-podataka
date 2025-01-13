

package vezba4.pkg2;

import java.util.Arrays;
import java.util.Random;


public class Vezba42 {

    public static void main(String[] args) {
  /* 2. Napraviti niz tako da sadrži elemente iz dva niza, gde će elementi novog niza biti raspoređeni na sledeći način:
        
            niz1[0, 1, 2, ..., n - 1]
         a zatim dodati elemente drugog niza na sledeći način:
           niz2[0,2,3,4,5,...]
*/
    
       
        int [] niz1= {1,2,3,4,5,6,7,8};
       int [] niz2= {9,10,11,12,13,14,15};
     int [] niz3= new int[niz1.length+niz2.length];
        for (int i = 0; i < niz1.length; i++) {
            niz3[i]=niz1[i];
        }
        
        
        for (int i = 0; i < niz2.length; i++) {
            niz3[niz1.length+i]=niz2[i];
        }
        System.out.println(Arrays.toString(niz3)+"dodavanje jedan iza drugog");
        
        
         /* 2. Napraviti niz tako da sadrži elemente iz dva niza, gde će elementi novog niza biti raspoređeni na sledeći način:
        
            niz1[0, 1, 2, ..., n - 1]
         a zatim dodati elemente drugog niza na sledeći način:
           niz2[0,2,3,4,5,...]
        
*/
  
        // Prvo pravimo dva radna niza sa 10 i 5 brojeva u nizu
        Random r1 = new Random();
        int[] nizA = new int[10];
        int[] nizB = new int[5];

        // Popunjavanje nizA sa slučajnim brojevima
        for (int i = 0; i < nizA.length; i++) {
            nizA[i] = r1.nextInt(20); // Generiše slučajan broj između 0 i 19
        }

        // Popunjavanje nizB sa slučajnim brojevima
        for (int i = 0; i < nizB.length; i++) {
            nizB[i] = r1.nextInt(20); // Generiše slučajan broj između 0 i 19
        }

        for (int i = 0; i < nizA.length; i++) {
            for (int j = 0; j < nizA.length; j++) {
               
                if (nizA[i]<nizA[j]) {
                     int temp= nizA[i];
                     nizA[i]=nizA[j];
                     nizA[j]=temp;
                }
            }
        }
        
        System.out.println(Arrays.toString(nizA));
        System.out.println(Arrays.toString(nizB));
        System.out.println("-----------------------------------------------");
        
        
        /*neka prvi niz bude u rastucem poretku a drugi niz u opadajucem */
        int [] niz11= {5,4,3,2,1};
        int [] niz22= {6,7,8,9,10};
        
        for (int i = 0; i < niz11.length; i++) {
            for (int j = 0; j < niz11.length; j++) {
                if (niz11[i]<niz11[j]) {
                    int temp=niz11[i];
                    niz11[i]=niz11[j];
                    niz11[j]=temp;
                }
            }
        }
      
        int[]niz33= new int[niz11.length+niz22.length];
        for (int i = 0; i < niz11.length; i++) {
            niz33[i]=niz11[i];
        }
        for (int i = 0; i < niz22.length; i++) {
            niz33[niz11.length+i]=niz22[i];
        }
        System.out.println(Arrays.toString(niz33));
        
    }
}