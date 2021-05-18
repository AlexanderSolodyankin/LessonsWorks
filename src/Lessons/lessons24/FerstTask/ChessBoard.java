package Lessons.lessons24.FerstTask;

public class ChessBoard {
    private Ractangle[][] fields = new Ractangle[8][8];
    private Circle[] circles = new Circle[12];

    public final boolean fillField(Ractangle field) {
        if (field == null) {
            return false;
        }
        if (field.getLocation().getX() >= 8 || field.getLocation().getX() < 0) {
            return false;
        }
        if (field.getLocation().getY() >= 8 || field.getLocation().getY() < 0) {
            return false;
        }
        fields[field.getLocation().getX()][field.getLocation().getY()] = field;
        return true;
    }

    public Ractangle getField(int i, int j) {
        return fields[i][j];
    }

    public boolean addCircles(Circle circle) {
        if (circle == null) {
            return false;
        }
        for (int i = 0; i < circles.length; i++) {
            if (circles[i] == null) {
                circles[i] = circle;
                return true;
            }
        }
        return false;
    }

    public Circle getCircle(int i, int j) {
        for (Circle circle : circles) {
            if (circle == null) {
                continue;
            }
            if (circle.getLocation() == null) {
                continue;
            }
            if (circle.getLocation().getX() == i && circle.getLocation().getY() == j) {
                return circle;
            }
        }
        return null;
    }
}
