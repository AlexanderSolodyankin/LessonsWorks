package MentorLessons.itacademy.lesson19;

public class Student {
    String fio;
    int age;
    int mark;

    public Student(String fio, int age, int mark) {
        this.fio = fio;
        this.age = age;
        this.mark = mark;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fio='" + fio + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
