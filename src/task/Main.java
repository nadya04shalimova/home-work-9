package task;

@MyAnnotation
public class Main {
    public static void main(String[] args) {
        var author = new Author("Александр", "Пушкин");
        var author1 = new Author("Михаил", "Булгаков");
        var author2 = new Author("Лев", "Толстой");
        var book1 = new Book("Book1", author, 1833);
       book1.setPublicationYear(1833);
        System.out.println(book1);
    }
}
