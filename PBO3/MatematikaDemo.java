
package PBO3;
import java.util.Scanner;
public class MatematikaDemo {
    public static void main(String[] args) {
        Matematika hitung = new Matematika();

        Scanner input = new Scanner(System.in);

        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukan Pilihan : ");
        int Pilihan = input.nextInt();

        System.out.print("Masukan Nilai a : ");
        double nilaia = input.nextDouble();
        System.out.print("Masukan Nilai b : ");
        double nilaib = input.nextDouble();

        if(Pilihan == 1){
            System.out.print("Penjumlahan "+ nilaia + " dan "+nilaib + " adalah : " + hitung.Penjumlahan(nilaia,nilaib));
        }

        else if(Pilihan == 2){
            System.out.print("Pengurangan "+ nilaia + " dan "+nilaib + " adalah : "+ hitung.Pengurangan(nilaia,nilaib));
        }

        else if(Pilihan == 3){
            System.out.print("Perkalian "+ nilaia + " dan "+nilaib + " adalah : "+ hitung.Perkalian(nilaia,nilaib));
        }

        else if(Pilihan == 4){
            System.out.print("Pembagian "+ nilaia + " dan "+nilaib + " adalah : "+ hitung.Pembagian(nilaia,nilaib));
        }
}
}
