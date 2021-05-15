package Lessons.lessons23;

import java.util.Arrays;

public class lessons23 {
    public static void main(String[] args) {
        final int[] arraFinal = new int[10];
        for ( int i =0 ; i< arraFinal.length; i++){
            arraFinal[i] = i;
            System.out.printf(i+ "=" + arraFinal[i] + "  ");
        }
//        arraFinal = Arrays.copyOf(arraFinal,arraFinal.length + 1);// выводит ошибку потому что финал





    }
}
