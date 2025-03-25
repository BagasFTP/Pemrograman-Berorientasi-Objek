public class Buku extends Koleksi {
    String Penulis;

    Buku(String Judul, String Penerbit, int Tahun, String Penulis){
        this.Judul = Judul;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
        this.Penulis = Penulis;
    }

    Buku(){

    }
    
    public String toString(){
        return "Judul : " + Judul + ", Penerbit : " + Penerbit + ", Tahun : " + Tahun + ", Penulis : " + Penulis;
    }
}
