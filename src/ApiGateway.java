import java.util.*;

public class ApiGateway {
    private Map<Integer, Student> students = new HashMap<>();
    private Map<Integer, Course> courses = new HashMap<>();

    public Student createStudent(int id, String name) {
        Student student = new Student(name, id);
        students.put(id, student);
        return student;
    }

    public Course createCourse(int id, String name) {
        Course course = new Course(id, name);
        courses.put(id, course);
        return course;
    }

    public void enrollStudent(int studentId, int courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student == null || course == null) {
            throw new IllegalArgumentException("Student oder Kurs existiert nicht.");
        }
    }

    /*
     * public void changeEnrollmentBehavior(int courseId, EnrollmentBehavior
     * newBehavior, boolean keepEnrolled) {
     * Course course = courses.get(courseId);
     * 
     * if (course == null) {
     * throw new IllegalArgumentException("Kurs existiert nicht.");
     * }
     * 
     * course.changeEnrollmentBehavior(newBehavior, keepEnrolled);
     * }
     * 
     * public void deleteCourse(int courseId) {
     * Course course = courses.get(courseId);
     * 
     * if (course == null) {
     * throw new IllegalArgumentException("Kurs existiert nicht.");
     * }
     * 
     * // Entferne Kurs und prüfe Abhängigkeiten
     * courses.remove(courseId);
     * for (Course c : courses.values()) {
     * c.removeDependency(course);
     * }
     * }
     * 
     * public void addCourseDependency(int courseId, int dependencyCourseId) {
     * Course course = courses.get(courseId);
     * Course dependencyCourse = courses.get(dependencyCourseId);
     * 
     * if (course == null || dependencyCourse == null) {
     * throw new
     * IllegalArgumentException("Kurs oder Abhängigkeit existiert nicht.");
     * }
     * 
     * course.addDependency(dependencyCourse);
     * }
     */
}
