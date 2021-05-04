package HomeWorks.homeLessons17;

import java.util.Random;

public class RandomAccessMemory {
    private int num;
    private  String name;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public RandomAccessMemory(int num, String name){
        this.num = num;
        this.name = name;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setNum(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString(){
        return String.format("Оперативная память \n" +
                "Объем памяти: %s \n" +
                "Фирма производитель: %s.", getNum(), getName());
    }
}
