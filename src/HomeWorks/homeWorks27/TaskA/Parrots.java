package HomeWorks.homeWorks27.TaskA;

 class Parrots extends AbstractObjects  implements Flyinable, Runable{
  private String name;

  public Parrots(String name) {
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
  public void run() {
   System.out.println(name + " Бегает");
  }
 }
