package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book abc = new Book("Abc", 55);
        Book chipalino = new Book("Chipalino", 90);
        Book mony = new Book("Mony", 123);
        Book cleanCode = new Book("Clean Code", 0);
        Book[] books = new Book[4];
        books[0] = abc;
        books[1] = chipalino;
        books[2] = mony;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("Swaped 3 and 0 book");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        System.out.println();
        System.out.println("Only Clean Code name ");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean Code")) {
                System.out.println(book.getName());
            }
        }
    }
}
