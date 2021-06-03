package HomeWorks.homeWorks27.TaskA;

 class Human implements  Swimanble, Runable {
     private String name;

     public Human(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }
     @Override
     public void run() {
         System.out.println(name + " Бегает");
     }
     @Override
     public void swims() {
         System.out.println(name + " Плавает");
     }

 }
