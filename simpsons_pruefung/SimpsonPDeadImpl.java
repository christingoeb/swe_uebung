import java.time.LocalDate;

public class SimpsonPDeadImpl implements SimpsonPDead {
    public String name;
    public Gender gender;
    public LocalDate birthday;

    SimpsonPDeadImpl(SimpsonPAliveImpl simpson) {
        setName(simpson.name);
        setGender(simpson.gender);
        setBirthday(simpson.birthday);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

}
