import java.util.Scanner;

public class Buah {

    private String nama;
    private int harga;
    private int jumlah;
    
    public Buah(String nama,int harga,int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public void setData(String nama,int harga,int jumlah){
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    public String getNama(){
        return nama;
    }
    public int getHarga(){
        return harga;
    }
    public int getJumlah(){
        return jumlah;
    }
    public double hitumgEstimasi(){
        return harga * jumlah;
    }
    public void BuahDemo(){
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Estimasi Pemasukan : " + hitumgEstimasi());
    }
}
class BuahBesar extends Buah {
    private double berat;

    public BuahBesar(String nama,int harga,int jumlah,double berat){
        super(nama, harga, jumlah);
        this.berat = berat;
    }
    public void setData(double berat){
        this.berat = berat;
    }

    public double getberat(){
        return berat;
    }
    @Override
    public void BuahDemo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Harga : " + getHarga());
        System.out.println("Jumlah : " + getJumlah());
        System.out.println("berat per Buah : " + getberat());
        System.out.println("Estimasi Pemasukan : " + hitumgEstimasi());
        System.out.println("===============================================");
    }
}
class Tampil {
    public static void main(String[] args) {
        BuahBesar semangka = new BuahBesar("Semangka", 20000, 10,4.10);
        BuahBesar melon = new BuahBesar("Melon", 30000, 40,3.91 );
        BuahBesar durian = new BuahBesar("Durian", 100000, 14,5.5);
        semangka.BuahDemo();
        melon.BuahDemo();
        durian.BuahDemo();
    }
}

