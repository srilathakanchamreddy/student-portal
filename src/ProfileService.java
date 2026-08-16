public class ProfileService {

    public String getProfileSummary(StudentRecord student) {
        return "Student: " + student.getName()
                + ", Course: " + student.getCourse();
    }
public void updateCourse(StudentRecord student, String newCourse) {
    student.setCourse(newCourse);
}
}
