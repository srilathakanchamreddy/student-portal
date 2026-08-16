public class ProfileService {

    public String getProfileSummary(StudentRecord student) {
        return "Student: " + student.getName()
                + ", Course: " + student.getCourse();
    }
}
