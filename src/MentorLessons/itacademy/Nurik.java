package MentorLessons.itacademy;

import java.util.Scanner;

public class Nurik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Smartphone phone1 = new Smartphone();
        System.out.println("Enter brand");
        phone1.brand = sc.nextLine();
        System.out.println("Enter color");
        phone1.color = sc.nextLine();
        System.out.println("Enter country");
        phone1.country = sc.nextLine();
        System.out.println("Enter isCredit");
        phone1.isCredit = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Enter version");
        phone1.version = sc.nextLine();
        System.out.println("Enter price");
        phone1.price = sc.nextDouble();


        System.out.println( phone1.brand  + " " +phone1.color  + " " +phone1.country  + " " +phone1.isCredit  + " " +phone1.version  + " " +phone1.price);


    }
}

