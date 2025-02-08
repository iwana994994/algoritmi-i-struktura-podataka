

package pallindrom;

import java.util.Scanner;


public class Pallindrom {

    public static void main(String[] args) {
        System.out.println("Unesi rec");
        String rec= new Scanner(System.in).next();
        System.out.println(palindrom(rec));
        
        
        
    }
    public static boolean palindrom (String rec1){
    String zaokrenuta= new StringBuilder(rec1).reverse().toString();
    return rec1.equals(zaokrenuta);
    
    }
   

}
