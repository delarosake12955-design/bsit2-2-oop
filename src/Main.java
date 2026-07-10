import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        int choice;

        do {

            System.out.println("\n===== LIBRARY MENU =====");

            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Search Book");
            System.out.println("0. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    Book book = new Book(title, author);

                    library.addBook(book);

                    break;

                case 2:

                    library.listBooks();

                    break;

                case 3:

                    System.out.print("Enter title to borrow: ");
                    title = sc.nextLine();

                    library.borrowBook(title);

                    break;

                case 4:

                    System.out.print("Enter title to return: ");
                    title = sc.nextLine();

                    library.returnBook(title);

                    break;

                case 5:

                    System.out.print("Enter title to search: ");
                    title = sc.nextLine();

                    library.searchBook(title);

                    break;

                case 0:

                    System.out.println("Thank you for using the Library System.");

                    break;

                default:

                    System.out.println("Invalid choice.");

            }

        } while (choice != 0);

        sc.close();

    }

}