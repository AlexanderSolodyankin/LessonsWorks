package Draft;

public class Boy {

    private String name;
    private Gerl[] gerls;


    public Boy(String name, Gerl[] gerls){

        this.name = name;
        this.gerls = gerls;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Имя: %s   и его девушки: %s",  name, getGerls());
    }

    public String getGerls(){
        String g = "";
        for(int i=0;i < gerls.length;i++){
            g = g + gerls[i];
        }
        return g;
    }



}
