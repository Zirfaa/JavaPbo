class Mobil{
    String warna;
    int thnProduksi;

    public void hidupkanMobil(){
        System.out.println("Ngengg");
    }
    public void matikanMobil(){
        System.out.println("Pesss");
    }
    public void ubahGigi(){
        System.out.println("Ceklek");
    }
}

public class MobilDemo {
    public static void main(String[] args) {
        
    Mobil mobil1 = new Mobil();

    mobil1.warna ="Hitam";
    mobil1.thnProduksi = 2020;

    System.out.println("Warna Mobil : " + mobil1.warna);
    System.out.println("Tahun Produksi : " + mobil1.thnProduksi);
    System.out.print("Hidupkan Mobil : ");
    mobil1.hidupkanMobil();
    System.out.print("Matikan Mobil : ");
    mobil1.matikanMobil();
    System.out.print("Ubah Gigi : ");
    mobil1.ubahGigi();
}
}