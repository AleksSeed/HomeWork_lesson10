public class Main {
    public static void main(String[] args) {
        Author author = new Author("Ник", "Перумов");
        Book book = new Book(author, "Война мага Iч.", 2003);

        System.out.println(author.toString());
        System.out.println("Author = " + author.getNameAuthor());
        System.out.println("Book = " + book.getNameBook() + " " + book.getPublication());
        book.setPublication(2022);
        System.out.println("Измененный год публикации = " + book.getPublication() + "\n");


        Author author2 = new Author("Маргарет", "Уэйс");
        Book book2 = new Book(author2,"Драконы Осенних Сумерек", 2008);

        System.out.println(author2.toString());
        System.out.println("Author = " + author2.getNameAuthor());
        System.out.println("Book = " + book2.getNameBook() + " " + book2.getPublication());
        book2.setPublication(2020);
        System.out.println("Измененный год публикации = " + book2.getPublication() + "\n");



    }
}