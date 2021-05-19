package HomeWorks.homeworks24.Chess;

import java.awt.*;
import java.util.Random;

public class TestBoard {
    public static void main(String[] args) {
        GameBoard board = new GameBoard();
        for(int i = 0; i < 8; i++){

            for (int j = 0; j < 8;j++){
                LocationFigureDraft local = new LocationFigureDraft(i,j);
                RectengleDraft rectengleDraft = new RectengleDraft(10,local, Color.black);

                System.out.print(RectengleDraft.getCountSquar() + " ");
                System.out.println(rectengleDraft.speak());

            }
        }
    }
}
