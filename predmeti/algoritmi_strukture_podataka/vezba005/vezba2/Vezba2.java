

package vezba2;


public class Vezba2 {

    public static void main(String[] args) {
        
        
        /*2.  Sastaviti rekurzivnu funkciju za nalaženje elemenata maksimalne vrednosti
        iz niza celih brojeva. Ispisati maksimalnu vrednost.*/
        
        /* pravljenje niza*/
        
        int [] niz= {11,22,33,44,55,66,77,88,99};
        
        int resenje_rekurzije_max_broj= rekurzija_niza(niz, niz.length);   /* niz.length je okidac za izlazak iz niza, jer kada
                                                                          nema vise elemenata u nizu tada se zavrsava
        */
        System.out.println("max broj je " + resenje_rekurzije_max_broj);
       
        
        
    }

    private static int rekurzija_niza(int[] niz, int duzina_niza) {
        /* Proverava dužinu niza (duzina_niza):
        U rekurziji pratimo koliko elemenata preostaje da analiziramo.
        Kada n bude 1, to znači da je preostao samo jedan element u nizu.

           Vraća taj element kao maksimum: Ako je niz veličine 1 (n == 1), 
        onda je jedini element tog niza i maksimalni element, pa ga vraćamo: return niz[0]*/
        if (duzina_niza == 1) {
           return niz[0];
        }
        /*Bez osnovnog slučaja, funkcija bi se pozivala beskonačno 
        jer bi uvek pokušavala da "pogleda" još jedan element niza. */
        
        /* sada pokrecemo ono sto se naziva da poziva samu sebe
        tako sto napravimo promenjivu koja u sebi i ima funkciju u kojoj se nalazi
        */
        
        
        
        int max= rekurzija_niza( niz, duzina_niza-1);   /* varijablja se zove max jer trazimo celi broj*/
        if (niz[duzina_niza-1]>max) {   /* ovde proveravamo da li je sledeci broj veci od onog koji se
                                            nalazi u promenjivoj
            */
            return niz[duzina_niza-1];   /* ako jeste njega vracamo*/
        }
         else 
            return max;   /* ako nije vracamo broj koji je u promenjivoj  --- to je u stvari niz[0] i osna postavka*/
        
    };

}
