public class StudentPortal {

    public static void main(String[] args) {
        Student student = new Student(101, "Vinay", "M.Tech CSE");

        System.out.println("Welcome to Student Portal");
        student.displayDetails();
	student.displayStatus();
    }
}