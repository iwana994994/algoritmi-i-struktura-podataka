
package moje_vezbe_8;

class Stek {
   
    int kapacitet;
    Student [] stek;
    int vrh;
    

    public Stek(int kapacitet) {
        this.kapacitet = kapacitet;
        this.stek= new Student[kapacitet];
        this.vrh=0;
    }
    
    public void dodaj(Student s){
        if (vrh==kapacitet) {
            System.out.println("stek je pun!");
            return ;
        }
        stek[vrh++]=s;
        
    
    }
    public Student obrisi(){
        if (vrh==0) {
            System.out.println("stek je prazan ");
            System.exit(1);
        }
    return stek[--vrh];
    
    }
    
    
    public void prikazi (){
    
        for (int i = 0; i < vrh; i++) {
            System.out.println(stek[i]);
        }
    
    }    
}
