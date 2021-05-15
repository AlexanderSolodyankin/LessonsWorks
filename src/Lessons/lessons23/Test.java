package Lessons.lessons23;

import javax.swing.*;
import java.awt.*;

 class Test extends Canvas {
    public Test() {
    }

    @Override
    public void paint(Graphics graphics) {
//        final double PI = 3.1415;
//        graphics.setColor(Color.BLACK);
//        graphics.fillOval(100, 100, 150, 120);
//        System.out.println(String.format("Черный, площадь %s, длина %s", 50 * 50 * PI, (PI * 50 + 150)));
//
//        graphics.setColor(Color.GREEN);
//        graphics.fillOval(200, 200, 50, 60);

        final Circle[] arreyCircl = new Circle[7];
        Color[] colors = new Color[7];
        colors[0] = Color.cyan;
        colors[1] = Color.BLACK;
        colors[2] = Color.GREEN;
        colors[3] = Color.YELLOW;
        colors[4] = Color.white;
        colors[5] = Color.BLUE;
        colors[6] = Color.LIGHT_GRAY;

        for(int i = 0 ; i < arreyCircl.length; i++){
            arreyCircl[i] = new Circle(((i*100)/2),((i*100)/2),((i*100)/4),((i*100)/4),colors[i]);
        }
        for (Circle circlArreys: arreyCircl) {
            graphics.setColor(circlArreys.getColor());
            graphics.fillOval(circlArreys.getX(), circlArreys.getY(), circlArreys.getWhith(), circlArreys.getHeight());
        }


    }

    public static void main(String[] args) {
        Test canvas = new Test();
        JFrame frame = new JFrame();
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }

}
