/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Aukhal
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek pengarang
        Pengarang pengarang1 = new Pengarang("Tere Liye");
        Pengarang pengarang2 = new Pengarang("Dewi Lestari");

        // Membuat objek buku dengan agregasi pengarang
        Buku buku1 = new Buku("Bulan", pengarang1);
        Buku buku2 = new Buku("Supernova", pengarang2);

        // Membuat objek perpustakaan dan menambah buku
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        // Menampilkan informasi perpustakaan
        perpustakaan.infoPerpustakaan();
    }
}
