class Schiff {
    private int number;
    private String name;
    private int time;
    private Besitzer besitzer;
  
  
    public Schiff(int number, String name, Besitzer besitzer) {
      this.number = number;
      this.name = name;
      this.besitzer = besitzer;
    }
  

    public void setNr(int number) {
      this.number = number;
    }
  
   
    public int getNr() {
      return this.number;
    }
  
  
    public void setName(String name) {
      this.name = name;
    }
  

    public String getName() {
      return this.name;
    }
  

    public void setBesitzer(Besitzer besitzer) {
      this.besitzer = besitzer;
    }
  
  
    public Besitzer getBesitzer() {
      return this.besitzer;
    }
  
    
    public void race() {
      this.time = (int) (Math.random() * (600 - 300 + 1) + 300);
    }
  
    public int getTime() {
      return this.time;
    }
  }
  