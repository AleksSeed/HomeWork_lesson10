import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSurname;
    private static String Author;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.Author = authorName + " " + authorSurname;
    }

    public String getNameAuthor(){
        return Author;
    }

    /**  V   V  */

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author author = (Author) other;
        return author.equals(author.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Author);
    }
    @Override
    public String toString() {
        return  authorName + " " + authorSurname;
    }

}