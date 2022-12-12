public class Main {
    public static void main(String[] args) {
        Book book = new Book("Война мага Iч.", 2003);
        Book book2 = new Book("Драконы Осенних Сумерек", 2008);
        Author Author = new Author("Ник", "Перумов");
        Author Author2 = new Author("Маргарет", "Уэйс");

        System.out.println("Book = " + book.getName() + " " + book.getPublication());
        System.out.println("Author = " + Author.getName() + " " + Author.getSurname());
        book.setPublication(2022);
        System.out.println("Измененный год публикации = " + book.getPublication() + "\n");

        System.out.println("Book = " + book2.getName() + " " + book2.getPublication());
        System.out.println("Author = " + Author2.getName() + " " + Author2.getSurname());
        book2.setPublication(2022);
        System.out.println("Измененный год публикации = " + book2.getPublication());

       /** Вот этого я не понимаю:
        *  Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.*/
    }
}