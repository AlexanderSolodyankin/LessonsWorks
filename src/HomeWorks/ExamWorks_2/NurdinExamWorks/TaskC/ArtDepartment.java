package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskC;

import java.util.Vector;

public class ArtDepartment extends Department {

    public ArtDepartment() {
    }

    public ArtDepartment(Vector<Book> books) {
        super(books);
    }

    public void printFullBookDepartment() {     //2. Вывод на консоль всех книг отдела
        System.out.println("Художественные книги:\n" + getBooks());
    }

    public void printDepartmentInfo() {     //3. Вывод на консоль всей информации отдела (включая все книги)
        System.out.println(toString());
        printFullBookDepartment();
    }

    public int getCountBookArt() {      //5. Метод для получения количества книг в любом из отделов
        return getBooks().size();
    }

    @Override
    public String toString() {      //6. Каждый отдел выводит свое название и количество книг при вызове toString()
        return "Отдел Художественной литературы: " +
                "кол - во книг: " + getCountBookArt();
    }
}
