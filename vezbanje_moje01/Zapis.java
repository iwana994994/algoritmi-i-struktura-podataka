
package vezbanje_moje01;

class Zapis {
    long siffra;    // šifru procesa (long)
     String opis;   //      opis prosesa (String)
     Zapis sledeci;

    public Zapis(long siffra, String opis) {
        this.siffra = siffra;
        this.opis = opis;
    }

    @Override
    public String toString() {
        return  "siffra=   " + siffra + ", opis=   " + opis ;
    }
    



}
