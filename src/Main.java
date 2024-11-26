import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Professoren erstellen
        Professor mueller = new Professor("Dr. Müller", true);
        Professor schmidt = new Professor("Dr. Schmidt", true);

        // Studenten erstellen
        Student anna = new Student("Anna", 123);
        Student max = new Student("Max", 124);

        // Kurs erstellen
        Course swe = new Course(123, "Software Engineering");

        // Schritt 1: Studenten in den Kurs einschreiben
        System.out.println("== Einschreiben der Studenten in den Kurs ==");
        anna.enrollInCourse(swe);
        max.enrollInCourse(swe);

        // Schritt 2: Prüfungen erstellen und dem Kurs hinzufügen
        System.out.println("\n== Hinzufügen von Prüfungen ==");
        Exam SEExam = new WrittenExamTwoProf(new Date(System.currentTimeMillis() + 86400000)); // Morgen
        Exam SEPresentation = new OralExamOneProf(new Date(System.currentTimeMillis() + 172800000)); // Übermorgen
        swe.addExam(SEExam);
        swe.addExam(SEPresentation);

        // Schritt 3: Prüfungen planen
        System.out.println("\n== Planung der Prüfungen ==");
        try {
            ((WrittenExamTwoProf) SEExam).schedule(Arrays.asList(mueller, schmidt));
            System.out.println("Schriftliche Prüfung erfolgreich geplant.");
        } catch (Exception e) {
            System.err.println("Fehler beim Planen der schriftlichen Prüfung: " + e.getMessage());
        }

        try {
            ((OralExamOneProf) SEPresentation).schedule(Arrays.asList(mueller));
            System.out.println("Mündliche Prüfung erfolgreich geplant.");
        } catch (Exception e) {
            System.err.println("Fehler beim Planen der mündlichen Prüfung: " + e.getMessage());
        }

        // Schritt 4: Studenten melden sich für Prüfungen an
        System.out.println("\n== Anmeldung der Studis für Prüfungen ==");
        try {
            anna.registerForExam(SEExam);
            max.registerForExam(SEPresentation);
        } catch (Exception e) {
            System.err.println("Fehler bei der Prüfungsanmeldung: " + e.getMessage());
        }
        System.out.println("Examtyp: " + SEExam.getExamType() + "!!");
        System.out.println("How many profs are participating?: " + SEExam.getNumberOfProfessors());

        System.out.println("Examtyp: " + SEPresentation.getExamType() + "!!");
        System.out.println("How many profs are participating?: " + SEPresentation.getNumberOfProfessors());

    }
}
