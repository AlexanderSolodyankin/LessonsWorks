package Lessons.lissons34;


import java.util.ArrayList;
import java.util.HashSet;

public class Lissons34 {


    public static void main(String[] args) {
//        Cat cat1 = new Cat("Teams", 34);
//        Cat cat2 = new Cat("Alex", 25);
//
//        System.out.println(cat1.hashCode());
//        System.out.println(cat2.hashCode());
//        ArrayList<Cat> arrayCat = new ArrayList<>();
//        arrayCat.add(cat1);
//        arrayCat.add(cat2);
//        arrayCat.add(new Cat("Teams", 34));
//        System.out.println(arrayCat.get(0).hashCode());
//        System.out.println(arrayCat.get(1).hashCode());
//        System.out.println(arrayCat.get(2).hashCode());

        ArrayList<Integer> interNumbers = new ArrayList<>();
        int setNumbers = 0;
        int outSout = 0;
        for (int i = 0; i < 400; i++) {
            interNumbers.add(setNumbers);
            setNumbers++;
            if(setNumbers > 100){
                setNumbers = 0;
            }
            outSout = outSout + interNumbers.get(i);
        }
        System.out.println(outSout);

        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i = 0; i < interNumbers.size(); i++) {
            integerHashSet.add(interNumbers.get(i));
        }
        int hashOut = 0;
        int countSyze = 0;
        for(Integer outN:integerHashSet){
            hashOut = hashOut + outN;
            countSyze ++;
        }
        System.out.println(hashOut);
        System.out.println(countSyze);
        System.out.println(interNumbers);
        System.out.println("----------------------------------");
        System.out.println(integerHashSet.size());



    }
}
