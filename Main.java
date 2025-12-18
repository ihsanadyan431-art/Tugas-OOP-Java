package com.perpustakaan;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: Tipe data 'Book' tapi objeknya 'DigitalBook'/'PrintedBook'
        Book myDigital = new DigitalBook("Belajar Java", "Budi", "111-222", 15.5, "PDF");
        Book myPrinted = new PrintedBook("Sejarah Dunia", "Siti", "333-444", 350, 0.8);

        System.out.println("--- INFO BUKU DIGITAL ---");
        myDigital.display(); // Memanggil display() versi DigitalBook
        
        System.out.println("\n--- INFO BUKU CETAK ---");
        myPrinted.display(); // Memanggil display() versi PrintedBook
    }
}
