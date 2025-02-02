

package vezbanje_moje01;


public class Vezbanje_moje01 {

    public static void main(String[] args) {
        
        
        /*    
        Red je realizovan kao polje, koje može primiti najviše MAXZAPIS zapisa.
        Svaki zapis sadrži sledeće podatke:
            šifru procesa (long)
            opis prosesa (String)
        Potrebno je napisati funkciju koja dodaje zapis u red.
        Funkcija treba vratiti true ukoliko je zapis dodat u red, a u suprotnom   false.
*/
        
        Zapis z = new Zapis(1,"dsfds");
        Zapis z2 = new Zapis(2,"dfsfsd");
        Zapis z3 = new Zapis(3,"dfsfsd");
        Zapis z4 = new Zapis(4,"dfsfsd");
        
        
        OgranicenRed red=new OgranicenRed(3);
        System.out.println(red.enqueue(z));
        System.out.println(red.enqueue(z2));
        System.out.println(red.enqueue(z3));
        System.out.println(red.enqueue(z4));
    }

}
