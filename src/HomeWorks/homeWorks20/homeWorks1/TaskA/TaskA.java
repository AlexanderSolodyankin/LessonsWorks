package HomeWorks.homeWorks20.homeWorks1.TaskA;

import HomeWorks.homeWorks20.homeWorks1.TaskA.faculty.*;
import HomeWorks.homeWorks20.homeWorks1.TaskA.helpers.DateFound;
import HomeWorks.homeWorks20.homeWorks1.TaskA.helpers.NSPRandom;
import HomeWorks.homeWorks20.homeWorks1.TaskA.objcte.Students;

import java.util.Random;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();

        // создан класс для вычесление правельной даты ( Клас не продуман на месяц февраль и так же на вычесления высокосного года)
        DateFound datCours = new DateFound(16,02,2006);

        // Вызов класса "курс" и выдача ему значении
        Courses cours = new Courses("It Academy", 56448, "Самат", "Касымбеков",
                                        "Викторовичь", datCours);

        // Вызов класса "Студент" как массива ( масив создается случайным размером!!!)
        Students[] oboltus = new Students[ran.nextInt(30 - 5 + 1) + 5];

        // Цикл для того чтобы задать значения  в массив класса "СТУДЕНТ"
        for(int i = 0; i < oboltus.length; i++){

            // Вызов класса для определения даты рождения
            DateFound datBerthStudent = new DateFound((ran.nextInt(31 - 1 + 1) + 1),
                    (ran.nextInt(12 - 1 + 1) + 1), (ran.nextInt(2021 - 1900 + 1) + 1900));

            // Вызов класса создающего случайные имена и фамилии
            NSPRandom nameStudent = new NSPRandom();

            // Вносим данный в студента
            oboltus[i] = new Students((nameStudent.getName()), (nameStudent.getSerName()),
                                        (nameStudent.getGender()),datBerthStudent);
        }

        // Вызов класса для  того чтобы задать дату начала обучения
        DateFound dateGroup = new DateFound(26, 03, 2020);

        // Передаю параметры в класс "ГРУППА" все его пораметры
        Groups group = new Groups(oboltus,cours,dateGroup, 5);

        // Вызов класса для проверки даты чтобы задать время обучения
        DateFound dateSpand = new DateFound(30, 03,2020);

        // Вызов класса "уроки" и задаем ему значение
        Lessons less = new Lessons(oboltus,cours, dateGroup,group.getDuration(), dateSpand);

        // Выводим класс "Группа" для того чтобы видить его порпметры а так же для проверки работы программы
        System.out.println(group);

        // Вывод класса "Уроки" для получения конечного результата
        System.out.println(less);
    }


}
