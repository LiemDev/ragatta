class Besitzer {
    private String name;
    private String address;
    private String phoneNumber;

    public Besitzer(String name, String address, String phoneNumber) {
      this.name = name;
      this.address = address;
      this.phoneNumber = phoneNumber;
    }

    public void setName(String name) {
      this.name = name;
    }
  

    public String getName() {
      return this.name;
    }
  
    public void setAddress(String address) {
      this.address = address;
    }
  
    public String getAddress() {
      return this.address;
    }

    public void setPhoneNumber(String phoneNumber) {
      this.phoneNumber = phoneNumber;
    }
  
    
    public String getPhoneNumber() {
      return this.phoneNumber;
    }
  }
  