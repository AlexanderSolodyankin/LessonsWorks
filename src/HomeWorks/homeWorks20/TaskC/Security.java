package HomeWorks.homeWorks20.TaskC;

import java.util.Random;

 public class Security extends Employee{
    private boolean armed;
    private String gun;

    public Security(Employee employee){
        getArmed();
        if(armed){
            Random ran = new Random();
            int num = ran.nextInt(5 - 1 + 1) + 1;
            switch (num){
                case 1: this.gun = "Пистолет";
                case 2: this.gun = "Кастет";
                case 3: this.gun = "Дезинтегратор";
                case 4: this.gun = "Сингулярный прожектор";
                case 5: this.gun = "Электро шокер";
                default: this.gun = "Потерял свое оружие";
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
        return ran.nextBoolean();
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
