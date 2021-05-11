package Lessons.lessons21;

import java.awt.desktop.UserSessionEvent;

class Money {
    private double money;
     private String varMoney;
    private boolean target;

     public Money(){}
     public Money(int money, String varMoney, boolean target) {
         setMoney(money);
         setVarMoney(varMoney);
         this.money = getMoney();
         this.varMoney = getVarMoney();
         this.target = target;
     }

     public double getMoney() {
         return money;
     }

     public void setMoney(int money) {
         this.money = money;
     }

     public String getVarMoney() {
         return varMoney;
     }


     public void setVarMoney(String varMoney) {
         if(varMoney.equals("USD")||varMoney.equals("EUR") || varMoney.equals("SOM")) {this.varMoney = varMoney;}
         else System.err.println("Вы неправельно ввели вылюту");
     }
    public boolean isTarget() {
        return target;
    }

    public void setTarget(boolean target) {
        this.target = target;
    }
    @Override
    public String toString(){
         return String.format("Сумма: %s\n" +
                 "Валюта: %s\n" +
                 "Продажа: %s",money, varMoney,target);
    }


}
