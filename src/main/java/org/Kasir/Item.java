package org.Kasir;

public abstract class Item {
    private String nama;
    private double harga;

    public Item(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }


    public double getHarga() {
        return harga;
    }

    public abstract String getInfo();

}

