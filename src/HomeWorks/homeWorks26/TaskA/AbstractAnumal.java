package HomeWorks.homeWorks26.TaskA;
abstract class AbstractAnumal {
    private String name;
    private int weight;
    private AbstractPlants plants;

    public AbstractAnumal(String name, int weight, AbstractPlants plants) {
        this.name = name;
        this.weight = weight;
        this.plants = plants;
    }

    public AbstractPlants getPlants() {
        return plants;
    }

    public void setPlants(AbstractPlants plants) {
        this.plants = plants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString(){
        return String.format("Животное: %s \n" +
                "Вес животного: %s", name, weight);
    }
}
