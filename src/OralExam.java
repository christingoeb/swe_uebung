
import java.util.Date;

public class OralExam implements ExamExecutionKind {
    private Date date;

    public OralExam(Date date) {
        this.date = date;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getExamType() {
        return "Oral";
    }
}
