//Driver Class
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inputkan nama lengkap: ");
        String nama = in.nextLine();
        System.out.println("Inputkan ID Siswa: ");
        int id = in.nextInt();
        System.out.println("Inputkan IPK Siswa :");
        double ipk = in.nextDouble();
        // object
        Siswa lia = new Siswa();
        Siswa andi = new Siswa();
        // object dgn constructor parameter
        Siswa via = new Siswa(890, "Via Vallen", 70.5);
        Siswa dana = new Siswa(id, nama, ipk);

        // mengubah nilai variabel
        lia.setID(1234);
        lia.setNama("Aprilia");
        lia.setIPK(90);
        System.out.println(lia.id);
        System.out.println(lia.nama);
        System.out.println(lia.ipk);

        System.out.println(andi.nama);
        System.out.println(dana.id);
        System.out.println(dana.nama);
        System.out.println(dana.ipk);

        in.close();
    }
}
