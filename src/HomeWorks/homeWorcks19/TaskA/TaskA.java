package HomeWorks.homeWorcks19.TaskA;

import java.util.Random;

public class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        DateFound datCours = new DateFound(16,02,2006);
        Courses cours = new Courses("It Academy", 56448, "Самат", "Касымбеков",
                                        "Викторовичь", datCours);

        Students[] oboltus = new Students[ran.nextInt(30 - 5 + 1) + 5];
        for(int i = 0; i < oboltus.length; i++){

            DateFound datBerthStudent = new DateFound((ran.nextInt(31 - 1 + 1) + 1),
                    (ran.nextInt(12 - 1 + 1) + 1), (ran.nextInt(2021 - 1900 + 1) + 1900));
            NSPRandom nameStudent = new NSPRandom();

            oboltus[i] = new Students((nameStudent.getName()), (nameStudent.getSerName()),
                                        (nameStudent.getGender()),datBerthStudent);
        }

        DateFound dateGroup = new DateFound(26, 03, 2020);
        Groups group = new Groups(oboltus,cours,dateGroup, 5);

        System.out.println(group);
    }

}
