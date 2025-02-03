
package moje_vezbanje_4;

public class Student {
    int sifra;
    String ime;
    String prezime;
    Student sledeci;

    public Student getSledeci() {
        return sledeci;
    }

    public void setSledeci(Student sledeci) {
        this.sledeci = sledeci;
    }

    public Student(int sifra, String ime, String prezime) {
        this.sifra = sifra;
        this.ime = ime;
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Student{" + "sifra=" + sifra + ", ime=" + ime + ", prezime=" + prezime + '}';
    }
    
    
    
}
