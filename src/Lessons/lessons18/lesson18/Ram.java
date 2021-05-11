package Lessons.lessons18.lesson18;

public class Ram {
    int size;
    String model;

    public Ram(int size, String model) {
        this.size = size;
        this.model = model;
    }

    @Override
    public String toString() {
        return "\nRam{" +
                "size=" + size +
                ", model='" + model + '\'' +
                '}';
    }
}
