package HomeWorks.homeWorcks19.TaskB;

public class Bread {
   protected int weight;
   protected int price;
   protected String productMode;

    public Bread(){}

    public Bread(int weight, int price, String productMode) {
        this.weight = weight;
        this.price = price;
        this.productMode = productMode;
    }

    public String getProductMode() {
        return productMode;
    }

    public void setProductMode(String productMode) {
        this.productMode = productMode;
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
        return String.format("Хлеб: Обычный \n" +
                            "Вес: %s\n" +
                            "Цена: %s\n" +
                "Производитель: %s", weight, price, productMode);
    }
}
