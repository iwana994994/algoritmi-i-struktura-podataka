

package jedinstven.niz.brojeva;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class JedinstvenNizBrojeva {

    public static void main(String[] args) {
        /*
        Uneti nizove A i B
        celobrojnih vrednosti dužine N,
        
        gde N mora biti u opsegu 10 <= N <= 100.
        Elementi niza moraju biti jedinstveni.
        */
    
        System.out.println("unesi duzinu niza u opsegu 10-100: ");
        int N= new Scanner(System.in).nextInt();
        
        if (N<10 || N>100) {
            System.out.println("Izaberite broj u opsegu 10-100!");
        }
       
          
            int[]niz1=new int[N];
            for (int i = 0; i < niz1.length; i++)
            {while(true){
                int jedinstven_broj= new Random().nextInt(100)+1;
                boolean jedinstvenost= true;
                for (int j = 0; j < i; j++) {
                    if (jedinstven_broj==niz1[j]) {
                        jedinstvenost=false;
                    }
                    
                }if (jedinstvenost) {
                        niz1[i]=jedinstven_broj;
                        break;
                }}
                
            }
            System.out.println(Arrays.toString(niz1)+"       jedinstven niz");
            }
            
         
            
            
            
        }
    


