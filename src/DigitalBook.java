package com.perpustakaan;

public class DigitalBook extends Book implements Borrowable {
    private double fileSize;
    private String format;
    private boolean available = true;

    public DigitalBook(String title, String author, String isbn, double fileSize, String format) {
        super(title, author, isbn);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("File Size: " + fileSize + "MB");
        System.out.println("Format: " + format);
        System.out.println("Download Link: http://library.com/download/" + getIsbn());
    }

    @Override
    public void borrow() { available = false; System.out.println("Buku digital berhasil diunduh."); }
    @Override
    public void returnBook() { available = true; }
    @Override
    public boolean isAvailable() { return available; }
}
