package org.Kasir;

public class Minuman extends Item {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    @Override
    public String getInfo() {
        return getUkuran();
    }
}
