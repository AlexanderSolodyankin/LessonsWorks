package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskB;

public class Pepperoni extends Pizza {
    private boolean isMeat;

    public Pepperoni() {
    }

    public Pepperoni(int price, double weight, boolean isMeat) {
        super(price, weight);
        this.isMeat = isMeat;
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("Готовиться пицца(Пепперони) №" + getIdPizza() + "!");
    }

    @Override
    public void deliver() {
        System.out.println("Доставляется пицца(Пепперони) №" + getIdPizza() + "!");
    }

    @Override
    public String toString() {
        return "Пепперони" + ": " + (isMeat ? "с мясом" : "без мяса") + ", " + super.toString();
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }
}
