import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private List<Student> students;
    private List<Exam> exams; // Liste von Prüfungen aller Arten

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
        this.exams = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out
                    .println("Student " + student.getName() + " wurde in den Kurs " + courseName + " eingeschrieben.");
        }
    }

    public void addExam(Exam exam) {
        exams.add(exam);
        System.out.println("Prüfung wurde dem Kurs " + courseName + " hinzugefügt: " + exam.getExamType());
    }

    public List<Exam> getExams() {
        return exams;
    }

    public List<Student> getStudents() {
        return students;
    }
}
