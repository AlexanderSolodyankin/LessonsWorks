package HomeWorks.homeWorks20.TaskA.helpers;

import java.util.Random;

// Клас созданый для случайной генерации имен и фамилий
// а так же и гендерного признака чтобы было проще вносить даные в студентов
public class NSPRandom {
    private String name;
    private String serName;
    private String patron;
    private String gender;

    public NSPRandom(){
        Random  ran = new Random();
        int num;
        // Случайная генерация имени ( точнее перетасовка)
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){name = "Александр"; break;}
            if(num == 2){name = "Юля"; break;}
            if(num == 3){name = "Серега"; break;}
            if(num == 4){name = "Маша"; break;}
            if(num == 5){name = "Ксюша"; break;}
        }
        //случайная генерация фамилии
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){serName = "Паниклов"; break;}
            if(num == 2){serName = "Криваручка"; break;}
            if(num == 3){serName = "Кульков"; break;}
            if(num == 4){serName = "Сергулина"; break;}
            if(num == 5){serName = "Либеда"; break;}
        }
        // Случайноя генерация отчества ( но я его так и не использовал)
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){patron = "Александрович"; break;}
            if(num == 2){patron = "Владимирович"; break;}
            if(num == 3){patron = "Петров"; break;}
            if(num == 4){patron = "Георгевич"; break;}
            if(num == 5){patron = "Генадиевич"; break;}
        }

        // Генерация гендерного признака что бы женские имена выдовала женщин и на оборот
        // ( Сделано через жопу и на чистом интузиазме)
        if(this.name.equals("Юля") || this.name.equals("Маша") || this.name.equals("Ксюша")){
            gender = "Женский";
        }
        else {
            gender = "Мужской";
        }
    }
    public String getGender(){return gender;}

    public String getName() {return name;}

   public String getSerName() {return serName;}

    public String getPatron() {return patron;}



}
