package HomeWorks.homeWorks26.TaskB;

import Draft.NPSNameOreAge.NPSHuman;

import java.util.Arrays;
import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        Random ran = new Random();
        Actionable[] mans = new AbstractEmployee[20];
        int num;
        for (int i = 0; i < mans.length; i++) {
            NPSHuman human = new NPSHuman();
            num = ran.nextInt(3);
            if (num == 0) {
                mans[i] = new Firefighter(human.getName(), human.getAge(),
                        ran.nextInt(50000), ran.nextInt(20));
            }
            if (num == 1) {
                mans[i] = new Merchant(human.getName(), human.getAge(),
                        ran.nextInt(50000), ran.nextInt(20));
            }
            if (num == 2) {
                mans[i] = new Pensioner(human.getName(), human.getAge(),
                        ran.nextInt(50000), ran.nextInt(20));
            }
        }

        Actionable[] arrayFire = new Firefighter[0];
        Actionable[] arrayMerch = new Merchant[0];
        Actionable[] arrayPens = new Pensioner[0];

        for (int i = 0; i < mans.length;i++){
            if(mans[i] instanceof Firefighter){
                arrayFire = Arrays.copyOf(arrayFire,arrayFire.length+1);
                arrayFire[arrayFire.length-1] = mans[i];
            }
            if(mans[i] instanceof Merchant){
                arrayMerch = Arrays.copyOf(arrayMerch,arrayMerch.length+1);
                arrayMerch[arrayMerch.length-1] = mans[i];
            }
            if(mans[i] instanceof Pensioner){
                arrayPens = Arrays.copyOf(arrayPens,arrayPens.length+1);
                arrayPens[arrayPens.length-1] = mans[i];
            }
        }
        System.out.println("Длина Масива Пажарников: " + arrayFire.length);
        outArray(arrayFire);
        System.out.println();
        System.out.println("Длина Массива Комерсант: " + arrayMerch.length);
        outArray(arrayMerch);
        System.out.println();
        System.out.println("Длина Массива пенсионер: " + arrayPens.length);


    }
     static void outArray(Actionable[] actionables){
        for(int i = 0; i < actionables.length; i++){
            System.out.println(actionables[i]);
            actionables[i].actions();
            System.out.println();
        }
    }


}
