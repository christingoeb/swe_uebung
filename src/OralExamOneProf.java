import java.util.Date;
import java.util.List;

public class OralExamOneProf extends Exam implements ExamExaminerKind {
    private boolean scheduled;

    public OralExamOneProf(Date date) {
        super(date); // Initialisiert das Datum in der Basisklasse Exam
        this.scheduled = false;
    }

    public boolean schedule(List<Professor> professors) {
        if (professors.size() != getNumberOfProfessors()) {
            throw new IllegalArgumentException("Es wird genau ein Professor benötigt.");
        }

        for (Professor prof : professors) {
            if (!prof.isAvailable()) {
                return false; // Prüfung kann nicht geplant werden
            }
        }
        this.scheduled = true;
        return true; // Prüfung erfolgreich geplant
    }

    @Override
    public int getNumberOfProfessors() {
        return 1; // Mündliche Prüfung benötigt nur einen Professor
    }

    @Override
    public String getExamType() {
        return "Oral Exam"; // Beschreibung des Typs
    }
}
