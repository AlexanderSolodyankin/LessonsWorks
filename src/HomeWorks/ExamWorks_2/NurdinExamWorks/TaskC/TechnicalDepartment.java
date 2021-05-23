package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskC;

import java.util.Vector;

public class TechnicalDepartment extends Department {
    private boolean isComputer; //7. У отдела технической литературы должно быть свойство "наличие компьютера"

    public TechnicalDepartment() {
    }

    public TechnicalDepartment(Vector<Book> books, boolean isComputer) {
        super(books);
        this.isComputer = isComputer;
    }

    public void printFullBookDepartment() {     //2. Вывод на консоль всех книг отдела
        System.out.println("Технические книги:\n" + getBooks());
    }

    public void printDepartmentInfo() {     //3. Вывод на консоль всей информации отдела (включая все книги)
        System.out.println(toString());
        printFullBookDepartment();
    }

    public int getCountBookTech() {      //5. Метод для получения количества книг в любом из отделов
        return getBooks().size();
    }

    @Override
    public String toString() {      //6. Каждый отдел выводит свое название и количество книг при вызове toString()
        return "Отдел Технической литературы: " +
                "кол - во книг: " + getCountBookTech();
    }

    public boolean isComputer() {
        return isComputer;
    }

    public void setComputer(boolean computer) {
        isComputer = computer;
    }
}
