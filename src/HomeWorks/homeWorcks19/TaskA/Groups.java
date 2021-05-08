package HomeWorks.homeWorcks19.TaskA;

// Создан класс ГРУППА
public class Groups {

    // Параметры класса
    private Students[] students;
    private Courses cours;
    private DateFound dateStart;
    private int duration;

    // Пустой конструктор создан для того чтобы не было ошибки при наследовании
    public Groups(){}

    // конструктор для вводных данных из вне
    public Groups(Students[] students, Courses cours, DateFound dateStart, int duration) {
        this.students = students;
        this.cours = cours;
        this.dateStart = dateStart;
        this.duration = duration * dateStart.getMounth();
    }




    public void setStudents(Students[] students) {
        this.students = students;
    }

    public Courses getCours() {
        return cours;
    }

    public void setCours(Courses cours) {
        this.cours = cours;
    }

    public DateFound getDateStart() {
        return dateStart;
    }

    public void setDateStart(DateFound dateStart) {
        this.dateStart = dateStart;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration * dateStart.getMounth();
    }

    // перебор масива входящего класса "СТУДЕНТ" и кконвертация его в строку
    public String getStudents(){
        String student = "";
        for (Students stud: students){
            student = student + " " + stud;
        }
        return student;
    }

    // Конвертация в строку класса для вывода его данных
    @Override
    public String toString(){
        return String.format("\nСТУДЕНТЫ %s  \n КУРС %s \n Дата НАЧАЛА %s  \n Количество месяцев обучения: %s",
                getStudents(), getCours(), getDateStart(), getDuration());
    }
}
