package HomeWorks.homeworcks18;

public class Farm {
    private String contry;
    private String sity;
    private String street;
    private String house;

    Cows[] cow;
    Sheep[] sheeps;
    Horse[] hors;

    private String nameMan;
    private String serNameMan;
    private String patronMan;

    public Farm(String contry, String sity, String street, String house, Cows[] cow,
     Sheep[] sheeps, Horse[] hors, String nameMan, String serNameMan, String patronMan) {

        this.contry = contry;
        this.sity = sity;
        this.street = street;
        this.house = house;
        this.cow = cow;
        this.sheeps = sheeps;
        this.hors = hors;
        this.nameMan = nameMan;
        this.serNameMan = serNameMan;
        this.patronMan = patronMan;
    }


    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getSity() {
        return sity;
    }

    public void setSity(String sity) {
        this.sity = sity;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getNameMan() {
        return nameMan;
    }

    public void setNameMan(String nameMan) {
        this.nameMan = nameMan;
    }

    public String getSerNameMan() {
        return serNameMan;
    }

    public void setSerNameMan(String serNameMan) {
        this.serNameMan = serNameMan;
    }

    public String getPatronMan() {
        return patronMan;
    }

    public void setPatronMan(String patronMan) {
        this.patronMan = patronMan;
    }

    @Override
    public String toString(){
        return String.format( "\nФерма %s " +
                             "\nАдрес фермы: %s, %s, %s, %s\n" +
                             "\nКоровы: %s \n %s \n" +
                             "\nОвцы: %s \n %s \n" +
                             "\nКоней: %s \n %s \n" +
                             "Владелец: %s, %s, %s", nameMan, contry, sity, street, house, cow.length, getCows(),
                                sheeps.length, getSneeps(), hors.length, getHors(), nameMan, serNameMan, patronMan);
    }

    public String getCows(){
        String cows = "";
        for (Cows item : cow){
            cows = cows + " " + item;
        }
        return cows;
    }
    public String getSneeps(){
        String sneep = "";
        for (Sheep item : sheeps){
            sneep = sneep + " " + item;
        }
        return sneep;
    }
    public String getHors(){
        String horse = "";
        for (Horse item : hors){
            horse = horse + " " + item;
        }
        return horse;
    }
}
