

package moje_vezbanje_3;


public class Moje_vezbanje_3 {

    public static void main(String[] args) {
  /*
        U listi se čuvaju podaci o rezultatima ispita. Jedan element liste   sadrži sledeće podatke:
            ime i prezime studenta (String)
            matični broj studenta (String)
            šifru predmeta (String)
            ocenu (double)
       Lista nije sortirana. 
        Napisati funkciju koja će iz liste izbaciti negativno ocenjene studente 
        (one koji imaju ocenu 1). Funkcija vraća broj izbačenih članova iz liste.
*/
  
  
         Lista l= new Lista();
        l.dodaj(new Student("Marko", "Marković", "123456", "MAT101", 1));
        l.dodaj(new Student("Ana", "Anić", "654321", "MAT101", 5));
        l.dodaj(new Student("Petar", "Petrović", "789012", "MAT101", 3));
        l.dodaj(new Student("Jelena", "Jelić", "345678", "MAT101", 1));
        l.prikazi();
    }

}
