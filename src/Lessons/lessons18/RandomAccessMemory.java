package Lessons.lessons18;

public class RandomAccessMemory {
    private int num;
    private  String name;
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public RandomAccessMemory(){}

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
        return String.format("\nОперативная память \n" +
                "Объем памяти: %s \n" +
                "Фирма производитель: %s. \n", getNum(), getName());
    }
}
