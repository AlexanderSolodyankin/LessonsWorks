package HomeWorks.homeWorks27.TaskA;

 class Plane implements Flyinable{
     private String name;

     public Plane(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }
     @Override
     public void fly() {
         System.out.println(name + " Летает");
     }
}
