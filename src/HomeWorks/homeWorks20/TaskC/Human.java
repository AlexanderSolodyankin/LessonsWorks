package HomeWorks.homeWorks20.TaskC;


import Draft.NPSNameOreAge.NPSHuman;

public class Human {
     protected String name;
     protected String serName;
     protected String patronymic;
     protected int age;
     protected String address;
     protected String gender;

     public Human(){
          NPSHuman  human = new NPSHuman();
          this.name = human.getName();
          this.serName = human.getSerName();
          this.patronymic = human.getPatron();
          this.age = human.getAge();
          this.address = human.getAddress();
          this.gender = human.getGender();
     }


     public String getName() {
          return name;
     }

     public String getSerName() {
          return serName;
     }

     public String getPatronymic() {
          return patronymic;
     }

     public int getAge() {
          return age;
     }

     public String getAddress() {
          return address;
     }

     public String getGender() {
          return gender;
     }

     @Override
     public String toString(){
          return String.format("Имя: %s\n" +
                  "Фамилия: %s \n" +
                  "Отчество: %s\n" +
                  "Возраст: %s\n" +
                  "Адрес проживания: %s \n" +
                  "Гендерный признак: %s\n", name, serName, patronymic, age, address, gender );
     }
}
