import java.sql.Date;

public class SimpsonPerson extends Human implements Interactable {

    // constructor
    SimpsonPerson(String name, Date birthday, Gender gender) {
        super(name, birthday, gender);
        getName();
    }

    // attributes
    private SimpsonPerson mother;
    private SimpsonPerson father;
    private AliveStatus status;

    // setter methods
    public void setFather(SimpsonPerson f) {
        this.father = f;
    }

    public void setMother(SimpsonPerson m) {
        this.mother = m;
    }

    public void setStatuss(AliveStatus s) {
        this.status = s;
    }

    // getter methods
    public SimpsonPerson getFather() {
        return father;
    }

    public SimpsonPerson getMother() {
        return mother;
    }

    public AliveStatus getStatus() {
        return status;
    }

    // methods
    public void interact() {
        System.out.println("I am interacting with the world");
    }

}
