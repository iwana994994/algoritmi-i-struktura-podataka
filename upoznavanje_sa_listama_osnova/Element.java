
package upoznavanje_sa_listama_osnova;

class Element {
    int podatak;
    Element sledeci;
    
    public Element(int n){
    podatak=n;}
    public String toString(){
        
        return ""+podatak;
    }
}
