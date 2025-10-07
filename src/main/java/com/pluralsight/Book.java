package com.pluralsight;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void checkOut(String name) {
        this.checkedOutTo = name;
        this.isCheckedOut = true;

    }
    public void checkIn() {
        this.checkedOutTo = "";
        this.isCheckedOut = false;

    }
    public void display() {
        System.out.println("+------------------------------------------+");
        System.out.println("| ID: " + id);
        System.out.println("| Title: " + title);
        System.out.println("| ISBN: " + isbn);
        System.out.println("| Checked Out: " + (isCheckedOut ? "Yes" : "No"));
        if (isCheckedOut) {
            System.out.println("| Checked Out To: " + checkedOutTo);
        }
        System.out.println("+------------------------------------------+");
    }
    @Override
    public String toString() {
        String card = "+------------------------------------------+\n" +
                "| ID: " + id + "\n" +
                "| Title: " + title + "\n" +
                "| ISBN: " + isbn + "\n" +
                "| Checked Out: " + (isCheckedOut ? "Yes" : "No") + "\n";

        if (isCheckedOut) {
            card += "| Checked Out To: " + checkedOutTo + "\n";
        }

        card += "+------------------------------------------+";

        return card;
    }

}
