package HomeWorks.homeWorcks19.TaskA;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        DateFound date = new DateFound(13, 11, 1950);
        Students testStudents = new Students("Alex", "Solo", "Неизвестный", date);

        System.out.println(testStudents);
    }
}
