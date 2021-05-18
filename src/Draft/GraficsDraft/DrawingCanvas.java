package Draft.GraficsDraft;

import java.awt.*; // вызываем библеотеку для граф движка
import java.awt.geom.*; // вызываем беблиотеку для граф  движка
import javax.swing.*; // вызываем компоненты граф движка

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;

    public DrawingCanvas(int w, int h) {
        this.height = h;
        this.width = w;
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;

        RenderingHints rh = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2D.setRenderingHints(rh);

/**
 Ellipse2D.Double e = new Ellipse2D.Double(200,75,100,100);  // фигура элипс
 g2D.setColor(Color.CYAN);
 g2D.fill(e);

 Line2D.Double line = new Line2D.Double(100,250,300,75); // фигура линия
 g2D.setColor(Color.BLUE);
 g2D.draw(line);

 Rectangle2D.Double r = new Rectangle2D.Double(0,0,50,60); // фигура квадрад
 g2D.setColor(new Color(250,149,237));
 g2D.fill(r);


 QuadCurve2D q2D = new QuadCurve2D.Double();  // матиматическая функция ( квадратная)
 q2D.setCurve(0,0,Значение класса 1, Значение класса 2, 0,0);
 g2D.draw(q2D);
 // нули в параметрах это кординаты начальной точки и конечной точки

 CubicCurve2D c2D = new CubicCurve2D.Double(); матиматическая функция ( кубическая)
 c2D.setCurve(0,0,Значение класса 1, Значение класса 2, Значение класса 3, Значение класса 4, 0,0);
 g2D.draw(q2D);

 */





    }
}
