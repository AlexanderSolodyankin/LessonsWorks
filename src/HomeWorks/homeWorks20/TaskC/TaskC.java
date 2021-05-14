package HomeWorks.homeWorks20.TaskC;


import Draft.NPSNameOreAge.NPSHuman;

import java.util.Arrays;
import java.util.Random;

class TaskC {
    public static void main(String[] args) {
        Random ran = new Random();
        Human[] man = new Human[10];
        for (int i = 0; i<man.length;i++){
            NPSHuman human = new NPSHuman();
            man[i] = new Human(human.getName(), human.getSerName(),
                    human.getPatron(), human.getAge(), human.getAddress(), human.getGender());
        }
        String[] position = new String[3];
        position[0] = "Повар";
        position[1] = "Охрана";
        position[2] = "Официант";

        Employee[] employee = new Employee[man.length];
        for (int i = 0; i < employee.length;i++){
            employee[i] = new Employee(man[i].getName(),man[i].getSerName(),man[i].getPatronymic(),
                    man[i].getAge(),man[i].getAddress(),man[i].getGender(), position[ran.nextInt(3)],
                    ran.nextInt(90001));
        }

        Security[] securiti = new Security[0];
        Cooks[] cooks = new Cooks[0];
        Waiter[] waiters = new Waiter[0];
        for(int i =0; i < employee.length;i++){
            if(employee[i].getPosition().equals("Охрана")){
                securiti = Arrays.copyOf(securiti,securiti.length + 1);
                securiti[securiti.length - 1] = new Security(employee[i].getName(),employee[i].getSerName()
                        ,employee[i].getPatronymic(), employee[i].getAge(), employee[i].getAddress(),
                        employee[i].getGender(),employee[i].getPosition(),employee[i].getSalary());
            }
            if(employee[i].position.equals("Повар")){
                cooks=Arrays.copyOf(cooks,cooks.length + 1);
                cooks[cooks.length - 1] = new Cooks(employee[i].getName(),employee[i].getSerName()
                        ,employee[i].getPatronymic(), employee[i].getAge(), employee[i].getAddress(),
                        employee[i].getGender(),employee[i].getPosition(),employee[i].getSalary());
            }
            if(employee[i].position.equals("Официант")){
                waiters = Arrays.copyOf(waiters,waiters.length +1);
                waiters[waiters.length - 1] = new Waiter(employee[i].getName(),employee[i].getSerName()
                        ,employee[i].getPatronymic(), employee[i].getAge(), employee[i].getAddress(),
                        employee[i].getGender(),employee[i].getPosition(),employee[i].getSalary());
            }
        }
        System.out.println(securiti[0]);
        System.out.println();
        System.out.println(cooks[0]);
        System.out.println();
        System.out.println(waiters[0]);



    }

     int getNum(){
        Random ran = new Random();
        int num = ran.nextInt(90001);
        return num;
    }
   public String getPosition(){
        Random ran = new Random();
        String[] position = new String[3];
        position[0] = "Повар";
        position[1] = "Охрана";
        position[2] = "Официант";
        return position[ran.nextInt(3)];

    }



}
