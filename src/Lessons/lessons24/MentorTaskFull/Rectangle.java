//package Lessons.lessons24.MentorTaskFull;
//
//import java.awt.*;
//
//public class Rectangle extends Figure{
//    private static int countOfRectangles;
//    private static int countOfSquares;
//
//
//    public static int getCountOfRectangles() {
//        return countOfRectangles;
//    }
//
//    public static int getCountOfSquares() {
//        return countOfSquares;
//    }
//
//    private int width;
//    private int height;
//
//    public Rectangle(int width, int height, kg.itacademy.practice.LocationOfFigure location, Color color) {
//        super(location, color);
//        this.width = width;
//        this.height = height;
//        countOfRectangles++;
//    }
//
//    public Rectangle(int sideOfSquare, kg.itacademy.practice.LocationOfFigure location, Color color) {
//        super(location, color);
//        this.width = sideOfSquare;
//        this.height = sideOfSquare;
//        countOfSquares++;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }
//
//    @Override
//    public String speak() {
//        if (this.width == this.height) {
//            return String.format(" Квадрат(цвет: %s, видим: %s, %s, длина стороны: %s)",
//                    super.getColor(),
//                    super.isVisible() ? "Да" : "Нет",
//                    super.getLocation(),
//                    this.height);
//        } else  {
//            return String.format(" Прямоугольник(цвет: %s, видим: %s, %s, высота: %s, ширина: %s)",
//                    super.getColor(),
//                    super.isVisible() ? "Да" : "Нет",
//                    super.getLocation(),
//                    this.height,
//                    this.width);
//        }
//    }
//}
