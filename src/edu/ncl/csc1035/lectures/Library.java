package edu.ncl.csc1035.lectures;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> listOfBooks ;//= new ArrayList<>();;
    String name;

    public Library(String name) {
        this.listOfBooks = new ArrayList<>();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "listOfBooks=" + listOfBooks +
                ", name='" + name + '\'' +
                '}';
    }
    public boolean addBook(Book book){
        return listOfBooks.add(book);
    }
}
