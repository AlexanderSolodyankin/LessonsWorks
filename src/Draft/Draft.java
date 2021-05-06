package Draft;

public class Draft {
    public static void main(String[] args) {
        Gerl[] ger = new Gerl[2];
        ger[0] = new Gerl("Маша");
        ger[1] = new Gerl("Витя");
        Boy playBoy = new Boy("Саша", ger);
        System.out.println(playBoy);

    }
}
