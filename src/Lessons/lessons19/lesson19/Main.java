package Lessons.lessons19.lesson19;

public class Main {
    public static void main(String[] args) {
       Bread bread = new Bread();
       bread.setWeight(555);
       bread.setPricd(100);
       bread.setProducerCompany("HBK");
       bread.bake();
       bread.pack();

       Lepeshka lepeshka = new Lepeshka(300.0, 10);
       lepeshka.setPricd(150);
       if (lepeshka.getWeight() == 0) {
           System.out.println("Lepeshka netu");
       }
       lepeshka.bake();
       lepeshka.pack();
       lepeshka.wrawPrints();
       lepeshka.varnish();


        System.out.println();
        System.out.println();
        System.out.println(bread.getPricd());
        System.out.println(lepeshka.getPricd());

    }
}
