package com.library.app;
import java.util.ArrayList;
import java.io.*;

public class CollectionManager {
    static ArrayList<Book> books = new ArrayList<Book>();

    public static void add(Book b) {
        books.add(b);
    }

    public static ArrayList<Book> getBooks() {
        return books;
    }

    public static void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("collection.txt"))) {
            for (Book book : books) {
                writer.println(book.getDetails());
            }
        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }
}
