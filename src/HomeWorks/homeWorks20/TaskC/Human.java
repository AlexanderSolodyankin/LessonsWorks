package HomeWorks.homeWorks20.TaskC;


import Draft.NPSNameOreAge.NPSHuman; // Клас для генерации случайных людей с возростом и гендерным признаком адресом


public class Human {
     private String name;
     private String serName;
     private String patronymic;
     private int age;
     private String address;
     private String gender;

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

     public void setName(String name) {
          this.name = name;
     }

     public String getSerName() {
          return serName;
     }

     public void setSerName(String serName) {
          this.serName = serName;
     }

     public String getPatronymic() {
          return patronymic;
     }

     public void setPatronymic(String patronymic) {
          this.patronymic = patronymic;
     }

     public int getAge() {
          return age;
     }

     public void setAge(int age) {
          this.age = age;
     }

     public String getAddress() {
          return address;
     }

     public void setAddress(String address) {
          this.address = address;
     }

     public String getGender() {
          return gender;
     }

     public void setGender(String gender) {
          this.gender = gender;
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
