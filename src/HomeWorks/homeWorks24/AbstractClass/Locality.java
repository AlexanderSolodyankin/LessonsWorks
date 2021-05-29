package HomeWorks.homeWorks24.AbstractClass;

import java.util.Arrays;
import java.util.Random;

abstract class Locality { // создан абстрактный класс
    // Имеет значения
   private Street[] streets; // Количество улиц
   private Residents lider; // упровляющего населенным пунктом
   private Residents[] advice; // Совет из упровляющих улицами
   private String nameLocality; // Имя населенного пункта

    public Locality(){
        setRandomStreets(); // создание случайного количества улиц
        setRandomSetup(); // вложение параметров Лидера и совета из упровляющих улицами
        randomSetNameLocality(); // случайное имя населенного пункта
    }

    public Street[] getStreets() {
        return streets;
    }

    public void setStreets(Street[] streets) {
        this.streets = streets;
    }

    public Residents getLider() {
        return lider;
    }

    public void setLider(Residents lider) {
        this.lider = lider;
    }

    public Residents[] getAdvice() {
        return advice;
    }

    public void setAdvice(Residents[] advice) {
        this.advice = advice;
    }

    public String getNameLocality() {
        return nameLocality;
    }

    public void setNameLocality(String nameLocality) {
        this.nameLocality = nameLocality;
    }

    private void randomSetNameLocality(){ // создание случайного имени района (Населенного пункта)
        Random ran = new Random();
        String[] names = new String[7];
        names[0] = "Октяборьский";
        names[1] = "Свердловский";
        names[2] = "Лененский";
        names[3] = "Первомайский";
        names[4] = "Московский";
        names[5] = "Лебединовка";
        names[6] = "Сукулукский";
        this.nameLocality = names[ran.nextInt(names.length)];
    }

    private void setRandomSetup(){ // создание совета и выбор упровляющего населеным пунктом
        Random ran = new Random();
         this.advice = new Residents[0];
         for(int i = 0; i < this.streets.length; i++){
             this.advice = Arrays.copyOf(this.advice,advice.length + 1);
             this.advice[this.advice.length - 1] = this.streets[i].getQuarterly();
         }
         this.lider = this.advice[ran.nextInt(this.advice.length)];
    }

    private void setRandomStreets(){ // создание случайного количества улиц а так же ввод значения в улицы
        Random ran = new Random();
        Street[] streets = new Street[ran.nextInt(7 - 2 + 1) + 2];
        for (int j = 0; j < streets.length; j ++) {
            AtHomes[] atHomes = new AtHomes[ran.nextInt(30 - 10 + 1) + 10];
            for (int k = 0; k < atHomes.length; k++) {
                Residents[] mans = new Residents[ran.nextInt(40 - 5 + 1) + 5];
                for (int i = 0; i < mans.length; i++) {
                    mans[i] = new Residents();
                }
                atHomes[k] = new AtHomes(mans);
            }
            streets[j] = new Street(atHomes);
        }
        this.streets = streets;
    }
}
