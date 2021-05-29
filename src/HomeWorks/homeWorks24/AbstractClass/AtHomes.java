package HomeWorks.homeWorks24.AbstractClass;

import java.util.Random;

 class AtHomes { //  класс дом
    //имеет значения
    private Residents[] mans; // Жители которые в нем живут
    private static int countNumber; // Номер самого дома
    private Residents housCom; // Домком который упровляет данным домом
    private int housNumber;

    public AtHomes(Residents[] mans){
        Random ran = new Random();
        countNumber++;
        this.mans = mans; // заселяем жителей в дом
        this.housNumber = countNumber; // присвоение номера дому
        this.housCom = mans[ran.nextInt(mans.length)]; // метод который случайным образом выбирает упровляющего домом
    }

    public Residents[] getMans() {
        return mans;
    }

    public void setMans(Residents[] mans) {
        this.mans = mans;
    }

    public int getHousNumber() {
        return housNumber;
    }

    public void setHousNumber(int housNumber) {
        this.housNumber = housNumber;
    }

    public Residents getHousCom() {
        return housCom;
    }

    public void setHousCom(Residents housCom) {
        this.housCom = housCom;
    }


     public static int getCountNumber() {
         return countNumber;
     }

     public void speak(){
        System.out.printf("Упровляющий домом: под номером: %s \n %s",housNumber, housCom);
    }

    @Override
    public String toString(){
        return String.format("Номер Дома: %s \n" +
                "Количество жителей в доме: %s\n" +
                "Упровляющий домом: \n %s",housNumber, mans.length, housCom);
    }


}
