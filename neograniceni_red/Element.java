
package neograniceni_red;

class Element {
    int podatak;
    Element sledeci;

    public Element(int podatak) {
        this.podatak = podatak;
    }

    public int getPodatak() {
        return podatak;
    }

    public void setPodatak(int podatak) {
        this.podatak = podatak;
    }

    public Element getSledeci() {
        return sledeci;
    }

    public void setSledeci(Element sledeci) {
        this.sledeci = sledeci;
    }

    @Override
    public String toString() {
        return ""+podatak;
    }
    
    
}
