package HomeWorks.homeWorks27.TaskA;

 class Sharks implements Swimanble{
     private String name;

     public Sharks(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }
     @Override
     public void swims() {
         System.out.println(name + " Плавает");
     }

}
