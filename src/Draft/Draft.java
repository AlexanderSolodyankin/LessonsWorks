package Draft;

import java.util.Random;

public class Draft {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] numArrey = new int[ran.nextInt(10 - 2 + 1) + 2];
        for (int i =0;i < numArrey.length;i++){
            numArrey[i] = ran.nextInt(100 - (-100) + 1) + (-100);
        }


    }
    void setSumm(int[] num){

    }
}
