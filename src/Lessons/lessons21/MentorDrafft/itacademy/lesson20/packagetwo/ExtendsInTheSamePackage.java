package Lessons.lessons21.MentorDrafft.itacademy.lesson20.packagetwo;

public class ExtendsInTheSamePackage extends ClassB {
    public void test() {
        // private - Доступ есть только в самом классе
        // default - Доступ есть в самом классе и в том же пакете где класс
        // protected - Доступ есть в самом классе, том же пакете где класс и в классах которые наследуют его
        // public - Доступ есть везде

        privateField = 1; // Доступа нет т к мы не в классе ClassB
        defaultField = 1; // Доступ есть т к мы в том же пакете(kg.itacademy.lesson20.packagetwo) что и ClassB
        protectedField = 1; // Доступ есть т к мы наследуемся от класса ClassB
        publicField = 1; // Доступен везде

        privateMethod(); // Доступа нет т к мы не в классе ClassB
        defaultMethod(); // Доступ есть т к мы в том же пакете(kg.itacademy.lesson20.packagetwo) что и ClassB
        protectedMethod(); // Доступ есть т к мы наследуемся от класса ClassB
        publicMethod(); // Доступен везде
    }
}
