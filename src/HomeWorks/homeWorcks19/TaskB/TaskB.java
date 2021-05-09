package HomeWorks.homeWorcks19.TaskB;

import Lessons.lessons19.Student;

public class TaskB {



    public static void main(String[] args) {
        Bread bread = new Bread(150, 16, "Россия");
        System.out.println(bread);
        System.out.println();

        Cake lepeshka = new Cake(13,28,"Киргизия",800);
//        System.out.println(lepeshka);
        lepeshka.sout();
        if(lepeshka.weight < 300){
            lepeshka.counterfeit();
        }
        Student sg = new Student();






    }


}
