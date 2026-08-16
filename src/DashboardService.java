public class DashboardService {

    public void displayDashboard(StudentRecord student) {
        System.out.println("===== Student Dashboard =====");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Course: " + student.getCourse());
    }
public void displayLoginStatus(boolean authenticated) {
    System.out.println("Login Status: "
            + (authenticated ? "Active" : "Inactive"));
}

public void displayEnrollmentSummary(StudentRecord student) {
    System.out.println("Enrollment Status: Active");
    System.out.println("Enrolled Course: " + student.getCourse());
}
}