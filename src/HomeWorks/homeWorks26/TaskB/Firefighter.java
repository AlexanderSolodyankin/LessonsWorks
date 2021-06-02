package HomeWorks.homeWorks26.TaskB;

 class Firefighter extends AbstractEmployee{

    public Firefighter(String name, int age, int wage, int experience) {
        super(name, age, wage, experience);
    }

    @Override
    public String toString(){
        return String.format("Пожарный %s",super.toString());
    }

    @Override
     public void actions(){
        System.out.println("Тушит пожары");
    }
}
