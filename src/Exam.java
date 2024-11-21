import java.util.Date;

public interface Exam {
    Date getDate();

    void setDate(Date date);

    String getType(); // Gibt die Art der Prüfung zurück (z. B. "WrittenExam", "OralExam")

    boolean isScheduled(); // Gibt zurück, ob die Prüfung geplant ist
}
