package PBO6;
import java.util.Scanner;
public class Faktorial{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Bilangan Faktorial : ");
        int bilangan = input.nextInt();
        int hasil=1;
        System.out.println(bilangan + "! : ");
        for(int i=1; i<=bilangan; i++){
            System.out.println(i+" X "+hasil + " = "+ i*hasil);
            hasil *= i;
        }
        System.out.println(hasil);
    }


}