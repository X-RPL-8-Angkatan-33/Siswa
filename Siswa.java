//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;

    //Construstor
    //method yg bernama sama dgn nama Class
    public Siswa() {
        id = 0;
        nama = "Kosong";
        ipk = 0;
    }

    //Constructor Parameter
    public Siswa(int id, String nama, double ipk) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.ipk = ipk;
    }
}