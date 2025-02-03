
package moje_vezbanje_3;

public class Student {
         String ime; String prezime; //ime i prezime studenta (String)
           String maticni_broj; //matični broj studenta (String)
           String sifra_predmeta; //šifru predmeta (String)
           double ocena; //ocenu (double)
           Student sledeci;

    public Student getSledeci() {
        return sledeci;
    }

    public void setSledeci(Student sledeci) {
        this.sledeci = sledeci;
    }

    public Student(String ime, String prezime, String maticni_broj, String sifra_predmeta, double ocena) {
        this.ime = ime;
        this.prezime = prezime;
        this.maticni_broj = maticni_broj;
        this.sifra_predmeta = sifra_predmeta;
        this.ocena = ocena;
    }


    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return "Student{" + "ime= " + ime + ", prezime= " + prezime + ", maticni_broj=" + maticni_broj + ", sifra_predmeta=" + sifra_predmeta + ", ocena=" + ocena + '}';
    }
    
}

