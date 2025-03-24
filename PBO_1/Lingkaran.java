import java.util.Scanner;

public class Lingkaran {

    
    public static void main(String[] args) 
    {
        Scanner pilih = new Scanner(System.in);

            System.out.print("Masukan nilai Jari-Jari : ");
            int jari = pilih.nextInt();

            System.out.println("Jari-Jari : " + jari);
            Double luas =3.14 * jari * jari;
            Double kel = 2 * 3.14 * jari;
            System.out.println("Luas Lingkaran : " + luas);
            System.out.println("Keliling Lingkaran : " + kel);
    }
}
