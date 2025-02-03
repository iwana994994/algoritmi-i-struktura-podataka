
package moje_vezbanje_3;

import java.util.List;

class Lista {
    Student glava;
    public void dodaj(Student s){
    
        if (glava==null) {
            glava=s;
            return;
        }
        Student trenutni=glava;
        while (trenutni.getSledeci()!=null) {            
            trenutni= trenutni.getSledeci();
        }
        trenutni.setSledeci(s);
  
    
    
    }
 
   
    public int BrojIzbacenih() {
           int brojac=0;
        Student trenutni = glava;

        while (trenutni != null) {
            if (trenutni.getOcena() == 1) {
                brojac++;
            }
            trenutni = trenutni.getSledeci();
        }
        return brojac;}
    public void prikazi(){
        int brojac=BrojIzbacenih();
       System.out.println("Broj izbacenih studenata je : "+brojac);} 
    }
   
    
    

