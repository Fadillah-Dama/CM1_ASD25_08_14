public class ServiceClass {
    TransaksiPembelian[] Trs = new TransaksiPembelian[5];
    Barang[] Brg = new Barang[5];
    int idx;
    int idx2;

    void tambahDataTransaksi(TransaksiPembelian trP) {
        if (idx < Trs.length) {
            Trs[idx] = trP;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tambahDataBarang(Barang barangs) {
        if (idx2 < Brg.length) {
            Brg[idx] = barangs;
            idx2++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    int searching(String key) {
        for (int i = 0; i < Brg.length; i++) {
            if (Brg[i].kodeBarang.equalsIgnoreCase(key)) {
                return i;
            }
        }
        return -1;
    }

    // void sorting() {
    //     for (int i = 0; i < Brg.length - 1; i++) {
    //         for (int j = 0; j < Brg.length - i - 1; j++) {
    //             if (Brg.)
    //         }
    //     }
    // }

    void tampilSemuaDataBarang() {
        for (int i = 0; i < Brg.length; i++) {
            Brg[i].tampilDataBarang();
        }
    }

    void tampilSemuaDataTransaksi() {
        for (int i = 0; i < Trs.length; i++) {
            Trs[i].tampilDataTransaksi();
        }
    }

    void tampilPosisiSearch(String key, int posisi) {
        if (posisi != -1) {
            System.out.println("Barang dengan kode " + key + " ditemukan di index : " + posisi);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }

    void tampilDataSearch(int posisi) {
        Brg[posisi].tampilDataBarang();
    }
}
