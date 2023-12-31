package org.Kasir;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static Kasir kasir = new Kasir();
    public static void main(String[] args) {
        InitContoh();
        String cobaLagi = "n";
        do {
            tampilMenuMakanan();
            int pilihan = pilihMenu();
            System.out.println("Anda memilih pilihan "+pilihan);

            switch (pilihan) {
                case 1 :
                    tambahMakanan();
                    break;
                case 2 :
                    tambahMinuman();
                    break;
                case 3 :
                    updateMenu();
                    break;
                case 4 :
                    hitung();
                    break;
                case 5 :
                    deleteMenu();
                    break;
                default:
                    System.out.println("pilihan salah!!!");
                    break;
            }

            System.out.print("Coba lagi? (y/n)");
            cobaLagi = scan.next();
        } while (cobaLagi.equals("y"));

    }

    private static void updateMenu() {
        System.out.println("Masukkan nomor makanan yang ingin diupdate: ");
        int no = scan.nextInt();
        System.out.println("Anda memilih pilihan Update");

        System.out.println("Masukkan nama menu:");
        scan.nextLine();
        String nama = scan.nextLine();
        System.out.println("Masukkan harga menu:");
        int harga = scan.nextInt();
        scan.nextLine();
        System.out.println("Masukkan jenis menu:");
        String ukuran = scan.nextLine();

        // Memanggil setter untuk mengubah nilai atribut pada objek menu
        kasir.daftarItem.get(no - 1).setNama(nama);
        kasir.daftarItem.get(no - 1).setHarga(harga);

        // Memeriksa jenis objek dan memanggil setter yang sesuai
        if (kasir.daftarItem.get(no - 1) instanceof Makanan) {
            ((Makanan) kasir.daftarItem.get(no - 1)).setJenis(ukuran);
        } else if (kasir.daftarItem.get(no - 1) instanceof Minuman) {
            ((Minuman) kasir.daftarItem.get(no - 1)).setUkuran(ukuran);
        }
    }

    private static void hitung() {
        // Menghitung total harga
        double totalHarga = kasir.hitungTotalHarga();
        System.out.println("Total Harga: " + totalHarga);
    }

    private static void tambahMinuman() {
        System.out.println("Anda memilih pilihan tambah Minuman");

        System.out.println("Masukkan nama minuman :");
        scan.nextLine();
        String nama = scan.nextLine();
        System.out.println("Masukkan harga minuman :");
        int harga = scan.nextInt();
        scan.nextLine();
        System.out.println("Masukkan jenis minuman :");
        String ukuran = scan.nextLine();
        kasir.tambahItem(new Minuman(nama,harga,ukuran));
    }



    private static void tambahMakanan() {
        System.out.println("Anda memilih pilihan tambah Makanan");

        System.out.println("Masukkan nama makanan :");
        scan.nextLine();
        String nama = scan.nextLine();
        System.out.println("Masukkan harga makanan :");
        int harga = scan.nextInt();
        scan.nextLine();
        System.out.println("Masukkan jenis makanan :");
        String jenis = scan.nextLine();

        kasir.tambahItem(new Minuman(nama, harga, jenis));
    }



    private static void deleteMenu() {
            // Menghapus item
            System.out.println("Masukkan nomor makanan Yang ingin di hapus : ");
            int no = scan.nextInt();
            kasir.hapusItem(no);
    }

    private static void tampilMenuMakanan() {
        // Menampilkan daftar item
        kasir.tampilkanDaftarItem();
    }

    private static void InitContoh() {
        // Menambahkan beberapa item ke daftar
        kasir.tambahItem(new Makanan("Roti", 5000, "Manis"));
        kasir.tambahItem(new Minuman("Kopi", 10000, "Sedang"));
        kasir.tambahItem(new Makanan("Burger", 15000, "Gurih"));
    }

    public static int pilihMenu() {
        System.out.println("Pilihan");
        System.out.println("1. Tambah Makanan");
        System.out.println("2. Tambah Minuman");
        System.out.println("3. Update Menu");
        System.out.println("4. Hitung Total");
        System.out.println("5. Delete Menu");
        System.out.print("Masukkan Opsi : ");
        int pilih = 0;
        try {
            pilih = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Inputan Salah");
        }
        return pilih;

    }
}
