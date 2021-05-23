package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskA;

public class Circle {
    private static int countMultiples;

    private final double PI = 3.14;

    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        if ((this.PI * this.radius * 2) % 3 == 0)
            countMultiples++;
    }

    public static int getCountMultiples() {
        return countMultiples;
    }

    public static void setCountMultiples(int countMultiples) {
        Circle.countMultiples = countMultiples;
    }

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
