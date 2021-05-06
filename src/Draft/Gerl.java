package Draft;

public class Gerl {
    private String name;

    public Gerl(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return String.format(" Девушка %s \n", name);

    }
}
