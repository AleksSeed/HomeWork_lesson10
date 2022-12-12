public class Book {
    private String name;
    private int publication;

    public Book(String name, int publication){
        this.name = name;
        this.publication = publication;
    }

    public String getName(){
        return this.name;
    }

    public int getPublication(){
        return this.publication;
    }

    public void setPublication(int publication){
        this.publication = publication;
    }

}
