package HomeWorks.homeWorks24.AbstractClass;

import java.util.Random;

 class Residents {
    private String name;
    private String serName;
    private String patron;
    private String gender;
    private int age;
    private boolean genMan;

    public Residents() {
        randomNPS();
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSerName() {
        return serName;
    }

    public String getPatron() {
        return patron;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSerName(String serName) {
        this.serName = serName;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGenMan() {
        return genMan;
    }

    public void setGenMan(boolean genMan) {
        this.genMan = genMan;
    }

    @Override
    public String toString() {
        return String.format("Имя:                %s\n" +
                        "Фмилия:             %s\n" +
                        "Отчество:           %s\n" +
                        "Гендерный признак:  %s\n" +
                        "Возраст:            %s\n",
                name, serName, patron, gender, age);
    }

    public void randomNPS() {
        Random ran = new Random();

        String[][][] humans = new String[2][3][5];

        humans[0][0][0] = "Маша";          humans[0][1][0] = "Сергулина";          humans[0][2][0] = "Владимировна";
        humans[0][0][1] = "Дарья";         humans[0][1][1] = "Губанова";           humans[0][2][1] = "Александровна";
        humans[0][0][2] = "Юля";           humans[0][1][2] = "Гричкова";           humans[0][2][2] = "Грегорьевна";
        humans[0][0][3] = "Ксенья";        humans[0][1][3] = "Зельвитская";        humans[0][2][3] = "Сергеевна";
        humans[0][0][4] = "Лариса";        humans[0][1][4] = "Харингтон";          humans[0][2][4] = "Владимировна";

        humans[1][0][0] = "Александр";        humans[1][1][0] = "Сергулин";           humans[1][2][0] = "Владимирович";
        humans[1][0][1] = "Владимир";         humans[1][1][1] = "Губанов";            humans[1][2][1] = "Александрович";
        humans[1][0][2] = "Сергей";           humans[1][1][2] = "Гричков";            humans[1][2][2] = "Грегорьевич";
        humans[1][0][3] = "Дмитрий";          humans[1][1][3] = "Зельвитский";        humans[1][2][3] = "Сергеевич";
        humans[1][0][4] = "Алексей";          humans[1][1][4] = "Харингтон";          humans[1][2][4] = "Владимирович";

        this.genMan = ran.nextBoolean();

        if (genMan) {
            this.gender = "Женский";
            this.name =      humans[0][0][ran.nextInt(5)];
            this.serName =   humans[0][1][ran.nextInt(5)];
            this.patron =    humans[0][2][ran.nextInt(5)];
        } else {
            this.gender = "Мужской";
            this.name =     humans[1][0][ran.nextInt(5)];
            this.serName =  humans[1][1][ran.nextInt(5)];
            this.patron =   humans[1][2][ran.nextInt(5)];
        }
        this.age = ran.nextInt(80 - 16 + 1) + 16;

    }
}
