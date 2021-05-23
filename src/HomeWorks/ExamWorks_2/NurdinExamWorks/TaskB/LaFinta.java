package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskB;

public class LaFinta extends Pizza {
    private boolean isMushroom;

    public LaFinta() {
    }

    public LaFinta(int price, double weight, boolean isMushroom) {
        super(price, weight);
        this.isMushroom = isMushroom;
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("Готовиться пицца(Ла Финта) №" + getIdPizza() + "!");
    }

    @Override
    public void deliver() {
        System.out.println("Доставляется пицца(Ла Финта) №" + getIdPizza() + "!");
    }

    @Override
    public String toString() {
        return "Ла Финта" + ": " + (isMushroom ? "с грибами" : "без грибов") + ", " + super.toString();
    }

    public boolean isMushroom() {
        return isMushroom;
    }

    public void setMushroom(boolean mushroom) {
        isMushroom = mushroom;
    }
}
