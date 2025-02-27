package org.example;

public class HDMI extends Colokan {
    public HDMI(int harga, int promisedBandwidth, String merk) {
        super(harga, promisedBandwidth,merk);
    }


    @Override
    public double getRealBandwidth() {
            double hargaPasaran = 50000;
            double ratio = (double)(harga * 100) / hargaPasaran;
            return (ratio < 100) ? (promisedBandwidth * ratio) / 100 : promisedBandwidth;
        }
}

