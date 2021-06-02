package HomeWorks.homeWorks27.TaskA;

 class Ducks extends AbstractObjects  implements Flyinable, Swimanble {
    private String name;

    public Ducks(String name) {
        this.name = name;
    }
     public String getName() {
         return name;
     }
     @Override
     public void fly() {
         System.out.println(name + " Летает");
     }

     @Override
     public void swims() {
         System.out.println(name + " Плавает");
     }
 }
