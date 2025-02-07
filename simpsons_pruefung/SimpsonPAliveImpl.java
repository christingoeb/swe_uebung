import java.time.LocalDate;
import java.util.*;

public class SimpsonPAliveImpl implements SimpsonPAlive {
    public String name;
    public Gender gender;
    public LocalDate birthday;

    SimpsonPAliveImpl(String name, Gender gender, LocalDate birthday) {
        setName(name);
        setGender(gender);
        setBirthday(birthday);
    }

    @Override
    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthday;
    }

    @Override
    public void interact(List<SimpsonPAlive> people) {
        System.out.println("interaction with other simpsons ");
    }

}