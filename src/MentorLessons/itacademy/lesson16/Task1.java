package MentorLessons.itacademy.lesson16;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Circle black = new Circle(100);
        Circle yellow = new Circle(100, "Yellow");
        Circle hamleon = new Circle(100, "Green", true);

        System.out.println(black);
        System.out.println(yellow);
        System.out.println(hamleon);

        int n = 5;
        hamleon.setRadius(hamleon.getRadius() * n);
        System.out.println(hamleon);
        System.out.println(hamleon.getLength());
        System.out.println(hamleon.getSquare());

        Random random = new Random(100);
        Circle[] arrCricle = new Circle[100];
        int count = 0;
        int radius = 0;
        for (int i = 0; i < 100; i++) {
            radius = random.nextInt();
            if (radius % 3 == 0) {
                arrCricle[count++] = new Circle(radius);
            }
        }

        for (int i = 0; i <= count; i++) {
            if (i % 3 == 0) {
                System.out.println(arrCricle[i]);
            }
        }

    }
}
