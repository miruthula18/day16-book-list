public class BookList {
    public static void main(String[] args) {

        String[] books = {
            "Java",
            "Python",
            "C Programming",
            "Data Structures",
            "Web Development"
        };

        System.out.println("Book List");

        for (int i = 0; i < books.length; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}