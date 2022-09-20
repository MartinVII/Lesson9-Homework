public class Book {

    public Book(String bookName, String author, int pages){
        this.bookName = bookName;
        this.author = author;
        this.pages = pages;
    }

    private String bookName;
    private String author;
    private int pages;

    public String toString(){
        return this.bookName;
    }
}
