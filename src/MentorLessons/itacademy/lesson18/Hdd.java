package MentorLessons.itacademy.lesson18;

public class Hdd {
    int size;
    int speed;

    public Hdd(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "\nHdd{" +
                "size=" + size +
                ", speed=" + speed +
                '}';
    }
}
