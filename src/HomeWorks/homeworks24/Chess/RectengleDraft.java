package HomeWorks.homeworks24.Chess;

import java.awt.*;

/**
 * Страница 3
 * действие второе
 */

 class RectengleDraft extends FigureChess{
    /**
     * Создали класс прямоугольник и наследовали параметры от класса фигура
     * и добавили новые свойства ( расширили класс фигура)
     */

    private int weidth;
     private int height;
     /**
      *  Забыл доьавить счетчик на то что что подсчитать сколько кубиков или прямоугольников
      * */

     private static int countRec;
     private  static int countSquar;

     public static int getCountRec(){return countRec;}
    public static int getCountSquar(){return countSquar;}
    /**
     * -----------------------------------------------------------------------------------------------------------
     **/


    protected RectengleDraft(LocationFigureDraft local, Color col, boolean inVis, int weidth, int height) {
        // конструктор дял создания прямоугольника
        super(local, col);
        this.height = height;
        this.weidth = weidth;
        countRec++;
    }

    protected RectengleDraft(int sideOfSquare, LocationFigureDraft loc, Color col){
        super(loc,col);
        this.weidth = sideOfSquare;
        this.height = sideOfSquare;
        countSquar++;
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
    /**
     * Закончили с созданием класса прямоугольник
     * теперь переходим к странице 4 на которой будем создовать игровую доску
     */
}
