package Lessons.lessons28;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class lessonse28 {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Классная работа.txt");
        fileWriter.write("1\n");
        fileWriter.write("2\n");
        fileWriter.write("3\n");
        fileWriter.write("4\n");
        fileWriter.write("5\n");
        fileWriter.write("6\n");
        fileWriter.write("7\n");
        fileWriter.write("8\n");
        fileWriter.write("9\n");
        fileWriter.write("0\n");
        fileWriter.close();
        FileReader fileReader = new FileReader("Классная работа.txt");
        Scanner sc = new Scanner(fileReader);
        int i = 1;
        while (sc.hasNextLine()){
            if(i % 3 == 0) {
                System.out.println(i + " - " + sc.nextLine());
            }
            i++;
        }
        fileReader.close();




    }
}
