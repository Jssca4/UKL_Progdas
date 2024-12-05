import java.util.Scanner;

public class Mudah {
    public static void main(String[] args) {

       
        Scanner s = new Scanner (System.in);
        System.out.println("Masukkan total belanja anda : ");
        double totalBelanja = s.nextDouble();

       
        double totalBayar=totalBelanja;
        double diskon = 0;
        if (totalBelanja < 100000){
            System.out.print("Anda tidak mendapatkan diskon");
        }else if(totalBelanja >=100000 && totalBelanja <=200000){
            diskon=0.10;   
            
        }else if (totalBelanja>200000){
            diskon=0.20;
            
        }

        double jumlahDiskon = totalBelanja*diskon;
        totalBayar = totalBelanja-jumlahDiskon;
          
        System.out.println("Total Belanja Anda Sebesar " + totalBelanja);
        System.out.println("Selamat Anda Mendapat Diskon Sebesar : Rp. " + jumlahDiskon);
        System.out.println("Total Belanja Yang Harus Anda Bayar Sejumlah: Rp. " + totalBayar);
        }
    }
    

