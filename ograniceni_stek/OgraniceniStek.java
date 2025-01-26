
package ograniceni_stek;

class OgraniceniStek {
    int kapacitet;
    int vrh;
    int [] stek;

    public OgraniceniStek(int kapacitet) {
        this.kapacitet = kapacitet;
        this.vrh = 0;
        this.stek= new int [kapacitet];
    }
    public void push(int vrednost){
        if (kapacitet==vrh) {
            System.out.println("stek je pun");
            return ;
        }
        stek[vrh++]=vrednost;
    }
    public int pop(){
        if (vrh==0) {
            System.out.println("Stek je prazan.");
           System.exit(1);
        }
        return stek[--vrh];
     }
    public int peek(){
    if (vrh==0) {
            System.out.println("Stek je prazan.");
              System.exit(1);
        }
    return stek[vrh-1];
    
    }
    
    public void prikazi(){
        
        if (vrh==0) {
            System.out.println("stek je prazan");
        }
    
        for (int i = 0; i < vrh; i++) {
            System.out.println(stek[i]);
        }
    
    }
    
    
    
    
    
    
}
