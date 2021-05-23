package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskA;

public class Main {

    public static void main(String[] args) {
        Circle[] circles = new Circle[10];
        for (int i = 0; i < circles.length; i++)
            circles[i] = new Circle(i + 1);

        System.out.println("Количество кругов площадь которых равна 3: " + Circle.getCountMultiples());
    }
}
