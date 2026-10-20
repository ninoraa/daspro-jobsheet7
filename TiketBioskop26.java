import java.util.Scanner;

public class TiketBioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    double HARGA = 50000;
    int jumlahTiket, totalTiket = 0;
    double harga, totalPenjualan = 0;

 do {
        System.out.print("Masukkan jumlah tiket: ");
        jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid. Masukkan ulang jumlah tiket.");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            harga = jumlahTiket * HARGA;

            if (jumlahTiket > 4) {
                harga = harga - (harga * 0.10);
            } else if (jumlahTiket > 10) {
                harga = harga - (harga * 0.15);
            }

            totalTiket += jumlahTiket;
            totalPenjualan += harga;

        System.out.println("Total bayar: Rp " + harga);
         } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
    }
}