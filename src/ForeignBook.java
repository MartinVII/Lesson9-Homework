public class ForeignBook extends Book {

    public ForeignBook(String bookName, String author, int pages, String language){
        super(bookName, author, pages);
        this.language = language;
    }

    public ForeignBook(String bookName, String author, int pages){
        super(bookName, author, pages);
        this.language = "English";
    }

    public String toString(){
        return this.language;
    }

    private String language;
}
