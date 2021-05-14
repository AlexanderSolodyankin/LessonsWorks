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
        String[][] setAddress = new String[4][5];
        setAddress[0][0] = "Киргизия ";
        setAddress[0][1] = "Россия ";
        setAddress[0][2] = "Америка ";
        setAddress[0][3] = "Казахстан ";
        setAddress[0][4] = "Манголия ";
        setAddress[1][0] = "Бишкек ";
        setAddress[1][1] = "Москва ";
        setAddress[1][2] = "Вашенгтон ";
        setAddress[1][3] = "Алма-Ата ";
        setAddress[1][4] = "Улан-Батор ";
        setAddress[2][0] = "Скрябина ";
        setAddress[2][1] = "Зодчего ";
        setAddress[2][2] = "Уолл-Стрит ";
        setAddress[2][3] = "Тергеусизова ";
        setAddress[2][4] = "Урге ";
        setAddress[3][0] = "Дом 56 ";
        setAddress[3][1] = "Дом 109 ";
        setAddress[3][2] = "Дом 32 ";
        setAddress[3][3] = "Дом 44 ";
        setAddress[3][4] = "Дом 78 ";
        this.address = setAddress[0][ran.nextInt(5)] + setAddress[1][ran.nextInt(5)] +
                setAddress[2][ran.nextInt(5)] +setAddress[3][ran.nextInt(5)];
        return address;
    }

}
