package Lessons.lessons27.MyLessons27;

public interface Oceanarium extends MakeSounds, Swimingable{
    default void located(){
        System.out.println("Находится в океанариуме");
    }
}
