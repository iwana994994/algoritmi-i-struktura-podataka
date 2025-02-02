
package vezbanje_moje01;

class OgranicenRed  {
    
    
        /*    
        Red je realizovan kao polje, koje može primiti najviše MAXZAPIS zapisa.
        Svaki zapis sadrži sledeće podatke:
            šifru procesa (long)
            opis prosesa (String)
        Potrebno je napisati funkciju koja dodaje zapis u red.
        Funkcija treba vratiti true ukoliko je zapis dodat u red, a u suprotnom   false.
*/
    
   Zapis [] red;
    int kapacitet;
    int duzina;
    int glava;
    int rep;

    public OgranicenRed(int kapacitet) {
        this.kapacitet = kapacitet;
        this.red= new Zapis [kapacitet];
    }
    public boolean enqueue( Zapis z){
        
        if (glava == kapacitet) {
            System.out.println("red je pun");
            return false;
        }
        red[glava++]=z;
        return true;
    
    
    }
    
}
