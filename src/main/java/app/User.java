package app;

public class User{
    private Address address;

    public User(Address userAddress) {
        this.address = userAddress;
    }

    public String getAddress(Address userAddress) {
        this.address = userAddress;
        return this.address.getAddress();
    }

    public void setAddress(Address userAddress, String address) {
        this.address = userAddress;
        userAddress.setAddress(address);
    }
}
