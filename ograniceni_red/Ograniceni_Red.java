
package ograniceni.red;

class Ograniceni_Red {
    private int [] red;
    int kapacitet;
    int glava;
    int rep;
    int duzina;

    public Ograniceni_Red(int kapacitet) {
        this.kapacitet = kapacitet;
        this.red= new int[kapacitet];
    }
    
    public void enqueu(int vrednost){
        if (duzina==kapacitet) {
            System.out.println("red je pun");
            return;
        }
        red[rep++ %kapacitet]=vrednost;
        duzina++;
    }
    public int dequeu(){
        if (duzina==0) {
            System.out.println("red je prazan");
            System.exit(1);
        }
        duzina--;
        return red[glava++ %kapacitet];
    }
    public void prikazi(){
        for (int i = glava; i < glava+duzina; i++) {
            System.out.println(red[i %kapacitet]);
        }
    
    }
    
    
}
