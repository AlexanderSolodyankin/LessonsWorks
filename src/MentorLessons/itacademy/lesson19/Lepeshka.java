package MentorLessons.itacademy.lesson19;

public class Lepeshka extends Bread {
    double radius;

    public Lepeshka(Double weight, double radius) {
        if (weight > 200)
            setWeight(weight);
        else {
            System.out.println("Lepeshka poddelka");
        }
        this.radius = radius;
    }


    @Override
    void bake() {
        System.out.println("Bake Lepeshka");
    }

    @Override
    void pack() {
        System.out.println("pack Lepeshka");
    }

    void wrawPrints() {
        System.out.println("Draw prints Lepeshka");
    }
    void varnish() {
        System.out.println("Varnish Lepeshka");
    }
}
