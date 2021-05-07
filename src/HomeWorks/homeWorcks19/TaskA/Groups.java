package HomeWorks.homeWorcks19.TaskA;

import HomeWorks.homeworcks18.Cows;

public class Groups {
    private Students[] students;
    private Courses cours;
    private DateFound dateStart;
    private int duration;

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

    public String getStudents(){
        String student = "";
        for (Students stud: students){
            student = student + " " + stud;
        }
        return student;
    }
}
