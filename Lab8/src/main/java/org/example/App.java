package org.example;

public class App
{
    public static void main( String[] args )
    {
        Novel novel1 = new Novel("Война и мир", "Толстой", 1225, "Исторический");
        Novel novel2 = new Novel("Преступление и наказание", "Достоевский", 671, "Психологический");
        Novel novel3 = new Novel("Мастер и Маргарита", "Пушкин", 480, "Мистика");
        Textbook textbook1 = new Textbook("Алгебра", "Адинец", 320, "Математика");
        Textbook textbook2 = new Textbook("Молекулярная химия", "Альшанец", 416, "Химия");

        Book[] books = new Book[5];
        books[0] = novel1;
        books[1] = novel2;
        books[2] = novel3;
        books[3] = textbook1;
        books[4] = textbook2;

        for (int i = 0; i < books.length; i++) {
            books[i].displayInfo();
            System.out.println(books[i].getGenre());
            System.out.println();
        }

        novel1.getPlotSummary();
        novel2.getPlotSummary();
        novel3.getPlotSummary();
        textbook1.getChapterList();
        textbook2.getChapterList();
    }
}
