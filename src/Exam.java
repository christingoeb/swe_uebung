import java.util.Date;

abstract public class Exam {
    private Date date;

    public Exam(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public abstract String getExamType(); // Muss von Unterklassen implementiert werden

    public abstract int getNumberOfProfessors(); // Muss von Unterklassen implementiert werden
}
