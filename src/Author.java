public class Author {
    private static String authorName;
    private static String authorSurname;
    private static String nameAuthor;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.nameAuthor = authorName + " " + authorSurname;
    }

    public String getNameAuthor(){
        return nameAuthor;
    }

}