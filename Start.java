public class Start {
    public static void main(String[] args) {
  
      Besitzer b1 = new Besitzer("Besitzer 1", "Address 1", "12345678");
  
   
      Wettkampf wettkampf = new Wettkampf("Test Wettkampf");
  
    
      Schiff s1 = new Schiff(1, "Schiff 1", b1);
      Schiff s2 = new Schiff(2, "Schiff 2", b1);
      Schiff s3 = new Schiff(3, "Schiff 3", b1);
  

      wettkampf.addSchiff(s1);
      wettkampf.addSchiff(s2);
      wettkampf.addSchiff(s3);
  

  
      wettkampf.start();
  
    
      wettkampf.printSchiffe();
    }
  }
  