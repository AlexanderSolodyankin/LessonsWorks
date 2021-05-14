package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

 class Employee extends Human{
    protected String position; //позиция
    private int salary;// зарплата
    private int prize;// премия
    private int fine;// штраф
    private int experience;// опыт
    private int vacatiuonDays;// колчество дней в отпуске

    public Employee(){}

     public Employee(String name, String serName, String patronymic, int age,
                     String address, String gender, String position, int salary) {

         super(name, serName, patronymic, age, address, gender);
         this.position = position;
         this.salary = salary;
         this.prize = salary / 2;
         if(position.equals("Повар")){
             this.fine = (salary / 2) / 3;
             this.vacatiuonDays = getAge() / 3;
         }
         if(position.equals("Охрана")){
             this.fine = salary / 100;
             this.vacatiuonDays = getAge() / 5;
         }
         if(position.equals("Официант")){
             this.fine = (salary / 2) / 5;
             this.vacatiuonDays = getAge() / 2;
         }

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
