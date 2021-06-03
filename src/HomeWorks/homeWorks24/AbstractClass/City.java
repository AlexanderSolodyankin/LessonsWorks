package HomeWorks.homeWorks24.AbstractClass;

import java.util.Arrays;
import java.util.Random;

 class City { // Клас город
    // в себе имеет значения
    private UrbanAreas[] urbanAreas; // масив из районов
    private Residents[] parlament; // парламент состоящий из лидеров районов
    private Residents mayorOfCity; // Мэр города
    private String name; // имя города

    public City(){
        randomSetParametrInCity();
    } // задаю значения

    //---------------------------------------------------------------------------------------------------------

    public UrbanAreas[] getUrbanAreas() {
        return urbanAreas;
    }

    public void setUrbanAreas(UrbanAreas[] urbanAreas) {
        this.urbanAreas = urbanAreas;
    }

    public Residents[] getParlament() {
        return parlament;
    }

    public void setParlament(Residents[] parlament) {
        this.parlament = parlament;
    }

    public Residents getMayorOfCity() {
        return mayorOfCity;
    }

    public void setMayorOfCity(Residents mayorOfCity) {
        this.mayorOfCity = mayorOfCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //---------------------------------------------------------------------------------------------------------


    public void speak(){
        System.out.printf("Город: %s\n" +
                "Мэр города: \n %s\n" +
                "Количество раонов: %s\n\n" +
                "Участники парламента: \n %s", name, mayorOfCity, urbanAreas.length, outParlament());
    }

    private String outParlament(){ // вывод списка парламента
        String outParlament = "";
        for (Residents parlamentsAllMans: this.parlament){
            outParlament = outParlament + parlamentsAllMans + "\n";
        }
        return  outParlament;
    }
    private void randomSetParametrInCity(){ // Задаю случайные значения городу
        Random ran = new Random();
        // случайное количество районов
        UrbanAreas[] urbanAreas = new UrbanAreas[ran.nextInt(7 - 4 + 1) + 4];
        for( int i = 0; i < urbanAreas.length; i++){
            urbanAreas[i] = new UrbanAreas(); // создаются районы
        }
        this.urbanAreas = urbanAreas; // присвоение районов к обьекту
        Residents[] parlament = new Residents[0]; // создаю масив для парламента
        for (int i =0; i < this.urbanAreas.length; i++){
            // Вношу каждого человека из лидеров района для избрания мэра города
            // путем добавления ячейки в массив
            parlament = Arrays.copyOf(parlament,parlament.length + 1);
            parlament[parlament.length -1] = this.urbanAreas[i].getLider();
        }
        this.parlament = parlament; // Присваеваю новый масив к обьекту из нейзвестного количества людей
        this.mayorOfCity = this.parlament[ran.nextInt(parlament.length)]; // выбор Мэра города путем генерации случайностей

        String[] cityNames = new String[5];
        cityNames[0] = "Бишкек";
        cityNames[1] = "Москва";
        cityNames[2] = "Алма-Ата";
        cityNames[3] = "Челябинск";
        cityNames[4] = "Питер-Бург";
        this.name = cityNames[ran.nextInt(cityNames.length)]; // Случайное имя города
    }
}
