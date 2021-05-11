package MentorLessons.itacademy.lesson20;

public class Book {
    private String author;
    private String title;
    private int pageCount;
    private String giftedBy;
    private String pressMark;
    private boolean isNeededRepair;

    public Book(String author, String title, int pageCount) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.giftedBy = "Me";
        this.pressMark = author + title + pageCount;
        this.isNeededRepair = false;
    }

    public String getAuthor() {
        return this.author;
    }
    public void setAuthor(String author) {
        this.pressMark = author + title + pageCount;
        this.author = author;
    }

    public int getPageCount() {
        return this.pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pressMark = author + title + pageCount;
        this.pageCount = pageCount;
    }

    public void setTitle(String title) {
        this.pressMark = author + title + pageCount;
        this.title = title;
    }

}
