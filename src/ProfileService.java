public class ProfileService {

    public String getProfileSummary(StudentRecord student) {
        return "Student: " + student.getName()
                + ", Course: " + student.getCourse();
    }
public void updateCourse(StudentRecord student, String newCourse) {
    student.setCourse(newCourse);
}
public void displayProfile(StudentRecord student) {
    System.out.println("----- Student Profile -----");
    System.out.println("Name: " + student.getName());
    System.out.println("Course: " + student.getCourse());
}
}
