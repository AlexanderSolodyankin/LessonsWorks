package Lessons.lessons31;

import java.util.ArrayList;
import java.util.Arrays;

public class lessons31 {
    public static void main(String[] args) {
        ArrayList<Integer> asd = new ArrayList<Integer>();
        int num = 1000;
        for (int i = 0; i <= 1000; i++) {
            if (i * i <= 1000) {
                asd.add(i);
            } else {
                break;
            }
        }
        System.out.println(asd.size());
        for (int i = 0; i < asd.size(); i++) {
//            System.out.println(asd.get(i));
//        }
//        int cout = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                asd.add(cout, i);
//                cout++;
//            } else {
//                asd.add(i);
//            }
//        }
////        for (int i = 0; i < asd.size(); i++) {
////            System.out.println(asd.get(i));
////        }
//        System.out.println(asd);
//        int[] a = new int[3];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        System.out.println(Arrays.toString(a));
        }
        ArrayList<Integer> numIndex = new ArrayList<>();
        for (int i = 0; i < asd.size(); i++) {
            if (asd.indexOf(i) % 2 == 0 || asd.indexOf(i) % 3 == 0) {
                numIndex.add(asd.indexOf(i));
            }
        }
//        System.out.println(numIndex.toString());
//        System.out.println(numIndex.size());

        System.out.println(Arrays.asList(numIndex));

    }
}
