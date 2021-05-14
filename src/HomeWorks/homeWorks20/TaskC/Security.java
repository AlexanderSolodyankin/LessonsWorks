package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

  class Security extends Employee{
    private boolean armed;
    private String gun;

      public Security(String name, String serName, String patronymic,
                      int age, String address, String gender, String position, int salary) {
          super(name, serName, patronymic, age, address, gender, position, salary);
         this.armed = getRandomArmed();
          if (this.armed){
              getGunSecurity();
          }else this.gun = "Без оружия";

      }

      public boolean getArmed() {
         return armed;
     }

     public String getGun() {
         return gun;
     }


    @Override
     public String toString(){
       String outSecurety = String.format("Охраник: %s, %s \n" +
               "Вооружение: %s",getName(), getPatronymic(), getGun());
       return  outSecurety;
    }
    void  kick(){
        String getFace = "";
           getFace = getFace + "Выгнал клиента";
        System.err.println(getFace);
    }
      void  getGunSecurity() {
          Random ran = new Random();
          String[] gun = new String[5];
          gun[0] = "Писталет";
          gun[1] = "Кастет";
          gun[2] = "Электрошокер";
          gun[3] = "Плазмоган";
          gun[4] = "Потерял оружие";

          this.gun = gun[ran.nextInt(5)];
      }
      private boolean getRandomArmed(){
          Random ran = new Random();
          boolean armed = ran.nextBoolean();
          this.armed = armed;
          return this.armed;
      }


  }
