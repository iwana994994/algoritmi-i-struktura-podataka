
package moje_vezbanje_7;


class Red {
    Element glava;
    
    public void dodaj(Element n){
        if (glava==null) {
            glava=n;
            return;
        }
        Element trenutna=glava;
        while (trenutna.getSledeci()!=null) {            
            trenutna=trenutna.getSledeci();
            
        }
        trenutna.setSledeci(n);
    
    }
    public Element brisi(){
        if (glava==null) {
            System.out.println("Lista je prazna!");
            return null;
        }
        Element trenutni=glava;
        glava=glava.getSledeci();
        return trenutni;
    
    }
    public void prikazi(){
        for (Element i = glava; i !=null; i=i.getSledeci()) {
            System.out.println(i);
        }
    
    }
    
    
    
    
    
}
