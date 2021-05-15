package Lessons.lessons22.SecondLessons22.TaskA;

  class Figure{
    private LocationOfFigure location;
    private String color;
    private boolean isVisible;

    public Figure(){}

    public Figure(LocationOfFigure location, String color, boolean isVisible){
        this.location = location;
        this.color = color;
        this.isVisible = isVisible;
    }

    public String toString(){
        return String.format("My location x: %s, y: %s, color: %s, i an %s visible",
                location.getX(),location.getY(), color, isVisible ? "" : "not");
    }

     public LocationOfFigure getLocation() {
         return location;
     }

     public void setLocation(LocationOfFigure location) {
         this.location = location;
     }
     public void setColor(String color) {
         this.color = color;
     }

     public String getColor() {
         return color;
     }



     public boolean isVisible() {
         return isVisible;
     }

     public void setVisible(boolean visible) {
         isVisible = visible;
     }
 }

