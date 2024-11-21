import java.util.Date;
import java.util.List;

public class WrittenExamTwoProf implements Exam {
    private Date date;
    private boolean scheduled;

    public WrittenExamTwoProf(Date date) {
        this.date = date;
        this.scheduled = false;
    }

    @Override
    public Date getDate() {
        return this.date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getType() {
        return "WrittenExamTwoProf";
    }

    @Override
    public boolean isScheduled() {
        return scheduled;
    }

    public boolean schedule(List<Professor> professors) {
        if (professors.size() != 2) {
            throw new IllegalArgumentException("Es werden genau zwei Professoren benötigt.");
        }

        for (Professor prof : professors) {
            if (!prof.isAvailable()) {
                return false;
            }
        }
        this.scheduled = true;
        return true;
    }
}
