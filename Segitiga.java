import java.util.Scanner;
public class Segitiga {
    public static void main(String[] args) 
    {
        Scanner pilih = new Scanner(System.in);

            System.out.print("Masukan nilai Tinggi : ");
            int tinggi = pilih.nextInt();

            System.out.print("Masukan nilai Alas : ");
            int alas = pilih.nextInt();

            System.out.println("Input Keliling");

            System.out.print("Sisi Pertama : ");
            int sisi1 = pilih.nextInt();

            System.out.print("Sisi Kedua : ");
            int sisi2 = pilih.nextInt();

            System.out.print("Sisi Ketiga : ");
            int sisi3 = pilih.nextInt();

            System.out.println("Tinggi : " + tinggi);
            System.out.println("Alas : " + alas);
            Double luas = 0.5 * tinggi * alas;
            int kel = sisi1 + sisi2 + sisi3;
            
            System.out.println("Luas Segitiga : " + luas);            
            System.out.println("Keliling Segitiga : " + kel);            

            
    }
}
