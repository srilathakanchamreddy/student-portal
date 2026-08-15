public class StudentPortal {

    public static void main(String[] args) {
        StudentRecord student = new StudentRecord(101, "Vinay", "M.Tech CSE");

        System.out.println("Welcome to Student Portal");
        student.displayDetails();
	student.displayStatus();
    }
}