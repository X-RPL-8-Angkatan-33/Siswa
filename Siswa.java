//Object Class
public class Siswa {
    private int id;
    private String nama;
    private double ipk;

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

    //method Setter/Mutator-->untuk mengubah nilai
    //access_modifier tipe_data nama_method
    public void setID(int id) {
        this.id = id;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setIPK(double ipk) {
        this.ipk = ipk;
    }
}