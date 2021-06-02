package HomeWorks.homeWorks26.TaskB;

 class Merchant extends AbstractEmployee{


    public Merchant(String name, int age, int wage, int experience) {
        super(name, age, wage, experience);
    }

    @Override
    public String toString(){
        return String.format("Камерсант:  %s",super.toString());
    }


     @Override
     public void actions() {
         System.out.println("Договаривается о выгоде");
     }
 }
