public class Majalah extends Koleksi {
    String Edisi;

    Majalah (String Judul, String Penerbit, int Tahun, String Edisi){
        this.Judul = Judul;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
        this.Edisi = Edisi;
    }

    Majalah (){
        
    }

    public String toString(){
        return "Judul : " + Judul + ", Penerbit : " + Penerbit + ", Tahun : " + Tahun + ", Edisi : " + Edisi;
    }
}
