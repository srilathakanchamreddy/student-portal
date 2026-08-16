public class StudentPortal {

    public static void main(String[] args) {
        StudentRecord student =
                new StudentRecord(101, "Vinay", "M.Tech CSE");

        LoginService loginService = new LoginService();

        boolean authenticated =
                loginService.authenticate("student", "portal123");

        System.out.println("Welcome to Student Portal");

        System.out.println(
                loginService.getLoginMessage(authenticated)
        );

        student.displayDetails();
        student.displayStatus();
    }
}