
package neograniceni_stek;

class Element {
    int podatak;
   Element predhodni;
   
   public Element (int n){
   this.podatak=n;}

    public int getPodatak() {
        return podatak;
    }

    public void setPodatak(int podatak) {
        this.podatak = podatak;
    }

    public Element getPredhodni() {
        return predhodni;
    }

    public void setPredhodni(Element predhodni) {
        this.predhodni = predhodni;
    }


    public String toString(){
        return ""+podatak;
    }
}
