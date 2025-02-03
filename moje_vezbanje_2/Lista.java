
package moje_vezbanje_2;

class Lista {
    /* Zadatak 2.
    Napisati funkciju koja formira listu stringova koji su sortirani po  broju samoglasnika. 
        Stringovi se unose sa standardnog ulaza dok se ne unese "KRAJ". Potom treba ispisati listu stringova.
*/
    
    Reci glava;
    
    public void push(Reci r){
        if (glava == null || r.getBrojac()< glava.getBrojac()) {
            r.setSledeci(glava);
            glava=r;
            return;
        }
        
        Reci trenutni=glava;
       
        while (trenutni !=null && trenutni.getBrojac()>r.getBrojac()) {            
           
            trenutni =trenutni.getSledeci();
        }
        r.setSledeci(trenutni.getSledeci());
       trenutni.setSledeci(r);

    }
    public void prikazi(){
        for (Reci i = glava; i !=null; i=i.getSledeci()) {
            System.out.println(i+"  ");
        }
    
    }
    
    
    
    
}
