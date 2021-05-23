package HomeWorks.ExamWorks_2.NurdinExamWorks.TaskC;

import java.util.Scanner;
import java.util.Vector;

public class Department {
    private Vector<Book> books;

    public Department() {
        this.books = new Vector<>();
    }

    public Department(Vector<Book> books) {
        this.books = books;
    }

    public void pushBook() {    //1. Добавление книг
        String author, name, year;
        System.out.print("Введите автора новой книги: ");
        author = new Scanner(System.in).nextLine();
        System.out.print("Введите название новой книги: ");
        name = new Scanner(System.in).nextLine();
        System.out.print("Введите год выпуска новой книги: ");
        year = new Scanner(System.in).nextLine();

        Book book = new Book(author, name, year);
        books.add(book);
    }

    private Book search(String author) {    //поэлементная проверка авторов книг в векторе
        for (Book book : books)
            if (book.getAuthorBook().equals(author))
                return book;
        return null;
    }

    public void searchBookAuthor() {        //4. Поиск по автору книги в отделе
        String author;
        System.out.print("Введите автора искоемой книги: ");
        author = new Scanner(System.in).nextLine();
        Book temp = search(author);
        if (temp != null)
            System.out.println(temp);
        else
            System.out.println("Такой книги нету!");
    }

    public Vector<Book> getBooks() {
        return books;
    }

    public void setBooks(Vector<Book> books) {
        this.books = books;
    }
}
