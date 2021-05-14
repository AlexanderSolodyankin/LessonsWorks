package HomeWorks.homeWorks20.TaskC;


import java.util.Random;

class Client extends Human {
     private String consytant;
     private String chek;
     private boolean faceControl;

    public Client(String name, String serName, String patronymic, int age, String address, String gender) {
        super(name, serName, patronymic, age, address, gender);
        Random ran = new Random();
        String[][] setSetup = new String[2][3];
        setSetup[0][0] = "Постоянный клиент";
        setSetup[0][1] = "Редкий клиент";
        setSetup[0][2] = "Новый клиент";

        setSetup[1][0] = "Посидел на маленькую сумму";
        setSetup[1][1] = "Посидел на среднию сумму";
        setSetup[1][2] = "Посидел на крупную сумму";
        this.consytant = setSetup[0][ran.nextInt(3)];
        this.chek = setSetup[1][ran.nextInt(3)];
        this.faceControl = ran.nextBoolean();
    }

    public String getConsytant() {
        return consytant;
    }

    public void setConsytant(String consytant) {
        this.consytant = consytant;
    }

    public String getChek() {
        return chek;
    }

    public void setChek(String chek) {
        this.chek = chek;
    }

    public boolean isFaceControl() {
        return faceControl;
    }

    public void setFaceControl(boolean faceControl) {
        this.faceControl = faceControl;
    }
    @Override
    public String toString(){
        return String.format("Имя клиента: %s \n" +
                "Фамилия клиента: %s \n" +
                "Адрес проживания клиента: %s \n" +
                "Возраст клиента: %s \n" +
                "Гендер клиента: %s \n" +
                "Частота посещений: %s \n" +
                "Чек Клиента: %s \n" +
                "ФейсКонтроль: %s\n",getName(),getSerName(),getAddress(),getAge(),
                getGender(),getConsytant(),getChek(),isFaceControl() ? "Пройдет" : "Не пройдет");
    }
}
