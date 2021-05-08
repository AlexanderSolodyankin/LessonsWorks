package HomeWorks.homeWorcks19.TaskB;

public class Bread {
    int weight;
    int price;

    public Bread(){}

    public Bread(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return String.format("Хлеб : \n" +
                            "Вес: %s\n" +
                            "Цена: %s\n", weight, price);
    }
}
