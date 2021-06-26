package Lessons.lissons35;

public class Hotels extends AbstractHouse{
    public Hotels() {
        super();
    }

    @Override
    public void Paymant() {
        super.Paymant();
        System.out.println(" За сутки");
    }


    @Override
    public String toString() {
        return String.format("%s Отеля", super.toString());
    }
}
