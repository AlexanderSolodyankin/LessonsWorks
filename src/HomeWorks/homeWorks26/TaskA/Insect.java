package HomeWorks.homeWorks26.TaskA;

public class Insect extends AbstractAnumal{

    public Insect(String name, int weight, AbstractPlants plants){
        super(name, weight, plants);
    }

    @Override
    public String toString(){
        return String.format("Насекомое: %s\n" +
                "%s\n", getName(), (getPlants()!=null)? ("Питается: " + getPlants()) : "Пьет Кровь ");
    }

}
