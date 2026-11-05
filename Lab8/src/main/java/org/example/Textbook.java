package org.example;

public class Textbook extends Book {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Textbook(String title, String author, int pages, String subject) {
        super(title, author, pages);
        this.subject = subject;
    }

    public String getGenre() {
        return "Жанр: Учебник";
    }

    public void getChapterList() {
        System.out.println("Список глав учебника: " + subject);
    }
}