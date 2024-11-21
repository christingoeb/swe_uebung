import java.util.Date;
import java.util.List;

public class WrittenExamTwoProf extends WrittenExam implements ExamExaminerKind {
    private boolean scheduled;

    public WrittenExamTwoProf(Date date) {
        super(date);
        this.scheduled = false;
    }

    public boolean schedule(List<Professor> professors) {
        if (professors.size() != getNumberOfProfessors()) {
            throw new IllegalArgumentException("Es werden genau " + getNumberOfProfessors() + " Professoren benötigt.");
        }

        for (Professor prof : professors) {
            if (!prof.isAvailable()) {
                return false;
            }
        }
        this.scheduled = true;
        return true;
    }

    @Override
    public int getNumberOfProfessors() {
        return 2; // Festgelegt für Prüfungen mit zwei Professoren
    }
}
