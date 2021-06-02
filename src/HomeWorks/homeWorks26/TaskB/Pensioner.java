package HomeWorks.homeWorks26.TaskB;

 class Pensioner extends AbstractEmployee{

    public Pensioner(String name, int age, int wage, int experience) {
        super(name, age, wage, experience);
    }

    @Override
    public String toString(){
        return String.format("Пенсионер: %s",super.toString());
    }
    @Override
     public void actions(){
        System.out.println("Сидит дома");
    }
}
