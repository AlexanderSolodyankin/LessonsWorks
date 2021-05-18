package Lessons.lessons24.FerstTask;


import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test extends Canvas {
    static final Color DARK = Color.BLACK;
    static final Color LIGHT = Color.LIGHT_GRAY;
    static final Color CIRCLE_COLOR = Color.RED;
    static final int SIDE_OF_SQUARE = 50;

    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
        ChessBoard chessBoard = getFilledBoard();
        chessBoard = addCircles(chessBoard);
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                Ractangle square = chessBoard.getField(i, j);
                graphics.setColor(square.getColore());
                graphics.fillRect(square.getWidth() * i, square.getHeight() * j, square.getWidth(), square.getHeight());

                Circle circle = chessBoard.getCircle(i, j);
                if (circle != null) {
                    graphics.setColor(circle.getColore());
                    graphics.fillOval(circle.getRadius() * i, circle.getRadius() * j, circle.getRadius(), circle.getRadius());
                }
            }
        }

    }

    public ChessBoard getFilledBoard() {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                LocationFigure location = new LocationFigure(i, j);
                if ((i + j) % 2 == 0) {
                    chessBoard.fillField(new Ractangle(SIDE_OF_SQUARE, location, DARK));
                } else {
                    chessBoard.fillField(new Ractangle(SIDE_OF_SQUARE, location, LIGHT));
                }
            }
        }
        return chessBoard;
    }

    public ChessBoard addCircles(ChessBoard chessBoard) {
        Random random = new Random();

        for(int i = 0; i < 12; i++) {
            LocationFigure location = new LocationFigure(random.nextInt(7 - 0) + 0,
                    random.nextInt(7 - 0) + 0);
            chessBoard.addCircles(new Circle(SIDE_OF_SQUARE, location, CIRCLE_COLOR));
        }

        return chessBoard;
    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }


}
