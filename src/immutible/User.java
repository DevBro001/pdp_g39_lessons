package src.immutible;

public class User {
    private final String name;
    private final Integer age;
    private final Address address;

    public User(String name, Integer age,Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() throws CloneNotSupportedException {
        Address clone = (Address)address.clone();
        return clone;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
