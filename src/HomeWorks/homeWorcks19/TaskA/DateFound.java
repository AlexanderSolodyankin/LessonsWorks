package HomeWorks.homeWorcks19.TaskA;

import java.util.Scanner;
// Создал клас для определения даты рождения или какой либо даты
public class DateFound {
    int day;
    int mounth;
    int years;

    public DateFound(int day, int mounth, int years) {
        Scanner sc = new Scanner(System.in);
        if(day > 0 && day <= 31) {
            this.day = day;
        }
        else {
            System.err.println("Неверно введено число дня");
            System.err.print("Введите верную дату дня: ");
            setDay(sc.nextInt());
        }

        if(mounth > 0 && mounth <= 12) {
            this.mounth = mounth;
        }
        else {
            System.err.println("Неверно введено число месяца");
            System.err.print("Введите верную дату месяца: ");
            setMounth(sc.nextInt());
        }

        if(years > 1900 && years <= 2021) {
            this.years = years;
        }
        else {
            System.err.println("Неверно введено число года");
            System.err.print("Введите верную дату года: ");
            setYears(sc.nextInt());
        }

    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        Scanner sc = new Scanner(System.in);
        if(day > 0 && day <= 31) {
            this.day = day;
        }
        else {
            System.err.println("Неверно введена дата дня");
            System.err.print("Введите верную дату дня: ");
            setDay(sc.nextInt());
        }
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        Scanner sc = new Scanner(System.in);
        if(mounth > 0 && mounth <= 12) {
            this.mounth = mounth;
        }
        else {
            System.err.println("Неверно введено число месяца");
            System.err.print("Введите верную дату месяца: ");
            setMounth(sc.nextInt());
        }
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        Scanner sc = new Scanner(System.in);
        if(years > 1900 && years <= 2021) {
            this.years = years;
        }
        else {
            System.err.println("Неверно введено число года");
            System.err.print("Введите верную дату года: ");
            setYears(sc.nextInt());
        }
    }

    @Override
    public String toString(){
        return String.format("%s. %s. %s", getDay(), getMounth(), getYears());
    }

}
