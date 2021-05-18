package Lessons.lessons24.FerstTask;

import java.awt.*;

 class FTaskA {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                LocationFigure location1 = new LocationFigure(i, j);
                chessBoard.fillField(new Ractangle(10, location1, Color.BLACK));
            }
        }

        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                Ractangle field = chessBoard.getField(i, j);
                System.out.println(field.speak());
            }
        }

        System.out.println("Прямоугольники : " + Ractangle.getCoutOfRectangle());
        System.out.println("Квадараты : " + Ractangle.getCountOfSquares());
    }
}
