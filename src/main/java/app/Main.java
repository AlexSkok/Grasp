package app;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Address address = new Address();

        user.setAddress(address, "Kyiv");
        System.out.println(user.getAddress(address));;
        System.out.println(address.getAddress());
        System.out.println(user.getAddress(address).equals(address.getAddress()));

    }
}