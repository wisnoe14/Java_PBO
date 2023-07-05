package org.Kasir;

import java.util.ArrayList;

public class Kasir {
    public ArrayList<Item> daftarItem = new ArrayList<>();



    public void tambahItem(Item item) {
        //Nambah Item
        daftarItem.add(item);
    }

    public void hapusItem(int no) {
        //Menghapus Item
        if(no > 0 && no <= daftarItem.size()) {
            daftarItem.remove(no-1);
            System.out.println("Makanan berhasil dihapus");
        }
        else {
            System.out.println("Menu tidak ada dalam list");
        }
    }

    public void tampilkanDaftarItem() {
        //Menampilkan Item Belanja
        System.out.println("====== Daftar Belanja ======");
        System.out.println("No\t\tNama\t\tHarga\t\tUkuran/Jenis");

        for (int i = 0; i < daftarItem.size(); i++) {
            Item item = daftarItem.get(i);
            System.out.println((i + 1) + "\t\t" + item.getNama() + "\t\t" + item.getHarga() + "\t\t" + item.getInfo());

        }
    }


    public double hitungTotalHarga() {
        //menghitung total harga belanja
        double totalHarga = 0;
        for (Item item : daftarItem) {
            totalHarga += item.getHarga();
        }
        return totalHarga;
    }
}
