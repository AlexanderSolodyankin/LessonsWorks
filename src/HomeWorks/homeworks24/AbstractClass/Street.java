package HomeWorks.homeworks24.AbstractClass;

import java.util.Arrays;
import java.util.Random;

 class Street {                 // класс улица
    // в себе имеет значения
    private AtHomes[] houses;        // количество домов построенных на улице
    private String name;             // название улицы
    private Residents[] homeComs;    // совет из упровляющих домами
    private Residents quarterly;     // упровляющий улицей

    public Street(AtHomes[] atHomes){
        this.houses = atHomes; // присвоенгие масива домов
        setHomeComs(atHomes); // присвоение масива совет домкомов
        randomQuarlety(); // присоение значение квартального
        randomNameStreet(); // присвоение случайного имени улицы
    }

    public AtHomes[] getHouses() {
        return houses;
    }

    public void setHouses(AtHomes[] houses) {
        this.houses = houses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Residents[] getHomeComs() {
        return homeComs;
    }

    public void setHomeComs(AtHomes[] atHomes) {
        // Квартальный выбирается из собрания упровляющих домами

        Residents[] housComs = new Residents[0];
        for(int i = 0; i < atHomes.length; i++){
            housComs = Arrays.copyOf(housComs,housComs.length + 1);
            housComs[housComs.length - 1] = atHomes[i].getHousCom();
        }
        this.homeComs = housComs;
    }

    public Residents getQuarterly() {
        return quarterly;
    }

    public void setQuarterly(Residents quarterly) {
        this.quarterly = quarterly;
    }

    private void randomNameStreet(){ // создание случайного имени
        Random ran = new Random();
        String[] names = new String[10];
        names[0] = "Скрябина";
        names[1] = "Бельская";
        names[2] = "Советская";
        names[3] = "Чуйская";
        names[4] = "Манаса";
        names[5] = "Донецкая";
        names[6] = "Логвиненко";
        names[7] = "Темерязева";
        names[8] = "Школьная";
        names[9] = "Алма-Атинская";
        this.name = names[ran.nextInt(names.length)];
    }

    private void randomQuarlety(){
        Random ran = new Random();
        this.quarterly = this.homeComs[ran.nextInt(this.homeComs.length)];
    }

    void speak(){
        System.out.printf("Квартальный: \n%s", quarterly);
    }
    void speakStreetParlament(){ // вывод списка людей входящий в состав совета улицы
        String parlaments = "Совет улицы: \n";
        for (int i = 0 ; i < this.homeComs.length; i++){
            parlaments = parlaments + this.homeComs[i] + "\n";
        }
        System.out.println(parlaments);
    }

    @Override
    public String toString(){
        return String.format("Имя улицы: %s\n" +
                "Количество домов: %s \n" +
                "Упровляющий улицей: \n %s", name, houses.length, quarterly);
    }


}
