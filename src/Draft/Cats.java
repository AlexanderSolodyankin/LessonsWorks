package Draft;

public class Cats extends Animal {
    private String kogti;


    public Cats(String hands, String foots, String kogti) {
        super(hands, foots);
        this.kogti = kogti;
    }

    @Override
    public String toString(){
        return String.format("%s Когти: %s ", super.toString(), kogti);
    }
}
