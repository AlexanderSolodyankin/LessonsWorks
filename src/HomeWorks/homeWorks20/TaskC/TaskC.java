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

        Client[] client = new Client[5];
        for(int i = 0; i < cooks.length ; i++){
            NPSHuman mansClients = new NPSHuman();
            client[i] = new Client(mansClients.getName(),mansClients.getSerName(),mansClients.getPatron(),
                    mansClients.getAge(), mansClients.getAddress(), mansClients.getGender());
        }

        System.err.println("Созданные рандомные люди!!!");
        for (Human manHuman: man) {
            System.out.println(manHuman);
        }

//        System.err.println("Людям дана специальность"); // почему данная строчка выводится после нижнего фориджа?!!!

        System.out.println("Специальности людей");
        System.out.println("-------------------------------------------------------------------------------------------");

        for (Employee emplHums: employee) {
            System.out.println(emplHums);
        }

        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Поваров: " + cooks.length);
        for (Cooks cookHumans: cooks) {
            System.out.println(cookHumans);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Официантов: " + waiters.length);
        for (Waiter waiterHumens: waiters) {
            System.out.println(waiterHumens);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(("Охранаников: " + securiti.length));
        for (Security secrHumens: securiti) {
            System.out.println(secrHumens);
            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("Клиентов: " + client.length);
        for(int i = 0; i < client.length;i++){
            System.out.println(client[i]);
            if(client[i].isFaceControl()){
                System.out.println(securiti[ran.nextInt(securiti.length)] + " Пропустил " + client[i].getName() + " " +
                        client[i].getSerName());
            }else System.err.println(securiti[ran.nextInt(securiti.length)] + " Выгнал " + client[i].getName() + " "+
                    client[i].getSerName());
        }

    }





}
