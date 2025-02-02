
package neograniceni_red;

class NeograniceniRed {
    Element glava;
    
    public void enqueue(int podatak){
        Element n= new Element(podatak);
        if (glava==null) {
            glava=n;
            return;
        }
        Element trenutni=glava;
        while (trenutni.getSledeci() !=null) {            
            trenutni= trenutni.getSledeci();
        }
        trenutni.setSledeci(n);
    
    
    }
    public Element dequeue(){
        if (glava==null) {
            System.out.println("Red je prazan");
            return null;
        }
        Element trenutni2=glava;
       glava=glava.getSledeci();
       return trenutni2;
 
    }
    public void prikazi(){
        for (Element i = glava; i != null; i=i.getSledeci()) {
            System.out.println(i);
        }
    }
}
