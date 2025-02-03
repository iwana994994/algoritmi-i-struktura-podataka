
package moje_vezbanje_2;
class Reci {
     String text;
     Reci sledeci;
     
     int brojac;

    public String getText() {
        return text;
        
    }

    public void setText(String text) {
        this.text = text;
    }

    public Reci getSledeci() {
        return sledeci;
    }

    public void setSledeci(Reci sledeci) {
        this.sledeci = sledeci;
    }

   

    public int getBrojac() {
        return brojac;
    }

    public void setBrojac(int brojac) {
        this.brojac = brojac;
    }

    public Reci(String text) {
        this.text = text;
        this.brojac = BrojSamoglasnika(text);
        
    }
    public int BrojSamoglasnika(String text){
        brojac=0;
        for (int i = 0; i < text.length(); i++) {
            char slovo = text.charAt(i);
            
            switch (slovo) {
                case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
            brojac++;
            break;
            }   
        }
        return brojac;
    }

    @Override
    public String toString() {
        return "" + text+ brojac ;
    }
    
    
}
