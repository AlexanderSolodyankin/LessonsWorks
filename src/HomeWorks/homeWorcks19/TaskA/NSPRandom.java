package HomeWorks.homeWorcks19.TaskA;

import java.util.Random;

public class NSPRandom {
    private String name;
    private String serName;
    private String patron;
    private String gender;

    public NSPRandom(){
        Random  ran = new Random();
        int num;
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){name = "Александр"; break;}
            if(num == 2){name = "Юля"; break;}
            if(num == 3){name = "Серега"; break;}
            if(num == 4){name = "Маша"; break;}
            if(num == 5){name = "Ксюша"; break;}
        }
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){serName = "Паниклов"; break;}
            if(num == 2){serName = "Криваручка"; break;}
            if(num == 3){serName = "Кульков"; break;}
            if(num == 4){serName = "Сергулина"; break;}
            if(num == 5){serName = "Либеда"; break;}
        }
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){patron = "Александрович"; break;}
            if(num == 2){patron = "Владимирович"; break;}
            if(num == 3){patron = "Петров"; break;}
            if(num == 4){patron = "Георгевич"; break;}
            if(num == 5){patron = "Генадиевич"; break;}
        }

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
