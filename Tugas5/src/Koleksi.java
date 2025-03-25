public class Koleksi {
    String Judul;
    String Penerbit;
    int Tahun;

    Koleksi(String Judul, String Penerbit, int Tahun){
        this.Judul = Judul;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
    }

    Koleksi (){

    }

    public String toString(){
        return "Judul" + Judul + ", Penerbit" + Penerbit + ", Tahun" + Tahun;
    }

}
