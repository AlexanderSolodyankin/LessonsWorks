package Lessons.lessons24.FerstTask;

import Lessons.lessons24.FerstTask.Figure;
import Lessons.lessons24.FerstTask.LocationFigure;

import java.awt.*;

 class Circle extends Figure {
    private int radius;

    public Circle(int radius, LocationFigure location, Color color) {
        super(location, color);
        this.radius = radius;
    }

    @Override
    public String speak() {
        return String.format(" Круг(цвет: %s, видим: %s, %s, длина стороны: %s)",
                super.getColore(),
                super.isVisible() ? "Да" : "Нет",
                super.getLocation(),
                this.radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
