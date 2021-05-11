package HomeWorks.homeWorks20.TaskC;



class Waiter extends Employee {

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
