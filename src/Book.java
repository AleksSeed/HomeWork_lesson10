public class Book {
    private final Author authorName;
    private static String nameBook;
    private int publication;

    public Book(Author authorName, String nameBook, int publication){
        this.authorName = authorName;
        this.nameBook = nameBook;
        this.publication = publication;
    }

    public Author getAuthor() {
        return this.authorName;
    }

    public String getNameBook(){
        return this.nameBook;
    }

    public int getPublication(){
        return this.publication;
    }

    public void setPublication(int publication){
        this.publication = publication;
    }

}