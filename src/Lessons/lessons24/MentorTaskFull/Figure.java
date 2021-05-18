//package Lessons.lessons24.MentorTaskFull;
//
//import java.awt.*;
//
//public class Figure {
//    private Lessons.lessons24.MentorTaskFull.LocationOfFigure location;
//    private Color color;
//    private boolean isVisible;
//
//
//    public Figure() {}
//
//    public Figure(Lessons.lessons24.MentorTaskFull.LocationOfFigure location, Color color) {
//        this.location = location;
//        this.color = color;
//        if (color != null) {
//            this.isVisible = true;
//        } else {
//            this.isVisible = false;
//        }
//    }
//
//    public Lessons.lessons24.MentorTaskFull.LocationOfFigure getLocation() {
//        return location;
//    }
//
//    public void setLocation(Lessons.lessons24.MentorTaskFull.LocationOfFigure location) {
//        this.location = location;
//    }
//
//    public Color getColor() {
//        return color;
//    }
//
//    public void setColor(Color color) {
//        this.color = color;
//    }
//
//    public boolean isVisible() {
//        return isVisible;
//    }
//
//    public void setVisible(boolean visible) {
//        isVisible = visible;
//    }
//
//    public String speak() {
//        return String.format(" Фигура(цвет: %s, видим: %s, %s)", color, isVisible ? "Да" : "Нет", location);
//    }
//}
