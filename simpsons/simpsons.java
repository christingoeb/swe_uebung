// Ziel: Computerspiel objektorientiert modellieren
//      soll über viele Jahre weiterentwickelt werden
//      

import java.sql.Date;

public class simpsons {
    public static void main(String[] args) {
        System.out.println("This is the Simpson World");
        Date date = new Date(System.currentTimeMillis());

        // create a new instance of SimpsonPerson
        SimpsonPerson homer = new SimpsonPerson("Homer", date, Gender.MALE);
        SimpsonPerson marge = new SimpsonPerson("Marge", date, Gender.FEMALE);
        Date birthday = homer.getBirthday();
        System.out.println(birthday);
    }
}