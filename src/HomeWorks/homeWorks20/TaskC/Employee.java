package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

public class Employee extends Human{
    private String position;
    private int salary;
    private int prize;
    private int fine;
    private  int experience;
    private int vacatiuonDays;
    Human man;

    public Employee(Human man){
        this.man = man;
        this.salary = getNum();
        if(this.salary < 0){
            this.salary = getNum();
        }
        if(this.salary < 20000){
            this.position = "Охраник";
        }
        if(this.salary > 20000 && this.salary < 30000){
            this.position = "Официант";
        }
        if(this.salary > 30000 && this.salary < 90000){
            this.position = "Повар";
        }
        this.prize = this.salary / 3;
        this.fine = salary / 100;
        this.experience = getAge() / 9;
        this.vacatiuonDays = getAge() / 3;
//        actions();
    }

    public Human getMan() {
        return man;
    }

    public void setMan(Human man) {
        this.man = man;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getVacatiuonDays() {
        return vacatiuonDays;
    }

    public void setVacatiuonDays(int vacatiuonDays) {
        this.vacatiuonDays = vacatiuonDays;
    }

    @Override
    public String toString(){
        return String.format("Сотрудник: %s. %s \n" +
                "Должность: %s\n" +
                "Опыработы : %s лет\n" +
                "Заработная плата: %s\n", man.getName(), man.getSerName(), position, experience, salary);
    }
    public int getNum(){
        Random ran = new Random();
        int num = ran.nextInt(90000 - 5000 + 1) + 5000;
        return num;
    }

    void actions(){
        Random ran = new Random();
        int num = ran.nextInt(3 - 1 + 1) + 1;
        if(num == 1){
            System.out.printf("Вышел в отпуск.\n" +
                    "Получил премию: %s\n" +
                    "Количество дней в отпуск: %s\n", prize, vacatiuonDays);
        }
        if (num == 2){
            System.out.println("Вышел на работу.\n");
        }
        if (num == 3){
            System.out.printf("Опоздал. и получил штраф %s\n", this.fine);
        }

    }
}
