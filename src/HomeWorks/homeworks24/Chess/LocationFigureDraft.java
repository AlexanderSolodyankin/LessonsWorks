package HomeWorks.homeworks24.Chess;
/*
Страница 1
 */


/**
 * Создан класс положение фигуры с подписью чо это черновой вариант так как мы пробуем созждать программу с нуля
 */
 class LocationFigureDraft { // убираю модификатор паблик чтобы классы не вмешивались в работу всего проээкта
    private int x;
    private int y;

    protected LocationFigureDraft(int x, int y){
        this.x = x;
        this.y = y;
    }

    // создаем вод и вывод информации из класса

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // создаю метот вывода информации
    @Override
    public String toString(){return String.format("%s, %s", x, y);}
}
