package Lessons.lessons23;

import java.awt.*;

 class Circle {
    private int x;
    private  int y;
    private int whith;
    private int height;
    private Color color;

    public Circle(int x, int y, int whith, int height, Color color){
        this.x = x;
        this.y = y;
        this.whith = whith;
        this.height = height;
        this.color = color;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

     public int getWhith() {
         return whith;
     }

     public void setWhith(int whith) {
         this.whith = whith;
     }

     public int getHeight() {
         return height;
     }

     public void setHeight(int height) {
         this.height = height;
     }
 }
