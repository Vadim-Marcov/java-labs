package org.example;

public class Novel extends Book {
    private String genre;

    public String getNovelGenre() {
        return genre;
    }

    public void setNovelGenre(String genre) {
        this.genre = genre;
    }

    public Novel(String title, String author, int pages, String genre) {
        super(title, author, pages);
        this.genre = genre;
    }

    public String getGenre(){
        return "Жанр: Роман";
    }

    public void getPlotSummary() {
        System.out.println("Краткое содержание: " + getTitle());
    }
}