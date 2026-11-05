package org.example;

public class Book {
    private String title;
    private String author;
    private int pages;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getGenre() {
        return "Жанр";
    }

    public void displayInfo() {
        System.out.println("Название: " + title + " Автор: " + author + " Страниц: " + pages);
    }
}