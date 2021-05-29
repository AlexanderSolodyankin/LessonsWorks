package HomeWorks.homeWorks25.TaskA;

class TaskA {
    public static void main(String[] args) {
        Bread bread = new Bread("Хлеб");
        Circle circle = new Circle(15);
        outActObject(bread);
        outActObject(circle);

    }
   static void outActObject(Actable act){

        act.act(); // абстрактный метод
    }
}
