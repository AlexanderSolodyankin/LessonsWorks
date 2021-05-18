package Lessons.lessons24.FerstTask;

import java.awt.*;

public class Figure {
    private LocationFigure location;
    private Color colore;
    private boolean isVisible;

    public Figure() {
    }

    public Figure(LocationFigure location, Color color) {
        this.location = location;
        this.colore = color;
        if (color != null) {
            this.isVisible = true;
        } else {
            this.isVisible = false;
        }
    }

    public LocationFigure getLocation() {
        return location;
    }

    public void setLocation(LocationFigure location) {
        this.location = location;
    }

    public Color getColore() {
        return colore;
    }

    public void setColore(Color colore) {
        this.colore = colore;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public String speak() {
        return String.format(" Фигура(цвет: %s, видим: %s, %s)", colore, isVisible ? "Да" : "Нет", location);
    }
}
