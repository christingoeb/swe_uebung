import java.time.LocalDate;

public class SimpsonPNotBornImpl implements SimpsonPNotBorn {
    public String name;
    public Gender gender;
    public LocalDate birthday;

    SimpsonPNotBornImpl() {
        setName(null);
        setGender(null);
        setBirthday(null);
    }

    @Override
    public void setName(String name) {
        this.name = name;
        if (name != null && name.length() > 3) {
            this.name = name;
        } else if (name == null) {
            this.name = name;
        } else if (name.length() < 4) {
            System.out.println("name has to be at least 4 characters long");
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

}
