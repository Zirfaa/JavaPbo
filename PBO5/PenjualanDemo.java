
class Penjualan{
    private String nama;
    private int jumlah;
    private String kode;
    private float harga;

    public void setData(String nama, int jumlah,String kode,float harga){
        this.nama = nama;
        this.harga = harga;
        this.kode = kode;
        this.jumlah = jumlah;
    }
    public float getPembelian(){
        return harga*jumlah;
    }
    public String getBonus(){
        if(getPembelian() >= 500000 && jumlah > 5){
            return "Mendapatkan Setrika";
        }
        else if(getPembelian() >= 100000 && jumlah > 3){
            return "Mendapatkan Payung";
        }
    
        else if(getPembelian() >= 50000 && jumlah > 2){
            return "Mendapatkan Ballpoint";
        }
        else{
            return "Anda tidak dapat bonus";
        }
    }
    public void cetakNota(){
        System.out.println("Nota Pembelian");
        System.out.println("kode Barang : " + kode);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Jumlah Barang : " + jumlah);
        System.out.println("Harga Barang : "+ harga);
        System.out.println("Jumlah Pembelian : " + getPembelian());
        System.out.println("Bonus anda : " + getBonus());
        System.out.println("Nota Pembelian");
    }
}

public class PenjualanDemo {
    public static void main(String[] args) {
        Penjualan penjualan1 = new Penjualan();
        penjualan1.setData("Sandal", 20, "P01", 25000);
        penjualan1.cetakNota();
    }
}
