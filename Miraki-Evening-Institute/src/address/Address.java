package address;

public class Address
{
    private String street;
    private String city;
    private String Parish;

    public Address()
    {
    	street="";
    	city="";
    	Parish="";
    }

  
    public Address(String street, String city, String Parish) {
        this.street = street;
        this.city = city;
        this.Parish = Parish;
    }

  //Getters and Setters
  
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getParish() {
        return Parish;
    }

    public void setParish(String Parish) {
        this.Parish = Parish;
    }

    @Override
    public String toString() {
        return "street:" + street + " | city:" + city + " | Parish: " + Parish;
    }
  
  
}
