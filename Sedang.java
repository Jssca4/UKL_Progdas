import java.util.Scanner;

public class Sedang {
    public static void main(String[] args) {

        double totalTabungan = 0;
        double tabunganBulanan = 50000;
        double tabunganBulanPertama = 100000;

        Scanner s = new Scanner(System.in);

        for (int i
        
         = 1; i <= 12; i++) {
            totalTabungan += tabunganBulanan;
            tabunganBulanan += 50000;
            System.out.println("Total Tabungan Bulan Ke- " + i + " RP. " + tabunganBulanan);

        }

        System.out.println("Total Tabungan Setelah 12 Bulan adalah Rp. " + totalTabungan);

    }
}
