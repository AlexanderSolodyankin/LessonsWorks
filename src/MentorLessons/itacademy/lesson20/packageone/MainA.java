package MentorLessons.itacademy.lesson20.packageone;

//import kg.itacademy.lesson20.packagetwo.ClassB;

public class MainA {
    public static void main(String[] args) {
        /**
        // private - Доступ есть только в самом классе
        // default - Доступ есть в самом классе и в том же пакете где класс
        // protected - Доступ есть в самом классе, том же пакете где класс и в классах которые наследуют его
        // public - Доступ есть везде

       +ClassA classAObject = new ClassA();
        -classAObject.privateField = 1; // Доступа нет, т к мы не в классе ClassA
        +classAObject.defaultField = 1; // Доступа есть, т к мы в том же пакете(kg.itacademy.lesson20.packageone) что и класс ClassA
        +classAObject.protectedField = 1; // Доступа есть, т к мы в том же пакете(kg.itacademy.lesson20.packageone) что и класс ClassA
        +classAObject.publicField = 1; // Доступа есть, т к public доступен везде

        -classAObject.privateMethod(); // Доступа нет, т к мы не в классе ClassA
        +classAObject.defaultMethod(); // Доступа есть, т к мы в том же пакете(kg.itacademy.lesson20.packageone) что и класс ClassA
        +classAObject.protectedMethod(); // Доступа есть, т к мы в том же пакете(kg.itacademy.lesson20.packageone) что и класс ClassA
        +classAObject.publicMethod(); // Доступа есть, т к public доступен везде

       -ClassB classBObject = new ClassB();
       -classBObject.privateField = 1; // Доступа нет, т к мы не в классе ClassB
       -classBObject.defaultField = 1; // Доступа нет, т к мы в kg.itacademy.lesson20.packageone, а не в том же пакете(kg.itacademy.lesson20.packagetwo) что и класс ClassB
       -classBObject.protectedField = 1; // Доступа нет, т к не в том же пакете(kg.itacademy.lesson20.packagetwo) что и класс ClassB и не в классе наследнике класса ClassB
       -classBObject.publicField = 1; // Доступа есть, т к public доступен везде

       -classBObject.privateMethod(); // Доступа нет, т к мы не в классе ClassB
       -classBObject.defaultMethod(); // Доступа нет, т к мы в kg.itacademy.lesson20.packageone, а не в том же пакете(kg.itacademy.lesson20.packagetwo) что и класс ClassB
       -classBObject.protectedMethod(); // Доступа нет, т к не в том же пакете(kg.itacademy.lesson20.packagetwo) что и класс ClassB и не в классе наследнике класса ClassB
       -classBObject.publicMethod(); // Доступа есть, т к public доступен везде
**/


    }
}
