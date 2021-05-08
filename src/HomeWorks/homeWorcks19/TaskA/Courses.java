package HomeWorks.homeWorcks19.TaskA;

// Создан класс "ГРУППА"
public class Courses {

     // Параметры Класса
     private String nameCours;
     private int idCours;
     private String nameDekan;
     private String serNameDecan;
     private String patronDecan;
     private DateFound dateFound;

     // Конструктор класса Примечание что он принимает параметры другого класса для того чтобы задать дату основания группы
     public Courses(String nameCours, int idCours, String nameDekan, String serNameDecan,
                    String patronDecan, DateFound dateFound) {

          this.nameCours = nameCours;
          this.idCours = idCours;
          this.nameDekan = nameDekan;
          this.serNameDecan = serNameDecan;
          this.patronDecan = patronDecan;
          this.dateFound = dateFound;
     }


     public String getNameCours() {
          return nameCours;
     }

     public void setNameCours(String nameCours) {
          this.nameCours = nameCours;
     }

     public int getIdCours() {
          return idCours;
     }

     public void setIdCours(int idCours) {
          this.idCours = idCours;
     }

     public String getNameDekan() {
          return nameDekan;
     }

     public void setNameDekan(String nameDekan) {
          this.nameDekan = nameDekan;
     }

     public String getSerNameDecan() {
          return serNameDecan;
     }

     public void setSerNameDecan(String serNameDecan) {
          this.serNameDecan = serNameDecan;
     }

     public String getPatronDecan() {
          return patronDecan;
     }

     public void setPatronDecan(String patronDecan) {
          this.patronDecan = patronDecan;
     }


     public DateFound getDateFound() {
          return dateFound;
     }

     public void setDateFound(DateFound dateFound) {
          this.dateFound = dateFound;
     }

     // Конвертация в стринг все даные входящие в данный класс
     @Override
     public String toString(){
          return String.format("Название кураса: %s \n" +
                          "ID курса: %s \n" +
                          "Преподователь: %s. %s. %s. \n" +
                          "Дата основания курса: %s\n", nameCours, idCours, nameDekan, serNameDecan, patronDecan,
                  dateFound);
     }
}
