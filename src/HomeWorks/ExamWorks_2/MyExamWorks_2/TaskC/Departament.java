package HomeWorks.ExamWorks_2.MyExamWorks_2.TaskC;

import java.util.Arrays;


public class Departament {
    private String name;
    private Books[] booksDepartament;

    public Departament(String name){
        this.booksDepartament = new Books[0];
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setBooks(Books books){
        this.booksDepartament = Arrays.copyOf(this.booksDepartament,this.booksDepartament.length + 1);
        this.booksDepartament[this.booksDepartament.length - 1] = books;
    }

    Books[] getBooksDepartament(){return booksDepartament;}

    private int countBooks(){
        return this.booksDepartament.length;
    }

    @Override
    public String toString(){
        String outInform = "";
        outInform = String.format("Отдел %s.\n" +
                "Количество хронящихся книг: %s\n", this.name, countBooks());
        return outInform;
    }

    public String outAllInformationsTheDeportament(){
        String allInformation = String.format("Отдел %s.\n" +
                "Количество хронящихся книг: %s\n", name, (booksDepartament.length));
        for (Books allBooks: booksDepartament) {
            allInformation = allInformation + "\n" + allBooks;
        }
        return allInformation;
    }

    public void searchBookByAutor(String autor){
        String outSearch = "";
        for (int i = 0; i < this.booksDepartament.length; i++){
            if(autor.equals(booksDepartament[i].getAutor())){
                outSearch = "Книга которую вы запрашивали: \n" + booksDepartament[i];
            }else {
                outSearch = "Такой книги в данном отделе нет";
            }
        }
        System.out.println(outSearch);
    }
}
