package violations;

import java.util.regex.Pattern;

public class User {

    private String name;
    private String email;
    private String userType; // "PREMIUM", "REGULAR", "VIP"
    private double totalPurchases;

    public User(String name, String email, String userType, double totalPurchases) {
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.totalPurchases = totalPurchases;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public double getTotalPurchases() {
        return totalPurchases;
    }

    public void setTotalPurchases(double totalPurchases) {
        this.totalPurchases = totalPurchases;
    } 
}
