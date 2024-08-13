// UserAuth.java
public class UserAuth {
    private static UserAuth instance;
    private boolean isLoggedIn;
    private String userName;

    private UserAuth() {
        isLoggedIn = false;
        userName = "";
    }

    public static synchronized UserAuth getInstance() {
        if (instance == null) {
            instance = new UserAuth();
        }
        return instance;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public String getUserName() {
        return userName;
    }

    public void login(String userName) {
        this.userName = userName;
        this.isLoggedIn = true;
    }

    public void logout() {
        this.userName = "";
        this.isLoggedIn = false;
    }
}
