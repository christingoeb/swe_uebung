// Abstrakte Klasse für Prüfungen mit zwei Professoren
abstract public class ExamTwoProfessor implements ExamExaminerKind {
    @Override
    public int getNumberOfProfessors() {
        return 2;
    }
}
