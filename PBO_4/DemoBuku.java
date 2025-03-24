package PBO_4;
class Buku{
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahunTerbit;
    Buku(String judul, String pengarang, String penerbit, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }
    public void cetakBuku(){
        System.out.println("(" + judul + ", " + pengarang + ", " + penerbit + ", " + tahunTerbit + ")");
    }
}

public class DemoBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        buku1.cetakBuku();
        buku2.cetakBuku();
    }
}
