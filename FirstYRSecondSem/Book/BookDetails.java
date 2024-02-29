package Book;

public class BookDetails {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F, Scott Fitzgerald", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1949);

        String book1_title = book1.getTitle();
        String book1_author = book1.getAuthor();
        int book1_year = book1.getYear();

        System.out.println(book1_title +" \nby " + book1_author +" \n-Year "+ book1_year + "\n");

        String book2_title = book2.getTitle();
        String book2_author = book2.getAuthor();
        int book2_year = book2.getYear();

        System.out.println(book2_title +" \nby " + book2_author +" \n-Year "+ book2_year + "\n");


        String book3_title = book3.getTitle();
        String book3_author = book1.getAuthor();
        int book3_year = book1.getYear();

        System.out.println(book3_title +" \nby " + book3_author +" \n-Year "+ book3_year);
    }
}
