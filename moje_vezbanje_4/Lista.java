
package moje_vezbanje_4;

class Lista {
        /*
Napisati funkciju koja formira listu studenata tako što se prvo unosi  
šifra i ukoliko je ona različita od 0, onda se unose ime i prezime, 
a u  suprotnom se prekida formiranje liste.
        Za svakog studenta pamtiti ime,  prezime i šifru.
Ispisati tako formiranu listu.*/ 
     Student glava;
     
     public void dodaj(Student s){
         if (glava==null) {
             glava=s;
             return;
         }
         Student trenutna=glava;
         while (trenutna.getSledeci()!=null) {             
             trenutna=trenutna.getSledeci();
         }
         trenutna.setSledeci(s);  
     }
     
     public void prikazi(){
         for (Student i = glava; i!=null; i=i.getSledeci()) {
             System.out.println(i);
         }
     
     }
    
    
    
    
    
}
