package com.perpustakaan;

public interface Borrowable {
    void borrow();
    void returnBook();
    boolean isAvailable();
}
