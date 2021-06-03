package HomeWorks.homeWorks28.TaskA;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskA {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("song_1.txt");                            // читаю текстовый файл
        Song song = new Song();                                                              // вызываю новый клас песня
        Scanner sc = new Scanner(fileReader);                          // использую сканнер для ввода информации с файла
        String str;                                     // переменная для хранения получинной строки при прочтении файла
        String str1 = "";                                               // переменная для ввода информации в поля класса
        Pattern p = Pattern.compile("[a-zA-Zа-яА-Я]+");                            // не совсем понимаю как это работает
        // если не ошибаюсь патерн это метод дешифровки по символам

        Matcher m1;                              // не понимаю для чего эта штука нужна высмотрел данный кол в интернете

        // ресурс с которого снял информацию: http://espressocode.top/extracting-word-string-java/

        while (sc.hasNextLine()) {                             // цикл для перебора строк в сканере чтобы прочитать файл
            str = sc.nextLine();                                // передача строки в переменную для дальнейшего перебора
            m1 = p.matcher(str);                          // передача стоковаой переменной для того чтобы вытащить слова
            if (str.contains("Название:")) {                               // сравнение если в строке присутствует слово
                str1 = "";                                               // переменная для ввноса значения в поле класса
                while (m1.find()) {                                            // насколько я понял это цикл поиска слов
                    if (!m1.group().equals("Название")) {         // уловие при котором обходится слово вписанное в поле
                        str1 = str1 + m1.group()  + " ";    // если в строке много слов то их обьедение в переменной для
                        // того чтобы задать как значение в поле класса
                    }
                }
                song.setName(str1);                                      // ввод значение в поле класса (название песни)
                str1 = "";                              // обнуление переменной для того чтобы избавится от лишнего шума
                str = "";        // обнуления переменной для того чтобы не нужные значение не вносились в последнее поле
            }
            if(str.contains("Исполнитель:")){
                str1 = "";
                while (m1.find()) {
                    if (!m1.group().equals("Исполнитель")) {
                        str1 = str1 + m1.group()  + " ";
                    }
                }
                song.setExecutor(str1);                                     // ввод значение в поле класса (Исполнитель)
                str1 = "";
                str = "";
            }
            if(str.contains("Жанр:")){
                str1 = "";
                while (m1.find()) {
                    if (!m1.group().equals("Жанр")) {
                        str1 = str1 + m1.group()  + " ";
                    }
                }
                song.setGenre(str1);                                               // ввод значение в поле класса (Жанр)
                str1 = "";
                str = "";
            }
            if (!str.contains("Текст Песни:")) {                // условие при котором вносятся все значение кроме этого
                str1 = str1 + str + "\n";                        // присвоение всех остальных значений для ввода в класс
            }

        }
        song.setSonfText(str1);                                             // ввод значение в поле класса (текст песни)
        System.out.println(song);                             // вывод на консоль всей информации что хронится в обьекте
        fileReader.close();                                                                            // закрываем файл


        FileWriter fileWriter = new FileWriter("Song_3.txt");                                     // создаю файл
        fileWriter.write(song.toString());                                           // вношу в него все значения класса
        fileWriter.close();                                                                  // закрываю и сохроняю файл


    }
}
