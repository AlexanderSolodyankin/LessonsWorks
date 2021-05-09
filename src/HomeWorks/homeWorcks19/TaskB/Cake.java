package HomeWorks.homeWorcks19.TaskB;

public class Cake extends Bread{
    private int radius;

    public Cake(){}

    public Cake(int weight){
        if(weight > 300){
            setWeight(weight);
        }
    }

    public Cake(int weight, int price, String product, int radius){
        super(weight, price,product);
        this.radius=radius;
    }


    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String toString(){
        return String.format("Хлеб: Лепешка\n" +
                "Радиус: %s \n" +
                "Весс: %s \n" +
                "Цена: %s\n" +
                "Производитель: %s\n", radius, weight, price, productMode );
    }
        void varnished(){
            System.out.println("Лакированная.");
        }
        void patt(){
            System.out.println("имеет узоры");
        }
        void counterfeit(){
            System.out.println("Лепешка подделка");
        }
        void sout(){
            System.out.printf("Хлеб: Лепешка\n" +
                    "Радиус: %s \n" +
                    "Весс: %s \n" +
                    "Цена: %s\n" +
                    "Производитель: %s\n", radius, weight, price, productMode );
        }



}



