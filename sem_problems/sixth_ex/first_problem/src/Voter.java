public class Voter {
    private String name;
    private String city;
    private String street;
    private int address;

    public Voter(String name, String city, String street, int address){
        this.name = name;
        this.city = city;
        this.street = street;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + " lives in " + this.city + " on street" + this.street+" " + this.address;
    }
}
