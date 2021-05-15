package HomeWorks.homeworks22.TaskA;

import Draft.NPSNameOreAge.CheckDateFound;

import java.util.Random;

class TaskA {
    public static void main(String[] args) {
        Random ran = new Random();
        Credit[] credits = new Credit[3];
        for(int i = 0; i< credits.length;i++){
            CheckDateFound date = new CheckDateFound(ran.nextInt(32),
                    ran.nextInt(13), ran.nextInt(2021 - 1900 + 1) + 1900 );

            credits[i] = new Credit(ran.nextInt(301),ran.nextInt(4001),date.toString(),ran.nextInt(15));
            System.out.println("Внесенная сумма кредита: "+credits[i].getSum());
        }

        System.out.println();
        System.out.println("Выдано кредитов: "+Credit.getCreditCount());
        System.out.println("Общая сумма кредитов: "+Credit.getCreditCountSum());
        System.out.println("Среднеарефметическое всех кредитов: "+Credit.getCreditCountSum() / Credit.getCreditCount());
    }

}
