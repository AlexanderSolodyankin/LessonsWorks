package HomeWorks.homeworks24.AbstractClass;

public class Village extends Locality{
    // создано село которое наследует параметры из населенного пункта


    void speak(){ // вывод информации о селе
        System.out.printf("Село: %s\n" +
                "Упровляющий селом: \n%s" +
                "Количество улиц: %s\n \n" +
                "Состав сельского совета: \n \n %s",
                getNameLocality(), getLider(),getStreets().length, getVillageCouncil());
    }
    private String getVillageCouncil(){ // вывод информации о состави сельсовета
        String villCounc = "";
        for (Residents villMans: getAdvice()){
            villCounc = villCounc + villMans + "\n";
        }
        return villCounc;
    }
    @Override
    public String toString(){
        return String.format("Село: %s\n" +
                "Упровляющий селом:  %s %s \n" +
                "Количество улиц в селе: %s \n ",
                getNameLocality(), getLider().getName(), getLider().getSerName(), getStreets().length);
    }

}
