import java.util.Scanner;
public class Laptop {

    private String nama;
    private int harga;
    private int jumlah;
    
    public Laptop(String nama,int harga,int jumlah){
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
    public String getHarga(){
        return harga;
    }
    public String getJumlah(){
        return jumlah;
    }
    public double hitumgEstimasi(){
        return harga * jumlah;
    }
    public void LaptoDdemo(){
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Estimasi Pemasukan : " + hitumgEstimasi());
    }
}
class LaptopGaming extends Laptop {
    private String merk;
    private String layar;

    public LaptopGaming(String nama,int harga,int jumlah,String merk,String layer){
        super(nama, harga, jumlah);
        this.merk = merk;
        this.layar = layar;
    }
    public void setData(String merk,String layer){
        this.merk = merk;
        this.layar = layar;
    }
    public String getMerk(){
        return merk;
    }
    public String getLayar(){
        return layar;
    }
    @Override
    public void LaptoDdemo(){
        System.out.println("Nama : " + getNama());
        System.out.println("Merk : " + getMerk());
        System.out.println("Layar : " + getLayar());
        System.out.println("Harga : " + getHarga());
        System.out.println("Jumlah : " + getJumlah());
        System.out.println("Estimasi Pemasukan : " + hitumgEstimasi());
        System.out.println("===============================================");
    }
}
public class Dispay {
    public static void main(String[] args) {
        LaptopGaming laptop1 = new LaptopGaming("Victus-16", 20000000, 10, "HP", "IPS FullHD");
        LaptopGaming laptop2 = new LaptopGaming("LOQ", 16000000, 90, "Lenovo", "IPS FullHD");
        LaptopGaming laptop3 = new LaptopGaming("ROG ZHEPIRUS", 40000000, 14, "Asus", "Oled FullHD");
        laptop1.LaptoDdemo();
        laptop2.LaptoDdemo();
        laptop3.LaptoDdemo();
    }
}
