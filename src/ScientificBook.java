public class ScientificBook extends Book {

    public ScientificBook(String bookName, String author, int pages, String field){
        super(bookName, author, pages);
        this.field = field;
    }

    private String field;
}
