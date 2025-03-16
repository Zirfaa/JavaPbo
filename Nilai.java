import java.util.Scanner;

    class Hitung{
        String nama;
        String nim;
        double nilaiUts;
        double nilaiUas;
        double nilaiTugas;


        public void hitungNilai(){
        double pnilaiUts = 0.2;
        double pnilaiUas = 0.35;
        double pnilaiTugas = 0.45;
        System.out.println("Nilai Uts Adalah : " + nilaiUts);
        System.out.println("Nilai Uas Adalah : " + nilaiUas);
        System.out.println("Nilai Tugas Adalah : " + nilaiTugas);

        double nilaiAkhir = (nilaiUts * pnilaiUts) + (nilaiUas * pnilaiUas) + (nilaiTugas * pnilaiTugas);
        System.out.println("Nilai Akhir Adalah : "+ nilaiAkhir);
        }
    }
    public class Nilai {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Hitung hitung1 = new Hitung();

            System.out.print("Masukan Nilai UTS : ");
            hitung1.nilaiUts = input.nextDouble();

            System.out.print("Masukan Nilai UAS : ");
            hitung1.nilaiUas = input.nextDouble();

            System.out.print("Masukan Nilai Tugas : ");
            hitung1.nilaiTugas = input.nextDouble();
            hitung1.hitungNilai();
    }
    }

