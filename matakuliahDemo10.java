import java.util.Scanner;

public class matakuliahDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam;
    
        System.out.print("Masukkan jumlah Matakuliah: ");
        int n = sc.nextInt();
        System.out.println("--------------------");
        sc.nextLine();

        matakuliah10[] arrayOfMatakuliah = new matakuliah10[n];
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan Data MataKuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = sc.nextLine();
            System.out.print("Nama      : ");
            nama = sc.nextLine();
            System.out.print("SKS       : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam: ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------");

            arrayOfMatakuliah[i] = new matakuliah10(kode, nama, sks, jumlahJam);
            arrayOfMatakuliah[i].tambahData(kode, nama, sks, jumlahJam);

        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data MataKuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
