public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", "S001");
        Student student2 = new Student("Bob", "S002");

        Course course1 = new Course("C101", "Mathematics");
        Course course2 = new Course("C102", "Physics");

        EnrollmentService enrollmentService = new EnrollmentService();

        enrollmentService.enroll(student1, course1);
        enrollmentService.enroll(student2, course1);
        enrollmentService.enroll(student2, course2);

        System.out.println("Students enrolled in " + course1.getCourseName() + ":");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }

        System.out.println("Courses Alice is enrolled in:");
        for (Course course : student1.getCourses()) {
            System.out.println(course.getCourseName());
        }

        enrollmentService.drop(student2, course1);

        System.out.println("Students enrolled in " + course1.getCourseName() + " after Bob dropped:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName());
        }
    }
}
