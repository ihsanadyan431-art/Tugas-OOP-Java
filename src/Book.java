package com.perpustakaan;

public class Book {
    // Encapsulation: Menggunakan private fields
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter dan Setter
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    public void getInfo() {
        System.out.println("Judul: " + title);
        System.out.println("Penulis: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Method yang akan di-override
    public void display() {
        getInfo();
    }
}
