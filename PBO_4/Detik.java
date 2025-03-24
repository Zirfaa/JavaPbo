package PBO_4;
import java.util.Scanner;
public class Detik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Detik Untuk dikonversi : ");
        double detik = input.nextDouble();
        double jam = detik / 3600;
        double menit = detik / 60;
        double hari = detik / 86400;
        System.out.println("Detik : " + detik);
        System.out.println("Menit : " + menit);
        System.out.println("Jam : " + jam);
        System.out.println("Hari : " + hari);
    }
    
}