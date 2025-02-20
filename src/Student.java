import java.util.Date;

public class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void enrollInCourse(Course course) {
        course.addStudent(this);
    }

    public void registerForExam(Exam exam) {
        if (exam.getDate().before(new Date())) {
            throw new IllegalStateException("Anmeldung nach dem Prüfungstermin ist nicht erlaubt!");
        }
        System.out
                .println("Student " + name + " hat sich erfolgreich für die Prüfung angemeldet: " + exam.getExamType());
    }
}
