package com.library.app;


public class Novel extends Book {
    private final boolean isBestseller;


    public Novel(String title, String author, int year, String genre, boolean isBestseller) {
        super(title, author, year, genre);
        this.isBestseller = isBestseller;
    }

    @Override
    public String getDetails() {
        String bestsellerStr = isBestseller ? "(Bestseller)" : "";
        return "Novel: " + getTitle() + " by " + getAuthor() + " " + bestsellerStr;
    }
}
