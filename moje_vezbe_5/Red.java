
package moje_vezbe_5;


class Red {
     /*U red, koji je realizovan jednostruko povezanom listom, čuvaju se zapisi   o studentima. Svaki zapis sadrži 
            matični broj (String)
            prosek ocena (double)
            i godinu prvog upisa studija (int)
         Napisati funkciju za skidanje elemanta iz reda. Ako je operacija uspešno 
        obavljena funkcija vraća true, ukoliko nije vraća false. Definisati 
        klase i funkcije potrebne za rešenje ovog zadatka.
*/
    
    Student glava;
    
    public void enqueue(Student s){
        if (glava==null) {
            glava=s;
            return;
        }
    Student trenutni=glava;
        while (trenutni.getSledeci()!=null) {            
            trenutni=trenutni.getSledeci();
        }
        trenutni.setSledeci(s);
    
    }
    public boolean dequeue(){
        
        if (glava==null) {
            System.out.println("red je prazan!");
            return true;
        }
        Student trenutni=glava;
        glava=glava.getSledeci();
        return false;
    
    
    }
    public void prikazi (){
        for (Student i =glava; i !=null; i=i.getSledeci()) {
            System.out.println(i);
        }
    
    }
    
}
