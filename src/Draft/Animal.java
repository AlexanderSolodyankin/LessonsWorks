package Draft;

public class Animal {
    private String hands;
    private String foots;

    public Animal(){

    }

    public Animal(String hands, String foots) {
        this.hands = hands;
        this.foots = foots;
    }
    @Override
    public String toString(){
        return String.format(" Руки: %s \n" +
                "Ноги: %s\n", hands, foots);
    }
}
