package Lessons.lissons35;

import Draft.NPSNameOreAge.NPSHuman;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Famaly {
    private HashSet<NPSHuman> famaly = new HashSet<>();

    public Famaly() {
        Random ran = new Random();
        int numFamaly = ran.nextInt(5 - 2 + 1) + 2;

            while (numFamaly > 0){
                famaly.add(new NPSHuman());
                numFamaly--;
            }

    }
    public HashSet<NPSHuman> getFamaly(){
        return famaly;
    }

}
