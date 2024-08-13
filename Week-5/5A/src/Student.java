import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<Course> courses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    public void dropCourse(Course course) {
        courses.remove(course);
    }
}
