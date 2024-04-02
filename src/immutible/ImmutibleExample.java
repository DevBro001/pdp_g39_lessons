package src.immutible;

public class ImmutibleExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Uzb", "Beruniy",3);
        User user = new User("Salim",15, address);
        System.out.println(user);
        System.out.println(user);
    }
}
