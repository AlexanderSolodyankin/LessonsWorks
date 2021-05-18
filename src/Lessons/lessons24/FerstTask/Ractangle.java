package Lessons.lessons24.FerstTask;

import java.awt.*;

public final class Ractangle extends Figure {
    private static int coutOfRectangle;
    private static int countOfSquares;

    public static int getCoutOfRectangle() {
        return coutOfRectangle;
    }

    public static int getCountOfSquares() {
        return countOfSquares;
    }

    private int width;
    private int height;


    public Ractangle(int width, int height, LocationFigure location, Color color) {
        super(location, color);
        this.width = width;
        this.height = height;
        coutOfRectangle++;
    }

    public Ractangle(int sideOfSquare, LocationFigure location, Color color) {
        super(location, color);
        this.width = sideOfSquare;
        this.height = sideOfSquare;
        countOfSquares++;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String speak() {
        if (this.width == this.height) {
            return String.format(" Квадрат(цвет: %s, видим: %s, %s, длина стороны: %s)",
                    super.getColore(),
                    super.isVisible() ? "Да" : "Нет",
                    super.getLocation(),
                    this.height);
        } else {
            return String.format(" Прямоугольник(цвет: %s, видим: %s, %s, высота: %s, ширина: %s)",
                    super.getColore(),
                    super.isVisible() ? "Да" : "Нет",
                    super.getLocation(),
                    this.height,
                    this.width);
        }
    }
}
