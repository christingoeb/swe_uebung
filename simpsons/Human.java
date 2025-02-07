import java.sql.Date;

public class Human {
    // attributes
    private final String name;
    private final Date birthday;
    private Gender gender;

    // constructor
    Human(String name, Date birthday, Gender gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public Gender getGender() {
        return gender;
    }
}
