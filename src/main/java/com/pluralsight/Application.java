package com.pluralsight;

public class Application {
    public static void main(String[] args) {

        Book[] books = new Book[20];

        Book book1 = new Book(1, "978-0-7475-3269-9", "Harry Potter and the Sorcerer's Stone");
        books[0] = book1;

        Book book2 = new Book(2, "978-0-7475-3849-3", "Harry Potter and the Chamber of Secrets");
        books[1] = book2;

        Book book3 = new Book(3, "978-0-7475-4215-5", "Harry Potter and the Prisoner of Azkaban");
        books[2] = book3;

        Book book4 = new Book(4, "978-0-7475-4624-5", "Harry Potter and the Goblet of Fire");
        books[3] = book4;

        Book book5 = new Book(5, "978-0-439-35806-4", "Harry Potter and the Order of the Phoenix");
        books[4] = book5;

        Book book6 = new Book(6, "978-0-545-01022-1", "Harry Potter and the Half-Blood Prince");
        books[5] = book6;

        Book book7 = new Book(7, "978-0-545-01024-5", "Harry Potter and the Deathly Hallows");
        books[6] = book7;

        Book book8 = new Book(8, "978-0-06-112008-4", "To Kill a Mockingbird");
        books[7] = book8;

        Book book9 = new Book(9, "978-0-452-28423-4", "1984");
        books[8] = book9;

        Book book10 = new Book(10, "978-0-7432-7356-5", "The Da Vinci Code");
        books[9] = book10;

        Book book11 = new Book(11, "978-0-14-028333-4", "The Great Gatsby");
        books[10] = book11;

        Book book12 = new Book(12, "978-0-618-00221-3", "The Hobbit");
        books[11] = book12;

        Book book13 = new Book(13, "978-0-618-34625-6", "The Lord of the Rings");
        books[12] = book13;

        Book book14 = new Book(14, "978-0-316-76948-0", "Twilight");
        books[13] = book14;

        Book book15 = new Book(15, "978-0-06-231500-7", "The Alchemist");
        books[14] = book15;

        Book book16 = new Book(16, "978-0-06-202403-9", "Divergent");
        books[15] = book16;

        Book book17 = new Book(17, "978-0-06-085052-4", "The Kite Runner");
        books[16] = book17;

        Book book18 = new Book(18, "978-1-4767-2765-1", "The Girl on the Train");
        books[17] = book18;

        Book book19 = new Book(19, "978-0-06-440055-8", "Charlotte's Web");
        books[18] = book19;

        Book book20 = new Book(20, "978-0-452-28425-8", "Animal Farm");
        books[19] = book20;


        for(Book book: books) {
            book.display();
        }


    }
}
