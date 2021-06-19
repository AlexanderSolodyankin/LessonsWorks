package Lessons.lessons33;

import java.util.Random;

public class Lessons33 {

    public static void main(String[] args) {
        Random ran = new Random();
        Computer[] comp = new Computer[50];
        NootBook[] noot = new NootBook[50];

        for(int i = 0 ; i < comp.length; i++){
            noot[i] = new NootBook(ran.nextBoolean()? " Asus" : " Dell" , ran.nextInt(10000 - 70000 - 1) + 10000, ran.nextBoolean());
        }
    }

}
