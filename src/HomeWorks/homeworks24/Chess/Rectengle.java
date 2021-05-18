package HomeWorks.homeworks24.Chess;

import java.awt.*;

/**
 * Страница 3
 * действие второе
 */

 class Rectengle extends FigureChess{
    /**
     * Создали класс прямоугольник и наследовали параметры от класса фигура
     * и добавили новые свойства ( расширили класс фигура)
     */

    private int weidth;
     private int height;

    protected Rectengle(LocationFigureDraft local, Color col, boolean inVis, int weidth, int height) {
        super(local, col, inVis);
        this.height = height;
        this.weidth = weidth;
    }

    public int getWeidth() {
        return weidth;
    }

    public void setWeidth(int weidth) {
        this.weidth = weidth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // Переопределяем speak!!!
    public String speak(){
        if(this.weidth == this.height){
            return String.format("Квадрат : %s  Высота: %s, Ширина: %s", super.speak(), weidth, height);
        }
        else { // на данном этапе пробуем проверить и вызвать данную фигуру посмотреть что у нас получислось
            return String.format("Прямоугольник: %s  Высота: %s, Ширина: %s", super.speak(), weidth, height);
        }
    }
}
