class Wettkampf {
    private String name;
    private Schiff[] schiffe;
  
   
    public Wettkampf(String name) {
      this.name = name;
      this.schiffe = new Schiff[5];
    }
  
    
    public String getName() {
      return this.name;
    }
  
   
    public void addSchiff(Schiff s) {
      for (int i = 0; i < this.schiffe.length; i++) {
        if (this.schiffe[i] == null) {
          this.schiffe[i] = s;
          break;
        }
      }
    }
  
    public void start() {
      for (Schiff s : this.schiffe) {
        if (s != null) {
          s.race();
        }
      }
    }
  
  
    public void printSchiffe() {
      System.out.println(this.name);
  
      for (Schiff s : this.schiffe) {
        if (s != null) {
          System.out.println("Nr: " + s.getNr() + ", Name: " + s.getName() + ", Zeit: " + s.getTime() + ", Besitzer: " + s.getBesitzer().getName());
        }
      }
    }
  }
  
  