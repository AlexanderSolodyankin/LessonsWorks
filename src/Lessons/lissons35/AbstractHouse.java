package Lessons.lissons35;

import java.util.HashSet;
import java.util.Random;

public class AbstractHouse {
    private HashSet<Famaly> rooms = new HashSet<>();
    private int countMans;

    public AbstractHouse(){
        Random ran = new Random();
        int numbFamely = ran.nextInt(35 - 10 + 1 ) + 10;
        while (numbFamely > 0){
            rooms.add(new Famaly());
            numbFamely--;
        }
        for (Famaly count: this.rooms) {
            this.countMans = this.countMans + count.getFamaly().size();
        }
    }

    public HashSet<Famaly> getRooms(){
        return this.rooms;
    }

    public void countHumans(){

    }

    public void Paymant(){
        System.out.print("Оплачивает: ");
    }
    public int getCountMans(){
        return countMans;
    }

    @Override
    public String toString(){
        return String.format("Какойто Адрес ");
    }

}
