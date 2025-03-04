import java.util.Scanner;

class Book {
    public static int total_books = 0;
    private int id;
    private String bookTitle;
    private int yearOfPublication;
    private String authorName;
    private String publisherName;
    private int numberOfAvailableCopies;
    private int totalCopies;
    String[] issuer;

    // constructor
    public Book() {
        bookTitle = "Unknown";
        authorName = "Unknown";
        total_books++;
    }

    public Book(int id) {
        bookTitle = "Unknown";
        authorName = "Unknown";
        total_books++;
        this.id = id;
    }

    public void setDetails(String title, String aname, int yop, String pname, int tot) {
        this.bookTitle = title;
        this.authorName = aname;
        this.yearOfPublication = yop;
        this.publisherName = pname;
        this.numberOfAvailableCopies = tot;
        this.totalCopies = tot;
        this.issuer = new String[totalCopies];
    }

    public void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Year of publication: " + yearOfPublication);
        System.out.println("Total copies: " + totalCopies);
        System.out.println("Available copies: " + numberOfAvailableCopies);
    }

    public static int get_total_books() {
        return total_books;
    }

    // getters
    public String getBookName() {
        return bookTitle;
    }

    public String getAurthorName() {
        return authorName;
    }

    public int getYearOfpub() {
        return yearOfPublication;
    }

    public int getId() {
        return id;
    }

    public int getAvailCopies() {
        return numberOfAvailableCopies;
    }

    public String getPubName() {
        return publisherName;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    // setters
    public void setBookName(String bname) {
        bookTitle = bname;
    }

    public void setAurthorName(String aname) {
        authorName = aname;
    }

    public void setYearOfPub(int yop) {
        yearOfPublication = yop;
    }

    public void setId(int new_id) {
        id = new_id;
    }

    public void setAvailCopies(int nac) {
        numberOfAvailableCopies = nac;
    }

    public void setPubName(String pname) {
        publisherName = pname;
    }

    // functions

    public void borrowing(String name) {
        if (numberOfAvailableCopies == 0) {
            System.out.println("Sorry, all books are issued.");
        } else {
            issuer[totalCopies - numberOfAvailableCopies] = name;
            numberOfAvailableCopies--;
            System.out.println("Book issued. Please visit again.");
        }
    }

    public void returning(String name) {
        int i = 0;
        for (String nm : issuer) {
            if (nm.equalsIgnoreCase(name)) {
                issuer[i] = "None";
                break;
            }
            i++;
        }
        numberOfAvailableCopies++;
        System.out.println("Thank you, Do visit again!");
    }
}

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String pin = "merilibrary";
        Book booklist[] = new Book[100];
        booklist[0] = new Book(6060);
        booklist[0].setDetails("Atomic Habits", "James Clear", 2018, "Random house publications", 2);
        count++;
        System.out.println("Welcome to Library. State your purpose.");
        System.out.println("Enter 1 to visit.\nEnter 2 to add books.\nEnter 3 to borrow books.");
        System.out.println("Enter 4 to return books.\nEnter 5 to exit.\nEnter 0 to view logs.");
        int ch = 0;
        while (ch != 5) {
            System.out.print("\nEnter Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 0:
                    System.out.print("Enter administrative pin (case sensitive): ");
                    String tpin = sc.next();
                    if (tpin.equals(pin)) {
                        for (int i = 0; i < count; i++) {
                            System.out.println("The copies of " + booklist[i].getBookName() + " are given to-");
                            for (int j = 0; j < (booklist[i].getTotalCopies() - booklist[i].getAvailCopies()); j++) {
                                System.out.println(booklist[i].issuer[j]);
                            }
                        }
                    } else {
                        System.out.println("Wrong pin. Administrative access denied.");
                    }
                    break;
                case 1:
                    System.out.println("The total books in library are " + Book.total_books);
                    System.out.println("Enter the book id you want to search: ");
                    int tid = sc.nextInt();
                    for (int j = 0; j < count; j++) {
                        if (booklist[j].getId() == tid)
                            booklist[j].getDetails();
                    }
                    break;
                case 2:
                    System.out.print("Enter the number of books you want to add to library: ");
                    int n = sc.nextInt();
                    for (int i = count; i < count + n; i++) {
                        System.out.printf("Enter book id: ");
                        int id = sc.nextInt();
                        booklist[i] = new Book(id);
                        sc.nextLine();
                        System.out.print("Enter book name: ");
                        String nm = sc.nextLine();
                        System.out.print("Enter author name: ");
                        String anm = sc.nextLine();
                        System.out.print("Enter publisher name: ");
                        String pnm = sc.nextLine();
                        System.out.print("Enter total copies: ");
                        int tot = sc.nextInt();
                        System.out.print("Enter year of publication: ");
                        int yop = sc.nextInt();
                        booklist[i].setDetails(nm, anm, yop, pnm, tot);
                        System.out.println();
                    }
                    count += n;
                    break;
                case 3:
                    System.out.println("The available books are-");

                    for (int j = 0; j < count; j++) {
                        System.out.println(booklist[j].getBookName());
                    }
                    sc.nextLine();
                    System.out.print("Enter the book id to borrow: ");
                    int bnameid = sc.nextInt();
                    int flag = 0;
                    for (int j = 0; j < count; j++) {
                        if (booklist[j].getId() == bnameid) {
                            sc.nextLine();
                            System.out.print("Enter your name: ");
                            String name = sc.nextLine();
                            booklist[j].borrowing(name);
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        System.out.println("Wrong book id.");
                    }
                    break;
                case 4:
                    sc.nextLine();
                    System.out.print("Enter the book id to return: ");
                    int bnameb = sc.nextInt();
                    int flagb = 0;
                    for (int j = 0; j < count; j++) {
                        if (booklist[j].getId() == bnameb) {
                            sc.nextLine();
                            System.out.print("Enter your name: ");
                            String name = sc.nextLine();
                            booklist[j].returning(name);
                            flagb = 1;
                            break;
                        }
                        if (flagb == 0)
                            System.out.println("Wrong book id.");
                    }
                    break;
                default:
                    if (ch != 5)
                        System.out.println("Wrong choice!");
            }
        }
        sc.close();
    }
}