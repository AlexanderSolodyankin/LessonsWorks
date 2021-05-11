package Lessons.lessons18.lesson18;

public class Os {
    String name;
    String version;


    public Os(String name, String version) {
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "\nOs{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
