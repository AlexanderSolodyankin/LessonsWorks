package HomeWorks.homeWorcks19.TaskA;

// Создан класс студент
public class Students {
    private String nameStudents;
    private String serNameStudents;
    private String genderStudents;
    private  int ageStudent;
    private DateFound dateStudents;

    // Конструктор класса
    public Students(String nameStudents, String serNameStudents, String genderStudents,
                    DateFound dateStudents) {

        this.nameStudents = nameStudents;
        this.serNameStudents = serNameStudents;
        this.genderStudents = genderStudents;

        // Вычисление возроста по отношении к 2021 году
        this.ageStudent = 2021 - dateStudents.getYears();
        this.dateStudents = dateStudents;
    }

    public String getNameStudents() {
        return nameStudents;
    }

    public void setNameStudents(String nameStudents) {
        this.nameStudents = nameStudents;
    }

    public String getSerNameStudents() {
        return serNameStudents;
    }

    public void setSerNameStudents(String serNameStudents) {
        this.serNameStudents = serNameStudents;
    }

    public String isGenderStudents() {
        return genderStudents;
    }

    public void setGenderStudents(String genderStudents) {
        this.genderStudents = genderStudents;
    }

    public int getAgeStudent() {
        return ageStudent;
    }

    public void setAgeStudent(DateFound dateStudents) {
        this.ageStudent = 2021 - dateStudents.getYears();
    }

    public DateFound getDateStudents() {
        return dateStudents;
    }

    public void setDateStudents(DateFound dateStudents) {
        this.dateStudents = dateStudents;
    }

    @Override
    public String toString(){
        return String.format("\nИмя студента: %s \n" +
                             "Фамилия студента: %s \n" +
                            "Пол студента: %s \n " +
                            "Возраст студента: %s \n" +
                            "Дата рождения Сутдента: %s \n \n", nameStudents, serNameStudents, genderStudents,
                                                                ageStudent, dateStudents);
    }
}
