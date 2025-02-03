
package moje_vezbe_5;


class Student {
   String maticni_broj;        // matični broj (String)
        double ocena;    //prosek ocena (double)
         int godinaUpisa;   //i godinu prvog upisa studija (int)
         Student sledeci ;

    public Student getSledeci() {
        return sledeci;
    }

    public void setSledeci(Student sledeci) {
        this.sledeci = sledeci;
    }

    public Student(String maticni_broj, double ocena, int godinaUpisa) {
        this.maticni_broj = maticni_broj;
        this.ocena = ocena;
        this.godinaUpisa = godinaUpisa;
    }

    @Override
    public String toString() {
        return "Student{" + "maticni_broj=" + maticni_broj + ", ocena=" + ocena + ", godinaUpisa=" + godinaUpisa + '}';
    }
         
         
    
}
