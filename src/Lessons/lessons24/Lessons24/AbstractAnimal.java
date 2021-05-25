package Lessons.lessons24.Lessons24;

public abstract class AbstractAnimal {
    private int weight;
    private String color;
    private int age;

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public AbstractAnimal(int weight, String color, int age){
        this.age = age;
        this.color = color;
        this.weight=weight;
    }

    public String speakAll(){
        String speakAll ;
        speakAll = String.format("Возраст: %s, Цвет: %s, Вес: %s", age, color, weight);
        return speakAll;
    }
}
class Cat extends AbstractAnimal{
    private int claws;
    private int tailLength;
    private boolean mustache;

    public Cat (int weight, String color, int age, int claws, int tailLength, boolean mustache){
        super(weight,color,age);
        this.claws=claws;
        this.tailLength = tailLength;
        this.mustache = mustache;
    }
    public int getClaws() {
        return claws;
    }

    public void setClaws(int claws) {
        this.claws = claws;
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public boolean isMustache() {
        return mustache;
    }

    public void setMustache(boolean mustache) {
        this.mustache = mustache;
    }

    @Override
    public String speakAll(){
        return String.format("%s, Количество когтей: %s, Длина хвоста: %s, %s",
                super.speakAll(),claws, tailLength, mustache? "Усы есть": " нет усов");
    }


}

