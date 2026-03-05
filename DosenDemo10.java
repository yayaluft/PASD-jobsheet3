import java.util.Scanner;

public class DosenDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int n = sc.nextInt();
        sc.nextLine();
        Dosen10[] arrayOfDosen = new Dosen10[n];
        String dummy;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen10();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama          : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin : ");
            dummy = sc.nextLine();
            arrayOfDosen[i].jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("---------------------------");
        }
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDosen[i].CetakInfo();
        }
    }
}