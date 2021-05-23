package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskB;

public class Margarita extends Pizza {
    private boolean isSpicy;

    public Margarita() {
    }

    public Margarita(int price, double weight, boolean isSpicy) {
        super(price, weight);
        this.isSpicy = isSpicy;
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("Готовиться пицца(Маргарита) №" + getIdPizza() + "!");
    }

    @Override
    public void deliver() {
        System.out.println("Доставляется пицца(Маргарита) №" + getIdPizza() + "!");
    }

    @Override
    public String toString() {
        return "Маргарита" + ": " + (isSpicy ? "острое" : "не острое") + ", " + super.toString();
    }

    public boolean isSpicy() {
        return isSpicy;
    }

    public void setSpicy(boolean spicy) {
        isSpicy = spicy;
    }
}
