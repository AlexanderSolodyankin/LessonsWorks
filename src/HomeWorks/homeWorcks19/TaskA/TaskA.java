package HomeWorks.homeWorcks19.TaskA;

import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DateFound date = new DateFound( sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(date);
    }
}
