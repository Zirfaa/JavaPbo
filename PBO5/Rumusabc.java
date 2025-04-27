
import java.util.Scanner;

public class Rumusabc {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nilai a : ");
        int nilaia = input.nextInt();
        System.out.print("Masukan Nilai a : ");
        int nilaib = input.nextInt();
        System.out.print("Masukan Nilai a : ");
        int nilaic = input.nextInt();

        int determinan = (nilaib*nilaib) - 4*nilaia*nilaic;
        System.out.println(determinan);
        if(determinan > 0){
            double hasilx1 = -nilaib+Math.sqrt(determinan)/2*nilaia;
            double hasilx2 = -nilaib-Math.sqrt(determinan)/2*nilaia;
            System.out.println("Hasil X1 : " + hasilx1 + " dan X2 : " + hasilx2);
        }
        if(determinan == 0){
            double hasil = -nilaib/2*nilaia;
            System.out.println("Hasil X : " + hasil);
        }
        if(determinan < 0){
            double hasilx1 = (-nilaib/2*nilaia)+(Math.sqrt(-determinan)/2*nilaia);
            double hasilx2 = (-nilaib/2*nilaia)-(Math.sqrt(-determinan)/2*nilaia);
            System.out.println("Hasil X1 imajiner : " + hasilx1 + "i " + " dan X2 imanjiner : " + hasilx2 + "i");
        }
    }
}
