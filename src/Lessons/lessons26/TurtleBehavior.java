package Lessons.lessons26;

public interface TurtleBehavior extends eggs, Panzer, swiming{

    @Override
     default void swim(){
        System.out.println("Не обязательно плавать");
    }

}
