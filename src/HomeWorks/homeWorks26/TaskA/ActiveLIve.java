package HomeWorks.homeWorks26.TaskA;

public interface ActiveLIve extends Climbable, Draggable, Eatable{
    @Override
    default void clime(){
        System.out.println("Карабкается");
    }
}
