package Lessons.lessons22.SecondLessons22.TaskA;

public class Rectangl extends Figure{
    private int up;
    private int down;

    public Rectangl(LocationOfFigure location, String color, boolean isVisible, int up, int down) {
        super(location, color, isVisible);
        this.up = up;
        this.down = down;
    }

    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public String toString(){
        return String.format("My location x: %s, y: %s, color: %s, i an %s visible",
                this.getLocation().getX(), this.getLocation().getY(), getColor(), isVisible() ? "" : "not" );
    }
}
