import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private String phone;
    private String address;
    
    //private ArrayList<Cart> cart = new ArrayList<Cart>();

    public User(String username,String password,String phone,String address) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
