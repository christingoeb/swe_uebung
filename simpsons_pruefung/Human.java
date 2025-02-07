import java.time.LocalDate;

public interface Human {
    // setter methods
    public void setGender(Gender gender);

    public void setBirthday(LocalDate birthday);

    // getter methods
    public Gender getGender();

    public LocalDate getBirthday();

}