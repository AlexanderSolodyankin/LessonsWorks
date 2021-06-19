package Lessons.lessons33;

public class NootBook {
    private String name;
    private double cena;
    private boolean skidka;

    public NootBook(String name, double cena, boolean skidka) {
        this.name = name;
        this.skidka = skidka;
        if(skidka){
            this.cena = cena - ( cena / 5);
        }else {
            this.cena = cena;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public boolean isSkidka() {
        return skidka;
    }

    public void setSkidka(boolean skidka) {
        this.skidka = skidka;
    }

    @Override
    public String toString() {
        return String.format("Фирма% %s \n" +
                "Цена: %s\n" +
                "Скидака: %s", name, cena, skidka? "Имеется" : "Не имеет скидку");
    }
}
