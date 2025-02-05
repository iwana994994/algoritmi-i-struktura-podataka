
package moje_vezbe_8;


class Student {
    int sifraIspita;//šifra ispita, 
    int sifraStudenta;//šifra studenta
    int ocena;//i ocena.

    public Student(int sifraIspita, int sifraStudenta, int ocena) {
        this.sifraIspita = sifraIspita;
        this.sifraStudenta = sifraStudenta;
        this.ocena = ocena;
    }
    
    public void prolazne_ocene(int ocena){
    
    
    
    }

    @Override
    public String toString() {
        return "Student{" + "sifraIspita= " + sifraIspita + ", sifraStudenta= " + sifraStudenta + ", ocena= " + ocena + '}';
    }
    
    
    
}
