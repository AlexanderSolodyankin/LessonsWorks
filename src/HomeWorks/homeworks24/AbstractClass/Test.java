package HomeWorks.homeworks24.AbstractClass;


import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Village village1 = new Village(); // создано первое село
        Village village2 = new Village(); // Создано второе село
        System.out.println(village1); // вывод информации села на консоль
        System.out.println(village2);// вывод информации села на консоль
        City[] citys = new City[4]; // создано 4 города
        for (int i = 0; i < citys.length; i++) {
            citys[i] = new City(); // Задаю значение каждому городу
        }
        for (int i = 0; i < citys.length;i++ ){ // Вывод информации городов для проверки поиска по упровляющему района
            for(int j = 0; j< citys[i].getUrbanAreas().length; j++){
                System.out.println(citys[i].getUrbanAreas()[j].getLider()); // чтобы было легче искать
            }
        }
            System.out.print("Введите имя упровляющего районом для поиска: ");
        String name = sc.nextLine();
        System.out.print("Введите фамилию упровляющего районом для поиска: ");
        String serName = sc.nextLine();
        for (int i = 0; i < citys.length; i++) { // цикл для сравнения значения и вывода информации по поиску
            for (int j = 0; j < citys[i].getUrbanAreas().length; j++) {
                if (citys[i].getUrbanAreas()[j].getLider().getName().equals(name) &&
                        citys[i].getUrbanAreas()[j].getLider().getSerName().equals(serName)) {
                    System.out.println("Вывод района под упровлением: " + name + " " + serName);
                    System.out.println("Район: " + citys[i].getUrbanAreas()[j].getNameLocality());
                    System.out.println("количество улиц в районе: " + citys[i].getUrbanAreas()[j].getStreets().length);
                }
            }
        }


    }


}
