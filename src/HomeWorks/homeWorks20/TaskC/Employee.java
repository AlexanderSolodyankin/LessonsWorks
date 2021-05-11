package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

 class Employee extends Human{
    protected String position;
    private int salary;
    private int prize;
    private int fine;
    private int experience;
    private int vacatiuonDays;

//    public Employee(){}

    public Employee(){
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

    }

    public Employee(String position) {
        this.position = position;
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
        String string = String.format("Сотрудник: %s. %s \n" +
                "Должность: %s\n" +
                "Опыработы : %s лет\n" +
                "Заработная плата: %s\n", getName(), getPatronymic(), position, experience, salary);
        return string;
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
            System.out.printf("Вышел в отпуск на %s дней.\n" +
                    "Получил премию: %s\n",vacatiuonDays, prize);
        }
        if (num == 2){
            System.out.println("Вышел на работу.\n");
        }
        if (num == 3){
            System.out.printf("Опоздал и получил штраф: %s\n", this.fine);
        }

    }
}
