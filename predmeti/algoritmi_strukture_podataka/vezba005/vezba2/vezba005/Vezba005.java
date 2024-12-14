/*naci najveci element u radnom nizu*/

package vezba005;

import java.util.Random;


public class Vezba005 {

    public static void main(String[] args) {
        Random r= new Random();
        int [] niz= new int[5];
        int broj=Integer.MIN_VALUE;
        
        for (int i = 0; i < niz.length; i++) {
            niz[i]=r.nextInt(50)+1;
                       
        }
        
        for (int i = 0; i < niz.length; i++) {
            
            if (niz[i] > broj) {
                broj=niz[i];
                
            }
            
        }
        for (int neki_broj:niz) {
            System.out.println(neki_broj+" ");
            
        }
        
        System.out.println("najveci broj je : " +broj);
        
    }

}
