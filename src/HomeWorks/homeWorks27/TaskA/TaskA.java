package HomeWorks.homeWorks27.TaskA;

import java.util.Arrays;
import java.util.Random;

class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        int num;
        AbstractObjects[] arrayObjekts = new AbstractObjects[8];

        arrayObjekts[0] = new Cats("Кошка");
        arrayObjekts[1] = new Ducks("Утка");
        arrayObjekts[2] = new Human("Человек");
        arrayObjekts[3] = new Parrots("Попугай");
        arrayObjekts[4] = new Plane("Самолет");
        arrayObjekts[5] = new Sharks("Акула");
        arrayObjekts[6] = new Ships("Карабль");
        arrayObjekts[7] = new Whales("Кит");

        Flyinable[] flyinables = new Flyinable[0];
        Runable[] runables = new Runable[0];
        Swimanble[] swimanbles = new Swimanble[0];

        for(int i = 0; i < arrayObjekts.length;i++){
            if(arrayObjekts[i] instanceof Flyinable){
                flyinables = Arrays.copyOf(flyinables,flyinables.length + 1);
                flyinables[flyinables.length - 1] = (Flyinable) arrayObjekts[i];
            }
            if(arrayObjekts[i] instanceof Runable){
                runables = Arrays.copyOf(runables,runables.length + 1);
                runables[runables.length - 1] = (Runable) arrayObjekts[i];
            }
            if(arrayObjekts[i] instanceof Swimanble){
                swimanbles = Arrays.copyOf(swimanbles,swimanbles.length + 1);
                swimanbles[swimanbles.length - 1] = (Swimanble) arrayObjekts[i];
            }
        }
        System.out.println("Летающие: " + flyinables.length);
        outFlynable(flyinables);
        System.out.println();
        System.out.println("Бегающие: " + runables.length);
        outRunable(runables);
        System.out.println();
        System.out.println("Плавающие: " + swimanbles.length);
        outSwimanbale(swimanbles);
    }
    static void outFlynable(Flyinable[] array){
        for(Flyinable getArrays: array){
            getArrays.fly();
        }
    }
    static void outRunable(Runable[] array){
        for(Runable getArrays: array){
            getArrays.run();
        }
    }
    static void outSwimanbale(Swimanble[] array){
        for(Swimanble getArrays: array){
            getArrays.swims();
        }
    }
}
