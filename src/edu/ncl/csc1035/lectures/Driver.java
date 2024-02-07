package edu.ncl.csc1035.lectures;

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("my title", 2.99, 1234567890, true);
        System.out.println(book2);
        Library myLibrary = new Library("Konrad's library");
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book2);
        System.out.println(myLibrary);
    }
}
