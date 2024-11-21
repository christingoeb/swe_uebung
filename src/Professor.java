public class Professor {
    private String name;
    private boolean available;

    public Professor(String name, boolean available) {
        this.name = name;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    @Override
    public String toString() {
        return "Professor{name='" + name + "', available=" + available + "}";
    }
}
