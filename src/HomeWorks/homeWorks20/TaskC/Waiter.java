package HomeWorks.homeWorks20.TaskC;



class Waiter extends Employee {

    public Waiter(String name, String serName, String patronymic, int age, String address, String gender, String position, int salary) {
        super(name, serName, patronymic, age, address, gender, position, salary);
    }

    void broudOrder(){
        System.out.println("Принял(а) заказ ");
    }
    void carryOrder(){
        System.out.println("Отнес(ла) заказ");
    }
    @Override
    public String toString(){
        String outWaiter = String.format("Официант(ка): %s %s",getName(), getPatronymic());
        return outWaiter;
    }
}
