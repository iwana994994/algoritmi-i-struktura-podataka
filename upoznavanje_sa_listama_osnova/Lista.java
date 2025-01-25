
package upoznavanje_sa_listama_osnova;

class Lista {
    /*
    2.Moramo da definisemo sta je pocetka liste 
    3. Element u "pocetak " ce biti NULL vrednost.
    */
    /* 
    Private znaci da samo preko funkcije mozemo da ih menjamo .
    */
    /*private Element pocetak;
    void dodaj(Element n){
    
    Kako dodajemo element:
    1. pretpostavimo da je lista prazna u pocetku.
    2.Moramo da definisemo sta je pocetka liste 
    3. Ispitujemo da li je "pocetak NULL "
    
    if (pocetak == null) {
    pocetak= n;
   
}
}
*/
    Element pocetak;
    
void dodaj(int n){
    if (pocetak ==null) {
        pocetak=new Element(n);   /*--> za ovo nam treba konstruktor u KLASI ELEment koji ce prihvatati n vrednsot*/
    }
    
    
}}