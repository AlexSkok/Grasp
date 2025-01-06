package app;

public class User{

    public String getAddress(Address userAddress) {
        return userAddress.getAddress();
    }

    public void setAddress(Address userAddress, String address) {
        userAddress.setAddress(address);
    }
}
