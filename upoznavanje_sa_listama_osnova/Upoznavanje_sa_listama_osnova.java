

package upoznavanje_sa_listama_osnova;

import java.util.ArrayList;
import java.util.List;






public class Upoznavanje_sa_listama_osnova {

    public static void main(String[] args) {
        /*
        List <Integer>lista = new ArrayList();
        lista.add(1111111);
        lista.add(22222);
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }*/
        
       /* Treba da napravimo nasu listu 
        u toj listi treba da imamo funkcijau "dodaj"
        koji ce omoguciti da se doda broj ili string u nasoj listi
        */
       Lista lista = new Lista();
       lista.dodaj(5);
        System.out.println(lista.pocetak.podatak);
       /* lista.dodaj("Ivana Pavlovic");*/
    }

}
