public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Jason", "Schreier");
        Author author2 = new Author("William", "Shakespeare");

        Book book1 =  new Book("Blood, sweat, and pixels", author1, 2017);
        Book book2 = new Book("Hamlet", author2, 1623);

        System.out.println("First author name = " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Second author name = " + author2.getFirstName() + " " + author2.getLastName());

        System.out.println("\nFirst book name = " + book1.getName() +
                ", author = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", Publication year = " + book1.getPublicationYear());
        System.out.println("Second book name = " + book2.getName() +
                ", author = " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() +
                ", Publication year = " + book2.getPublicationYear());

        book1.setPublicationYear(2020);

        System.out.println("\nFirst book name = " + book1.getName() +
                ", author = " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() +
                ", Publication year = " + book1.getPublicationYear());
    }
}
