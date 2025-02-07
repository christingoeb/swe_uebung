import java.time.LocalDate;
import java.util.*;

public interface SimpsonPAlive {
    public void setName(String name);

    public void setGender(Gender gender);

    public void setBirthday(LocalDate birthday);

    public String getName();

    public LocalDate getBirthday();

    public void interact(List<SimpsonPAlive> people);
}
