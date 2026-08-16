public class LoginService {

    public boolean authenticate(String username, String password) {
        if (username == null || password == null) {
            return false;
        }

        return username.equals("student") && password.equals("portal123");
    }
}