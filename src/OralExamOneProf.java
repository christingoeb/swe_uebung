import java.util.Date;
import java.util.List;

public class OralExamOneProf implements Exam {
    private Date date;
    private boolean scheduled;

    public OralExamOneProf(Date date) {
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
        return "OralExamOneProf";
    }

    @Override
    public boolean isScheduled() {
        return scheduled;
    }

    public boolean schedule(List<Professor> professors) {
        if (professors.size() != 1) {
            throw new IllegalArgumentException("Es wird genau ein Professor benötigt.");
        }

        this.scheduled = professors.get(0).isAvailable();
        return scheduled;
    }
}
