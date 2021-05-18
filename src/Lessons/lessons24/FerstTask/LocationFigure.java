package Lessons.lessons24.FerstTask;

 public class LocationFigure {
     private int x;
     private int y;

     public LocationFigure(int x, int y){
         this.x = x;
         this.y = y;

     }

     public int getX() {
         return x;
     }

     public void setX(int x) {
         this.x = x;
     }

     public int getY() {
         return y;
     }

     public void setY(int y) {
         this.y = y;
     }

     @Override
     public String toString() {
         return String.format(" Координаты(%s, %s) ", x, y);
     }
 }
