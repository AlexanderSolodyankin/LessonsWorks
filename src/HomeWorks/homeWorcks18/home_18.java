package HomeWorks.homeWorcks18;

import java.util.Scanner;

public class home_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Farm[] farms = new Farm[2];

        String bagSet; // Кастыль против бага на пропуск строки ввода
        // не могу понять почему происходит этот баг


        for(int i = 0; i < farms.length; i++){
//            System.out.println("Введите Страну в котором находится ферма.");
            String contry;// = sc.nextLine();
            contry = "Сотекн " + (i + 1);
//            System.out.println("Введите город в котором находится ферма.");
            String sity;// = sc.nextLine();
            sity = "Город " + (i + 1);
//            System.out.println("Назовите улицу на которой находится ферма.");
            String street;// = sc.nextLine();
            street = "Улица " + (i + 1);
//            System.out.println("Назовите номер фермы");
            String hous;// = sc.nextLine();
            hous = " дом " + (i + 1);
//            System.out.println("Введите количество коров находящиеся на ферме.");
            int num = sc.nextInt();
            Cows[] cow = new Cows[num];
            for(int j=0; j< cow.length; j++){
                System.out.println("Введите Имя коровы.");
                bagSet = sc.nextLine(); // кастыль
                String name = sc.nextLine();
                System.out.println("Пол коровы.");
                String gender = sc.nextLine();
                System.out.println("Введите возрост коровы.");
                int age = sc.nextInt();
                System.out.println("Введите вес коровы.");
                int weight = sc.nextInt();
                cow[j] = new Cows(weight, age, gender, name);
            }

            System.out.println("Введите количество овец находящиеся на ферме.");
             num = sc.nextInt();
            Sheep[] sheep = new Sheep[num];
            for(int j=0; j< sheep.length; j++){
                System.out.println("Введите Имя овцы.");
                bagSet = sc.nextLine(); // кастыль
                String name = sc.nextLine();
                System.out.println("Пол овцы.");
                String gender = sc.nextLine();
                System.out.println("Введите возрост овцы.");
                int age = sc.nextInt();
                System.out.println("Введите вес овцы.");
                int weight = sc.nextInt();
                sheep[j] = new Sheep(weight, age, gender, name);
            }

            System.out.println("Введите количество коней находящиеся на ферме.");
             num = sc.nextInt();
            Horse[] hors = new Horse[num];
            for(int j=0; j< hors.length; j++){
                System.out.println("Введите Имя коненя.");
                bagSet = sc.nextLine(); // кастыль
                String name = sc.nextLine();
                System.out.println("Пол коненя.");
                String gender = sc.nextLine();
                System.out.println("Введите возрост коненя.");
                int age = sc.nextInt();
                System.out.println("Введите вес коненя.");
                int weight = sc.nextInt();
                hors[j] = new Horse(weight, age, gender, name);
            }

            System.out.println("Введите имя владельца фермы.");
            bagSet = sc.nextLine(); // кастыль
            String nameMan = sc.nextLine();
            System.out.println("Введите фамилию владельца.");
            String serNameMan = sc.nextLine();
            System.out.println("Введите Отчество Владельца фермы.");
            String patronMan = sc.nextLine();
            farms[i] = new Farm(contry, sity, street, hous, cow, sheep, hors, nameMan, serNameMan, patronMan);
        }
        for (int i=0;i < farms.length; i++){
            System.out.println(farms[i]);
            System.out.println();
        }

    }
}
