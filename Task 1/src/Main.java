import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            int price = inputPrice();
            addBook(name);
            addBook(name, pageCount);
            //todo использовать новый метод тут
            addBook(name, pageCount, price);
            printInfo();
        }
    }


    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    private static int inputPrice() {
        System.out.println("Введите цену:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
        addBook(bookName, pageCount, 0);

    }

    public static void addBook(String bookName, int pageCount, int price) {
        booksInfo = booksInfo + bookName + " - " + ((pageCount > 0 ? pageCount : "N/A") + " стр. ") +
                ((price > 0 ? (price + " цена \n") : "цена не установленф \n"));
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
