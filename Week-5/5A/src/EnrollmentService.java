public class EnrollmentService {
    public void enroll(Student student, Course course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }

    public void drop(Student student, Course course) {
        student.dropCourse(course);
        course.removeStudent(student);
    }
}
