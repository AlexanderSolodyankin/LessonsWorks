package HomeWorks.homeWorks27.TaskA;

 class Cats implements Runable {
    private String name;

    public Cats(String name) {
        this.name = name;
    }

     public String getName() {
         return name;
     }

     @Override
     public void run() {
         System.out.println(name + " Бегает");
     }
 }
