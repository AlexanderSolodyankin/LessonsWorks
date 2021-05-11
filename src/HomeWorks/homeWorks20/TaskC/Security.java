package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

 public class Security extends Employee{
    private boolean armed;
    private String gun;

     Security(Employee employee){
        getArmed();
        if(armed){
            Random ran = new Random();
            int num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){
                this.gun = "Дезинтегратор";
            }
            if(num == 2){
                this.gun = "Шокер";
            }
            if(num == 3){
                this.gun = "Пистолет";
            }
            if(num == 4){
                this.gun = "Гранатомет";
            }
            if(num == 5){
                this.gun = "Катана";
            }
        }else this.gun = "Без оружия";
    }

     public boolean isArmed() {
         return armed;
     }

     public String getGun() {
         return gun;
     }

     public boolean getArmed(){
        Random ran = new Random();
        boolean armed = ran.nextBoolean();
         this.armed = armed;
        return this.armed;
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

}
