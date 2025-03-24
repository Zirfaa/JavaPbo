
import java.util.Scanner;

public class Suhu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double hasil = 0;
        String konversi = "";
        System.out.println("1. Kelvin  [C + 273.15]");
        System.out.println("2. Fahrenheit [C * 1.8 + 32]");
        System.out.println("3. Rankine [C * 1.8 + 491.67]");
        System.out.println("4. Delisle [(100 - C) * 1.5]");
        System.out.println("5. Newton [C * 33%]");
        System.out.println("6. Reaumur [C * 0.8]");
        System.out.println("7. Remer [C * 21/40 + 7.5]");
        System.out.print("Masukan Pilihan : ");
        int pilihan = input.nextInt();
        System.out.println("Masukan suhu celcius yang akan dikonversi : ");
        double celcius = input.nextDouble();
        if(pilihan == 1){
            System.out.println("Anda Memilih Kelvin");
            konversi = "Kelvin";
            hasil = celcius + 273.15;
        }
        if(pilihan == 2){
            System.out.println("Anda Memilih Fahrenheit");
            konversi = "Fahrenheit";
            hasil = celcius *1.8 + 32;
        }
        if(pilihan == 3){
            System.out.println("Anda Memilih Rankine");
            konversi = "Rankine";
            hasil = celcius * 1.8 + 491.67;
        }
        if(pilihan == 4){
            System.out.println("Anda Memilih Delisle");
            konversi = "Delisle";
            hasil = (100 - celcius) * 1.5;
        }
        if(pilihan == 5){
            System.out.println("Anda Memilih Newton");
            konversi = "Newton";
            hasil = celcius * 0.33;
        }
        if(pilihan == 6){
            System.out.println("Anda Memilih Reaumur");
            konversi = "Reaumur";
            hasil = celcius * 0.8;
        }
        if(pilihan == 7){
            System.out.println("Anda Memilih Remer");
            konversi = "Remer";
            hasil = celcius * 0.525 + 7.5;
        }
        System.out.println("Celcius : " + celcius + "Dikonversi menjadi " + konversi + " : " + hasil);
    }
}
