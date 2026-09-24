import java.util.Scanner;

class LibraryItem {
    int itemId;
    String title, author;
    boolean available = true;

    void issueItem() {
        if (available) {
            available = false;
            System.out.println("Item Issued");
        } else {
            System.out.println("Item Already Issued");
        }
    }

    void returnItem() {
        available = true;
        System.out.println("Item Returned");
    }

    void display() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + available);
    }

    void lateFine(int days) {
        int fine = days * 5;
        System.out.println("Late Fine = Rs. " + fine);
    }
}

class Book extends LibraryItem {
}

class Magazine extends LibraryItem {
}

class ResearchPaper extends LibraryItem {
}

class LibraryManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book b = new Book();

        System.out.print("Enter Item ID: ");
        b.itemId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Title: ");
        b.title = sc.nextLine();

        System.out.print("Enter Author: ");
        b.author = sc.nextLine();

        b.display();

        b.issueItem();

        System.out.print("Enter late days: ");
        int days = sc.nextInt();

        b.lateFine(days);

        b.returnItem();
    }
}