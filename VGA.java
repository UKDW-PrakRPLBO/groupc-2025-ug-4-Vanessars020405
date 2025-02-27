package org.example;

public class VGA extends Colokan{
    public VGA(int harga, int promisedBandwidth, String merk) {
        super(harga, promisedBandwidth, merk);
    }

    @Override
    public double getRealBandwidth() {
        double hargaPasaran = 30000;
        double ratio = ((double)harga * 100) / (double)hargaPasaran;
        return (ratio < 100) ? (promisedBandwidth * ratio) / 100 : promisedBandwidth;
    }
}





