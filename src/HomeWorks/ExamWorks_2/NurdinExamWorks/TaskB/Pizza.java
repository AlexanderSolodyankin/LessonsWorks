package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskB;

public class Pizza {
    private static int idPizza;

    private int price;
    private double weight;

    public Pizza() {
    }

    public Pizza(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public void cook() {
        idPizza++;
    }

    public void deliver() {
        System.out.println("Доставляется пицца №" + idPizza + '!');
    }

    @Override
    public String toString() {
        return "цена: " + price +
                ", вес: " + weight
                ;
    }

    public static int getIdPizza() {
        return idPizza;
    }

    public static void setIdPizza(int idPizza) {
        Pizza.idPizza = idPizza;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
