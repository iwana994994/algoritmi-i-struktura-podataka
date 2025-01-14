

package vezba.ispitni.zadatak;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class VezbaIspitniZadatak {

    public static void main(String[] args) {
        /*
        Napraviti dva niza A i B celobrojnih vrednost N i M gde važi da su 
        10 <= N <= 100 i
        10 <= M <= 100
        gde je N dužina niza A, a M dužina niza B
        
        Uraditi učešljavanje niza A i niza B u novi niz C po sledećem rasporedu:
        A 0, B 0, A 1, B 1, ...., A n-2, B n-2, A n-1, B n-1
        dokle god ima elemenata u jednom nizu, a zatim nastaviti veći niz.
        */
        int N= unesi("Unesite duzinu prvog niza: ");
        int M= unesi("Unesite duzinu drugog niza: ");
        
        int[]A= new int[N];
        int[]B= new int[M]; 
        popuni(A);
        popuni(B);
        
        int [] C= new int[N+M];
        
       
        
        int i=0;
        int j=0;
        int k=0;
        
        
        while (i<N && j<M) {            
            C[k++]=A[i++];
             C[k++]=B[j++]; 
        
        }
        
        while(i<N){
        C[k++]=A[i++];}
        
        while(j<M){
        C[k++]=B[j++];}
        
        System.out.println("----------------------");
        System.out.println(Arrays.toString(C));
    }

    private static int unesi(String text) {
        System.out.println(text);
        int broj=new Scanner(System.in).nextInt();
        while (true) {            
            if (broj>=10 && broj <=100) {
                break;
            }
            System.out.println("Broj nije u opsegu 10-100");
        }
        return broj;
    }

    private static void popuni(int[] niz) {
        Random r= new Random();
        for (int i = 0; i < niz.length; i++) {
            niz[i]= r.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(niz));
        
        
        
        
        
    }

  

}
