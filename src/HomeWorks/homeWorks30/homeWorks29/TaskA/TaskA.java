package HomeWorks.homeWorks30.homeWorks29.TaskA;

import java.io.*;
import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("C:\\Users\\Professional\\Desktop" +
                "\\Отправка домашки\\HomeWorks\\src\\com\\homeWorks29\\TaskA\\TaskA.java")){
            Scanner sc = new Scanner(fileReader);
            FileWriter fileWriter = new FileWriter("Lessons_29.txt");
            String writeFile = "";
            while(sc.hasNextLine()){
                writeFile = writeFile + sc.nextLine() + "\n";

            }
            fileWriter.write(writeFile);
            fileWriter.close();

        } catch (FileNotFoundException notFile) {
            System.out.println("Не волучается найти файл кода проверти путь к файлу");
        } catch (IOException inputOutError) {
            inputOutError.printStackTrace();
        }
        File fileInformatin = new File("Lessons_29.txt");
        if (fileInformatin.length() > 100){
          try{
              throw new IllegalStateException();
          }catch (IllegalStateException fileLarge){
              System.out.println("Код слишком большой");
          }
        }
        try {
            FileReader readInString = new FileReader("Lessons_29.txt");
            Scanner scanLine = new Scanner(readInString);
            FileWriter lineText = new FileWriter("Lessons_29_oneLine.txt");
            String line = "";
            String line2 = "";
            while (scanLine.hasNextLine()){
                line += scanLine.nextLine();
            }
            if(line.contains(" ")){
                line2 = line.replace(" ", "");
            }
            lineText.write(line2);
            lineText.close();

        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл для переноса кода в одну строку");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
