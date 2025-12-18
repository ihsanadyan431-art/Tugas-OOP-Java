package com.perpustakaan;

public class PrintedBook extends Book implements Borrowable {
    private int pages;
    private double weight;
    private boolean available = true;

    public PrintedBook(String title, String author, String isbn, int pages, double weight) {
        super(title, author, isbn);
        this.pages = pages;
        this.weight = weight;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Halaman: " + pages);
        System.out.println("Berat: " + weight + "kg");
        System.out.println("Shelf Location: A1-04");
    }

    @Override
    public void borrow() { available = false; System.out.println("Buku cetak diambil dari rak."); }
    @Override
    public void returnBook() { available = true; }
    @Override
    public boolean isAvailable() { return available; }
}
