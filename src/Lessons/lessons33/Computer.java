package Lessons.lessons33;

public class Computer extends NootBook{

    public Computer(String name, double cena, boolean skidka) {
        super(name, cena, skidka);
    }

    @Override
    public String toString() {
        return String.format("Компьютер :\n %s" , super.toString());
    }
}
