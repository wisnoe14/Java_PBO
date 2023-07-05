package org.Kasir;

public class Makanan extends Item {
    private String jenis;

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    @Override
    public String getInfo() {
        return getJenis();
    }
}

