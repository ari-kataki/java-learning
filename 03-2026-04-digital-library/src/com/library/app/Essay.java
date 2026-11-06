package com.library.app;

public class Essay extends Book {
    private final String topic;

    public Essay(String title, String author, int year, String genre, String topic) {
        super(title, author, year, genre);
        this.topic = topic;
    }

    @Override
    public String getDetails() {
        return "Essay: " + getTitle() + " - Topic: " + topic;
    }
}
