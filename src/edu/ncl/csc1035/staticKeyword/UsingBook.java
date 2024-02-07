package edu.ncl.csc1035.staticKeyword;

public class UsingBook {
    public static void main(String[] args) {
        Book book1, book2;
        System.out.println(Book.getNumberOfBooks());
        book1 = new Book("Mort", "Terry Pratchett");
        book2 = new Book("Strange Planet", "Nathan W. Pyle");
        System.out.println(book1);
        System.out.println(book2);
        book2 = new Book("Strange Planet", "Nathan W. Pyle");
        System.out.println(book2);
        System.out.println(book1);
        Book.setNumberOfBooks(2);
        System.out.println(Book.getNumberOfBooks());
        book1.setNumberOfBooks(1);
        System.out.println(Book.getNumberOfBooks());
        System.out.println(book1.getNumberOfBooks());
        book1.setTitle("Hello");
        System.out.println(book1);
    }
}
