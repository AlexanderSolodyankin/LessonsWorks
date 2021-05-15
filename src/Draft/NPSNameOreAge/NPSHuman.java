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

        String[][][] humans = new String[2][3][5];

        humans[0][0][0] = "Маша";  humans[0][1][0] = "Сергулина";  humans[0][2][0] = "Владимировна";
        humans[0][0][1] = "Дарья"; humans[0][1][1] = "Губанова";   humans[0][2][1] = "Александровна";
        humans[0][0][2] = "Юля";   humans[0][1][2] = "Гричкова";   humans[0][2][2] = "Грегорьевна";
        humans[0][0][3] = "Ксенья";humans[0][1][3] = "Зельвитская";humans[0][2][3] = "Сергеевна";
        humans[0][0][4] = "Лариса";humans[0][1][4] = "Харингтон";  humans[0][2][4] = "Владимировна";

        humans[1][0][0] = "Александр";  humans[1][1][0] = "Сергулин";  humans[1][2][0] = "Владимирович";
        humans[1][0][1] = "Владимир"; humans[1][1][1] = "Губанов";   humans[1][2][1] = "Александрович";
        humans[1][0][2] = "Сергей";   humans[1][1][2] = "Гричков";   humans[1][2][2] = "Грегорьевич";
        humans[1][0][3] = "Дмитрий";humans[1][1][3] = "Зельвитский";humans[1][2][3] = "Сергеевич";
        humans[1][0][4] = "Алексей";humans[1][1][4] = "Харингтон";  humans[1][2][4] = "Владимирович";
        this.genMan = ran.nextBoolean();
        if(genMan){
            this.gender = "Женский";
            this.name    = humans[0][0][ran.nextInt(5)];
            this.serName = humans[0][1][ran.nextInt(5)];
            this.patron  = humans[0][2][ran.nextInt(5)];
        }else {
            this.gender = "Мужской";
            this.name    = humans[1][0][ran.nextInt(5)];
            this.serName = humans[1][1][ran.nextInt(5)];
            this.patron  = humans[1][2][ran.nextInt(5)];
        }
        this.age = ran.nextInt(101);
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
