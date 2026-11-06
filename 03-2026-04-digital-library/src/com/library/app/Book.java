package com.library.app;

public abstract class Book {
    private final String title;
    private final String author;
    private final int publicationYear;
    private final String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public String getGenre() { return genre; }

    public abstract String getDetails();
}
