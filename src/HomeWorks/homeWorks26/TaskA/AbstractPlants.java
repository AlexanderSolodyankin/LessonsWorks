package HomeWorks.homeWorks26.TaskA;

abstract class AbstractPlants {
    private String name;
    private int weight;
    private boolean eating;

    public AbstractPlants(String name, int weight, boolean eating) {
        this.name = name;
        this.weight = weight;
        this.eating = eating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return weight;
    }

    public void setHeight(int weight) {
        this.weight = weight;
    }

    public boolean isEating() {
        return eating;
    }

    public void setEating(boolean eating) {
        this.eating = eating;
    }

    @Override
    public String toString(){
        return String.format("Растение: %s\n" +
                "%s", name, eating? "Сьедобное" : "Несьедобное");
    }
}
