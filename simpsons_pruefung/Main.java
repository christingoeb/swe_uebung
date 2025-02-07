import java.time.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SimpsonPNotBornImpl BartsSon = new SimpsonPNotBornImpl();
        BartsSon.setName("Bart Simpsons son");
        BartsSon.setGender(Gender.MALE);

        // List
        List<SimpsonPAlive> local_interactionlist = new ArrayList<>();

        // Create Simpsons
        SimpsonPAliveImpl Bart = new SimpsonPAliveImpl("Bart", Gender.MALE, LocalDate.of(1980, 5, 12));
        SimpsonPAliveImpl Lisa = new SimpsonPAliveImpl("Lisa", Gender.FEMALE, LocalDate.of(1982, 5, 12));

        // methods
        System.out.println(Bart.getBirthday());
        local_interactionlist.add(Lisa);
        Bart.interact(local_interactionlist);

    }
}