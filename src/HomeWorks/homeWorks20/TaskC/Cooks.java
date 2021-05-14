package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

class Cooks extends Employee{
    private String dishes;
    private String spesial;
    private String sertific;

    public Cooks(String name, String serName, String patronymic, int age,
                 String address, String gender, String position, int salary) {
        super(name, serName, patronymic, age, address, gender, position, salary);
        Random ran = new Random();

        String[][] setSetup = new String[3][5];
        setSetup[0][0] = "Яишница";
        setSetup[0][1] = "Суп";
        setSetup[0][2] = "Пирог";
        setSetup[0][3] = "Салат";
        setSetup[0][4] = "Лазанья";

        setSetup[1][0] = "Помошник повара";
        setSetup[1][1] = "повар стажор";
        setSetup[1][2] = "Повар Бригадир";
        setSetup[1][3] = "Помошник шеф повара";
        setSetup[1][4] = "Шеф повар";

        setSetup[2][0] = "Самоучка";
        setSetup[2][1] = "Сертификат техникума";
        setSetup[2][2] = "Диплом";
        setSetup[2][3] = "Поддельный сертификат";
        setSetup[2][4] = "Диплом Шеф повара";

        this.dishes = setSetup[0][ran.nextInt(5)];
        this.spesial = setSetup[1][ran.nextInt(5)];
        this.sertific = setSetup[2][ran.nextInt(5)];
    }

    public String getDishes() {
        return dishes;
    }

    public void setDishes(String dishes) {
        this.dishes = dishes;
    }

    public String getSpesial() {
        return spesial;
    }

    public void setSpesial(String spesial) {
        this.spesial = spesial;
    }

    public String getSertific() {
        return sertific;
    }

    public void setSertific(String sertific) {
        this.sertific = sertific;
    }
    @Override
    public String toString(){
        return String.format("Имя повара: %s \n" +
                "Фамилия повара: %s \n" +
                "Возраст: %s\n" +
                "Специальность: %s\n" +
                "Готовит блюдо: %s \n" +
                "Сертификат: %s \n",getName(),getSerName(),getAge(),getSpesial(),getDishes(),getSertific());
    }
}
