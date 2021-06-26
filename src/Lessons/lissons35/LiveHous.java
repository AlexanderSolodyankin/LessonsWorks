package Lessons.lissons35;

public class LiveHous extends AbstractHouse{
    public LiveHous(){
        super();
    }
    @Override
    public void Paymant() {
        super.Paymant();
        System.out.println("Комуналку");
    }

    @Override
    public String toString() {
        return String.format("%s Жилого дома",super.toString());
    }
}
