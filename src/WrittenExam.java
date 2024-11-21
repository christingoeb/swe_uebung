import java.util.Date;

public class WrittenExam implements ExamExecutionKind {
    private Date date;

    public WrittenExam(Date date) {
        this.date = date;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getExamType() {
        return "Written";
    }
}
