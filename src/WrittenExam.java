import java.util.Date;

abstract public class WrittenExam extends Exam {

    public WrittenExam(Date date) {
        super(date);
    }

    @Override
    public String getExamType() {
        return "Written Exam";
    }
}
