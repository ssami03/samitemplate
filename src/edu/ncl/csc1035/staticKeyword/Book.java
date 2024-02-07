package edu.ncl.csc1035.staticKeyword;

public class Book {
    private String title;
    private String author;
    private static int numberOfBooks = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        numberOfBooks++;
    }

    public static int getNumberOfBooks() {
        return numberOfBooks;
    }

    public static void setNumberOfBooks(int num) {
        numberOfBooks = num;
    }

    public void setTitle(String title) {
        this.title = title;
        numberOfBooks=10;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                '}';
    }

    public static void main(String[] args) {
        numberOfBooks = 5;
        System.out.println(getNumberOfBooks());
        System.out.println(numberOfBooks);
    }

}
