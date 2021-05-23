package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskC;

public class Book {
    private static int count;

    private int idBook;
    private String authorBook;
    private String nameBook;
    private String yearOfIssueBook;

    public Book() {
    }

    public Book(String authorBook,
                String nameBook, String yearOfIssueBook) {
        count++;
        idBook = count;
        this.authorBook = authorBook;
        this.nameBook = nameBook;
        this.yearOfIssueBook = yearOfIssueBook;
    }

    @Override
    public String toString() {
        return "Книга №" + idBook +
                "\nАвтор: " + authorBook +
                "\nНазвание: " + nameBook +
                "\nГод выпуска: " + yearOfIssueBook + "\n";
    }

    public static int getCount() {
        return count;
    }

    public int getIdBook() {
        return idBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getYearOfIssueBook() {
        return yearOfIssueBook;
    }

    public void setYearOfIssueBook(String yearOfIssueBook) {
        this.yearOfIssueBook = yearOfIssueBook;
    }
}
