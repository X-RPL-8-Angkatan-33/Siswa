//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
       //object
       Siswa lia = new Siswa(); 
       Siswa andi = new Siswa();
       //object dgn constructor parameter
       Siswa via = new Siswa(890, "Via Vallen", 70.5);
       
       //mengubah nilai variabel
       lia.id = 12345;
       lia.nama = "Aprilia";
       lia.ipk = 90;
       System.out.println(lia.id);
       System.out.println(lia.nama);
       System.out.println(lia.ipk);
       
       System.out.println(andi.nama);
    }
}
