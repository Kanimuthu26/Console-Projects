import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n1.Add Book 2.View Books 3.Issue 4.Return 5.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    lib.addBook(id, name);
                }
                case 2 -> lib.showBooks();
                case 3 -> {
                    System.out.print("Enter ID: ");
                    lib.issueBook(sc.nextInt());
                }
                case 4 -> {
                    System.out.print("Enter ID: ");
                    lib.returnBook(sc.nextInt());
                }
            }
        } while (choice != 5);
    }
}
