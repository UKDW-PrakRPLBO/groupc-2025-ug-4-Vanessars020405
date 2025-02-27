package org.example;

public class TV {
        private int maxResolusi;
        private Colokan colokan;

        public TV(int maxResolusi) {
            this.maxResolusi = maxResolusi;
        }

        public void connect(Colokan colokan) {
            this.colokan = colokan;
            System.out.println("Berhasil Connect ke - " + colokan.getMerk());
        }

    public int getResolution() {
            if (colokan == null) {
                return 0;
            }

            double realBandwidth = colokan.getRealBandwidth();
            if (realBandwidth >= 10 && realBandwidth <= 35) {
                return Math.min(480, maxResolusi);
            } else if (realBandwidth > 35 && realBandwidth <= 100) {
                return Math.min(720, maxResolusi);
            } else {
                return Math.min(1080, maxResolusi);
            }
        }
    }

