

package ograniceni_stek;


public class Ograniceni_stek {

    public static void main(String[] args) {
        
        OgraniceniStek stek= new OgraniceniStek(10);
        stek.push(10);
        stek.push(15);
        stek.push(20);
        stek.pop();
       
        stek.prikazi();
    }

}
