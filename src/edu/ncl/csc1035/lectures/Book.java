package edu.ncl.csc1035.lectures;

public class Book {
    String title;
    private double price;
    long isbn;
    boolean fiction; // false if non-fiction

    public Book() {
        title=null;
        price = 0.0;
        isbn = 0;
        fiction = false;
    }

    public Book(String title, double price, long isbn, boolean fiction) {
        this.title = title;
        this.setPrice(price);
        this.isbn = isbn;
        this.fiction = fiction;
    }

    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            price = 0;
            System.out.println("Price is negative, set to 0 instead");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", isbn=" + isbn +
                ", fiction=" + fiction +
                '}';
    }
}
