package HomeWorks.homeWorks20.TaskC;

public class Employee extends Human{
    private String position;
    private int salary;
    private int prize;
    private int fine;
    private  int experience;
    private int vacatiuonDays;
    Human man;

    public Employee(Human man){
        super();
        this.man = man;

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
        return String.format("Сотрудник: %s. %s", man.getName(), man.getSerName());
    }
}
