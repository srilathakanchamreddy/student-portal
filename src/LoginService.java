public class LoginService {

    public boolean authenticate(String username, String password) {
        return username.equals("student") && password.equals("portal123");
    }
}