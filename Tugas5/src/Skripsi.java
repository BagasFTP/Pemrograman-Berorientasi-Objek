public class Skripsi extends Buku {
    String NPM;

        Skripsi (String Judul, String Penerbit, int Tahun, String Penulis, String NPM){
        this.Judul = Judul;
        this.Penerbit = Penerbit;
        this.Tahun = Tahun;
        this.Penulis = Penulis;
        this.NPM = NPM;
    }

        Skripsi (){
            
        }

        public String toString(){
            return "Judul : " + Judul + " , Penerbit : " + Penerbit + ", Tahun : " + Tahun + ", Penulis : " + Penulis + ", NPM : " + NPM ;
        }
}
