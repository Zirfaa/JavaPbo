package PBO6;
import java.util.Scanner;
public class Deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bilangan : " );
        int bilangan = input.nextInt();
        int angka=1;
        System.out.print("Baris : ");
        int baris = input.nextInt();

        for(int i=1; i<=bilangan ;i++){

                System.out.print(angka++ + " ");
            if(i%baris==0){
            System.out.println();
        }
        }
    }
}
