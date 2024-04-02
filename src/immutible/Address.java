package src.immutible;

public class Address implements Cloneable {
    private final String country;
    private final String street;
    private final int numberOfHouse;

    public Address(String country, String street, int numberOfHouse) {
        this.country = country;
        this.street = street;
        this.numberOfHouse = numberOfHouse;
    }

    public String getCountry() {
        return country;
    }


    public String getStreet() {
        return street;
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }


    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", numberOfHouse=" + numberOfHouse +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
