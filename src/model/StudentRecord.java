public class StudentRecord {
    private int id;
    private String name;
    private String course;

    public StudentRecord(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }

   public void displayStatus() {
    System.out.println("Status: Active");
    }
}