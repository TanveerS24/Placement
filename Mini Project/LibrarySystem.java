import java.util.*;

class Book {
    int id;
    String title;
    String author;
    boolean available;

    Book(int id, String title, String author, boolean available) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = available;
    }
}

class Member {
    int id;
    String name;

    Member(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class LibrarySystem {
    static List<Book> books = new ArrayList<>();
    static List<Member> members = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        init();
        while (true) {
            System.out.println("\n1.View Books\n2.View Available Books\n3.Issue Book\n4.Return Book\n5.Book Details\n6.Member Details\n7.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: viewBooks(); break;
                case 2: viewAvailableBooks(); break;
                case 3: issueBook(); break;
                case 4: returnBook(); break;
                case 5: bookDetails(); break;
                case 6: memberDetails(); break;
                case 7: System.exit(0);
            }
        }
    }

    static void init() {
        books.add(new Book(1, "Clean Code", "Robert Martin", true));
        books.add(new Book(2, "Effective Java", "Joshua Bloch", true));
        books.add(new Book(3, "Design Patterns", "GoF", false));
        books.add(new Book(4, "Operating Systems", "Galvin", true));
        books.add(new Book(5, "Database Systems", "Korth", false));

        members.add(new Member(1, "Tanveer"));
        members.add(new Member(2, "Arun"));
        members.add(new Member(3, "Priya"));
    }

    static void viewBooks() {
        for (Book b : books)
            System.out.println(b.id + " " + b.title + " " + b.author + " " + (b.available ? "Available" : "Issued"));
    }

    static void viewAvailableBooks() {
        for (Book b : books)
            if (b.available)
                System.out.println(b.id + " " + b.title + " " + b.author);
    }

    static void issueBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (Book b : books) {
            if (b.id == id) {
                if (b.available) {
                    b.available = false;
                    System.out.println("Book Issued");
                } else {
                    System.out.println("Already Issued");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    static void returnBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (Book b : books) {
            if (b.id == id) {
                if (!b.available) {
                    b.available = true;
                    System.out.println("Book Returned");
                } else {
                    System.out.println("Already Available");
                }
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    static void bookDetails() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        for (Book b : books) {
            if (b.id == id) {
                System.out.println("ID: " + b.id);
                System.out.println("Title: " + b.title);
                System.out.println("Author: " + b.author);
                System.out.println("Status: " + (b.available ? "Available" : "Issued"));
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    static void memberDetails() {
        for (Member m : members)
            System.out.println(m.id + " " + m.name);
    }
}