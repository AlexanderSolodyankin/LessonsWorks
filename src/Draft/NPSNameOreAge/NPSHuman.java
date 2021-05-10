package Draft.NPSNameOreAge;

import java.util.Random;

public class NPSHuman {
    private String name;
    private String serName;
    private String patron;
    private String gender;

    public NPSHuman(){
        Random ran = new Random();
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

        // Генерация гендерного признака что бы женские имена выдовала женщин и на оборот
        // ( Сделано через жопу и на чистом интузиазме)
        if(this.name.equals("Юля") || this.name.equals("Маша") || this.name.equals("Ксюша")){
            gender = "Женский";
        }
        else {
            gender = "Мужской";
        }

        //случайная генерация фамилии
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){
                if(this.gender.equals(true)){
                    this.serName = "Паниклова";
                }else this.serName = "Паниклов";
                break;
            }
            if(num == 2){
                if(this.gender.equals(true)){
                    this.serName = "Криваручка";
                }else this.serName = "Криваручка";
                break;
            }
            if(num == 3){
                if(this.gender.equals(true)){
                    this.serName = "Кулькова";
                }else this.serName = "Кульков"; break;
            }
            if(num == 4){
                if(this.gender.equals(true)){
                    this.serName = "Сергулина";
                }else this.serName = "Сергулин"; break;
            }
            if(num == 1){
                if(this.gender.equals(true)){
                    this.serName = "Зельвитская";
                }else this.serName = "Зельвитский"; break;
            }
        }
        // Случайноя генерация отчества ( но я его так и не использовал)
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){
                if(this.gender.equals(true)){
                    patron = "Александровна";
                }else patron = "Александровичь";
                break;
            }
            if(num == 2){
                if(this.gender.equals(true)){
                    patron = "Владимировна";
                }else patron = "Владимирович";
                break;
            }
            if(num == 3){
                if(this.gender.equals(true)){
                    patron = "Петровна";
                }else patron = "Петрович";
                break;
            }
            if(num == 4){
                if(this.gender.equals(true)){
                    patron = "Грегорьевна";
                }else patron = "Грегорьевич";
                break;
            }
            if(num == 5){
                if(this.gender.equals(true)){
                    patron = "Андреевна";
                }else patron = "Андреевичь";
                break;
            }
        }


    }
    public String getGender(){return gender;}

    public String getName() {return name;}

    public String getSerName() {return serName;}

    public String getPatron() {return patron;}
}
