package HomeWorks.homeWorks26.TaskB;

import Draft.NPSNameOreAge.NPSHuman;

import java.util.Arrays;
import java.util.Random;

public class TaskB {
    public static void main(String[] args) {
        Random ran = new Random();
        Actionable[] mans = new AbstractEmployee[20]; // масив из сотрудников вызванный через ссылку
        int num; // переменная для упрощения случайного распределения
        for (int i = 0; i < mans.length; i++) { // цикл который случайным образом создает обьекты в массиве
            // для дальнейшей его рассортировки
            NPSHuman human = new NPSHuman(); // вызван класс случайный человек для переноса его зночений в класс Сотрудник
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
            // пустые массивы дял переносса ссылки из основного массива для распределения и дальнейшей их сартировки
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
        // тестовый вывод для проверки коректности работы
        System.out.println("Длина Масива Пажарников: " + arrayFire.length);
        outArray(arrayFire);
        System.out.println();
        System.out.println("Длина Массива Комерсант: " + arrayMerch.length);
        outArray(arrayMerch);
        System.out.println();
        System.out.println("Длина Массива пенсионер: " + arrayPens.length);
            // тестовый вывод для проверки коректности сортировки
        System.out.println("---------------------------------------------------------------------------------------");
        interOverArray((AbstractEmployee[]) arrayFire);
        interOverArray((AbstractEmployee[]) arrayMerch);
        interOverArray((AbstractEmployee[]) arrayPens);
        outArray(arrayFire);
        System.out.println("---------------------------------------------------------------------------------------");
        outArray(arrayMerch);
        System.out.println("---------------------------------------------------------------------------------------");
        outArray(arrayPens);


    }
     static void outArray(Actionable[] actionables){// метод цикл чтобы тупо его не повторять
        for(int i = 0; i < actionables.length; i++){
            System.out.println(actionables[i]);
            actionables[i].actions();
            System.out.println();
        }
    }
    static void interOverArray(AbstractEmployee[] array){// метод сортировки массива
        /*Я не смог разобратся в методе ( если честно времени не хвотило чтобы почитать)
        * Написал свой метод перебора и сортировки массива*/
        Actionable arrayItem1;
        for (int i = 0; i < array.length;i ++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i].getExperience() > array[j].getExperience() && array[i] instanceof Firefighter){
                    arrayItem1 = array[i];
                    array[i] = array[j];
                    array[j] = (AbstractEmployee) arrayItem1;
                }
                if(array[i].getAge() > array[j].getAge() && array[i] instanceof Pensioner){
                    arrayItem1 = array[i];
                    array[i] = array[j];
                    array[j] = (AbstractEmployee) arrayItem1;
                }
                if(array[i].getWage() > array[j].getWage() && array[i] instanceof Merchant){
                    arrayItem1 = array[i];
                    array[i] = array[j];
                    array[j] = (AbstractEmployee) arrayItem1;
                }
            }
        }
    }


}
