import java.util.Scanner;

public class Sulit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();


        int[] hadir = new int[jumlahSiswa];
        int totalHadir = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i+1) + ": ");
            hadir[i] = scanner.nextInt();
            totalHadir += hadir[i]; 
        }

 
        double rataRataHadir = (double) totalHadir / jumlahSiswa;

        System.out.println("Laporan Kehadiran Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i+1) + " hadir " + hadir[i] + " hari.");
        }
        System.out.println("Rata-rata kehadiran: " + rataRataHadir + " hari.");

       
        System.out.println("Siswa yang hadir di atas rata-rata:");
        boolean DiAtasRataRata = false;
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hadir[i] > rataRataHadir) {
                System.out.println("Siswa ke-" + (i+1)+ "(" +hadir[i]+")");
                DiAtasRataRata = true;
            }
        }


        System.out.println("Siswa yang hadir di bawah rata-rata:");
        boolean 
        
        DiBawahRataRata = false;
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hadir[i] < rataRataHadir) {
                System.out.println("Siswa ke-" + (i + 1) + "(" +hadir[i]+")");
                DiBawahRataRata = true;
            }
        }
       
    }
}
