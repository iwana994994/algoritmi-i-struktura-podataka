
package moje_vezbe_5;
public class Moje_vezbe_5 {

    public static void main(String[] args) {
               
        /*U red, koji je realizovan jednostruko povezanom listom, čuvaju se zapisi   o studentima. Svaki zapis sadrži 
            matični broj (String)
            prosek ocena (double)
            i godinu prvog upisa studija (int)
         Napisati funkciju za skidanje elemanta iz reda. Ako je operacija uspešno 
        obavljena funkcija vraća true, ukoliko nije vraća false. Definisati 
        klase i funkcije potrebne za rešenje ovog zadatka.
*/
        
        Red r= new Red();
        
         r.enqueue(new Student("123456", 8.5, 2020));
        r.enqueue(new Student("654321", 9.0, 2021));
        r.enqueue(new Student("111222", 7.5, 2019));
        


        // Uklanjanje studenta iz reda
        
        if (r.dequeue()) {
            System.out.println("Student je uspešno uklonjen.");
        }

        // Prikazivanje studenata nakon uklanjanja
        System.out.println("Studenti u redu nakon uklanjanja:");
        r.prikazi();
        
        
        
    }

}
