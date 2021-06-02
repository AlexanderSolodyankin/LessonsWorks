package HomeWorks.homeWorks26.TaskB;

abstract  class AbstractEmployee implements Actionable{// Абстрактный класс сотрудника
    private String name;
    private int age;
    private int wage;
    private int experience;



    public AbstractEmployee(String name, int age, int wage, int experience) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString(){
        return  "\nИмя: " + name +
                "\nВозраст: " + age +
                "\nЗарабатная плата: " + wage +
                "\nОпыт работы: " + experience;
    }


}
