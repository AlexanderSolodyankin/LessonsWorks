package Lessons.lesson16.lesson16;

public class Circle {
    double radius;
    String color;
    boolean isTransparent;

    public Circle(double radius) {
        this.radius = radius;
        this.color = "BLack";
        this.isTransparent = false;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        isTransparent = false;
    }

    public Circle(double radius, String color, boolean isTransparent) {
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTransparent() {
        return isTransparent;
    }

    public void setTransparent(boolean transparent) {
        isTransparent = transparent;
    }

    public double getLength() {
        return 2 * 3.14 * this.radius;
    }

    public double getSquare() {
        return 3.14 * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return String.format("radius = %s\n" +
                "color = %s\n" +
                "isTransparent = %s", this.radius,
                this.color,
                this.isTransparent);
    }
}
