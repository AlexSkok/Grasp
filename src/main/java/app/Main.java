package app;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        User user = new User(address);

        user.setAddress("Kyiv");
        System.out.println(user.getAddress(address));
        System.out.println(address.getAddress());
        System.out.println(user.getAddress(address).equals(address.getAddress()));
    }
}