
package neograniceni_stek;

class NeograniceniStek {
   Element stek;
   
   public void push(int vrednost){
   Element n =new Element(vrednost);
       if (stek==null) {
           stek=n;
          return;
       }
      n.setPredhodni(stek);
      stek=n;
   }
   public  Element pop(){
       if (stek==null) {
           return stek;
       }
       Element e= stek;
       stek= stek.getPredhodni();
       return e;
   }
   public Element peek(){
       if (stek== null) {
           System.out.println("stek je prazan");
           return stek;
       }
       return stek;
   
   }
   
   
   
   
   
   public void prikazi(){
       for (Element n=stek;n!=null;n=n.getPredhodni()) {
           System.out.println(n);
       }
       }
   
   
   }
    
    
    
    
    

