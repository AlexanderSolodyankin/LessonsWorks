package Draft;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

class Draft {
    public static void main(String[] args) throws FileNotFoundException {
        File file  = new File("Song_1.txt");
        System.out.println(file.length());
        FileReader fileReader = new FileReader("Song_1.txt");
        Scanner sc = new Scanner(fileReader);

        System.out.println(sc.nextLine());





    }


}
