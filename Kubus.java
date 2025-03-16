import java.util.Scanner;
public class Kubus {
    public static void main(String[] args) 
    {
        Scanner pilih = new Scanner(System.in);

            System.out.print("Masukan nilai Sisi : ");
            int sisi = pilih.nextInt();

            System.out.println("Jari-Jari : " + sisi);
            int luas =6 * sisi * sisi;
            int vol = sisi * sisi * sisi;
            System.out.println("Luas Permukaan Kubus : " + luas);
            System.out.println("Volume Kubus : " + vol);
    }
}


