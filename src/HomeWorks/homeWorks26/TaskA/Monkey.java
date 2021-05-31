package HomeWorks.homeWorks26.TaskA;

import javax.sound.midi.Soundbank;

public class Monkey extends AbstractAnumal implements  ActiveLIve{
    private AbstractAnumal animal;


    public Monkey(String name, int weight, AbstractPlants plants, AbstractAnumal animal) {
        super(name, weight, plants);
        this.animal = animal;
    }

    public AbstractAnumal getAnimal() {
        return animal;
    }

    public void setAnimal(AbstractAnumal animal) {
        this.animal = animal;
    }

    @Override
    public String toString(){
        return "Обезьяна: " + getName() + "\nВес обезьяны: " + getWeight() ;
    }

    @Override
    public void clime() {
        ActiveLIve.super.clime();
    }

    @Override
    public void drag() {
        if(animal != null ){
            if(animal.getWeight() < this.getWeight()) {
                System.out.printf("На обезьяне сидит: %s", animal.toString());
            }
            if (animal.getWeight() > this.getWeight()){
                System.out.println("Обезьяну раздовил " + animal);
            }
        }
        else {
            System.out.println("На обезьяне никого нет");
        }

    }

    @Override
    public void eat() {
        if(getPlants() != null){
            if (getPlants().isEating()){
                System.out.println("Кушает: " + getPlants());
            }
            else {
                System.out.println("Расматривает: " + getPlants());
            }
        }
        else {
            System.out.println("Ищит еду");
        }

    }
}
