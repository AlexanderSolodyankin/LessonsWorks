package Draft.GraficsDraft;

import javax.swing.*;

public class GrafDraft {
    public static void main(String[] args) {
        int w = 600;// высота граф окна
        int h = 800;// Ширина Граф окна
        JFrame f = new JFrame(); // вызываем клас графического окна
        // Вызываем созданый класс граф обьектов
        f.setSize(w,h); // задается размер графическому окну
        f.setTitle("My Windows!!!");// задаем титульное название
//        f.add(); // Задаем во фрейм класс с оьектами для графического вывода
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Задаем команду пока открыто окно работает программа
        f.setVisible(true);// в значении видимости выбираем значение правда что бы видеть окно

        /**
         * 1)!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
         * Теперь создаем класс в который будем вкладывать для привязки во фрейм
         */

    }
}
