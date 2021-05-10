package Draft.NPSNameOreAge;

import java.util.Random;

public class NPSHuman {
    private String name;
    private String serName;
    private String patron;
    private String gender;
    private int age;
    private String address;
    private boolean genMan;


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
            this.gender = "Женский";
            this.genMan = true;
        }
        else {
            this.gender = "Мужской";
            this.genMan = false;
        }

        //случайная генерация фамилии
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){
                if(genMan){
                    this.serName = "Паниклова";
                }else this.serName = "Паниклов";
                break;
            }
            if(num == 2){
                if(genMan){
                    this.serName = "Криваручка";
                }else this.serName = "Криваручка";
                break;
            }
            if(num == 3){
                if(genMan){
                    this.serName = "Кулькова";
                }else this.serName = "Кульков"; break;
            }
            if(num == 4){
                if(genMan){
                    this.serName = "Сергулина";
                }else this.serName = "Сергулин";
                break;
            }
            if(num == 1){
                if(genMan){
                    this.serName = "Зельвитская";
                }else this.serName = "Зельвитский"; break;
            }
        }
        // Случайноя генерация отчества ( но я его так и не использовал)
        while (true){
            num = ran.nextInt(5 - 1 + 1) + 1;
            if(num == 1){
                if(genMan){
                    patron = "Александровна";
                }else patron = "Александровичь";
                break;
            }
            if(num == 2){
                if(genMan){
                    patron = "Владимировна";
                }else patron = "Владимирович";
                break;
            }
            if(num == 3){
                if(genMan){
                    patron = "Петровна";
                }else patron = "Петрович";
                break;
            }
            if(num == 4){
                if(genMan){
                    patron = "Грегорьевна";
                }else patron = "Грегорьевич";
                break;
            }
            if(num == 5){
                if(genMan){
                    patron = "Андреевна";
                }else patron = "Андреевичь";
                break;
            }
        }

        while(true){
            num = ran.nextInt(90 - 15 + 1) + 15;
            if(num > 0){
                this.age = num;
                break;
            }
        }

        getAddress();



    }
    public String getGender(){return gender;}

    public String getName() {return name;}

    public String getSerName() {return serName;}

    public String getPatron() {return patron;}

    public int getAge() {return age;}

    public String getAddress() {
        Random ran= new Random();
        int num = 0;
        String add = "";
        for(int i = 0; i <= 3; i++){
            if(i == 0){
                num = ran.nextInt(5-1+1)+1;
                if(num == 1){
                    add = add + "Киргизия ";
                }
                if(num == 2){
                    add = add + "Россия ";
                }
                if(num == 3){
                    add = add + "Америка ";
                }
                if(num == 4){
                    add = add + "Казахстан ";
                }
                if(num == 5){
                    add = add + "Манголия ";
                }
                if(num < 0 || num > 5){
                    getAddress();
                }
            }
            if(i == 1){
                num = ran.nextInt(5-1+1)+1;
                if(num == 1){
                    add = add + "Бишкек ";
                }
                if(num == 2){
                    add = add + "Москва ";
                }
                if(num == 3){
                    add = add + "Вашенгтон ";
                }
                if(num == 4){
                    add = add + "Алма-Ата ";
                }
                if(num == 5){
                    add = add + "Улан-Батор ";
                }
                if(num < 0 || num > 5){
                    getAddress();
                }
            }
            if(i == 2){
                num = ran.nextInt(5-1+1)+1;
                if(num == 1){
                    add = add + "Скрябина ";
                }
                if(num == 2){
                    add = add + "Зодчего ";
                }
                if(num == 3){
                    add = add + "Уолл-Стрит ";
                }
                if(num == 4){
                    add = add + "Тергеусизова ";
                }
                if(num == 5){
                    add = add + "Урге ";
                }
                if(num < 0 || num > 5){
                    getAddress();
                }
            }
            if(i == 3){
                num = ran.nextInt(5-1+1)+1;
                if(num == 1){
                    add = add + "Дом 56 ";
                }
                if(num == 2){
                    add = add + "Дом 109 ";
                }
                if(num == 3){
                    add = add + "Дом 32 ";
                }
                if(num == 4){
                    add = add + "Дом 44 ";
                }
                if(num == 5){
                    add = add + "Дом 78 ";
                }
                if(num < 0 || num > 5){
                    getAddress();
                }
            }
        }
        this.address = add;
        return address;
    }

}
