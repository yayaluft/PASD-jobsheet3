public class DataDosen10 {
    public void dataSemuaDosen(Dosen10[] arrayOfDOsen) {
        System.out.println("DATA SEMUA DOSEN");
        for (int i = 0; i < arrayOfDOsen.length; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            arrayOfDOsen[i].CetakInfo();
        }
    }

    public void jmlhDosenJenisKelamin(Dosen10[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("JUMLAH DOSEN PER JENIS KELAMIN");
        System.out.println("Pria    :" + pria);
        System.out.println("Wanita  : " + wanita);
        System.out.println("---------------------------");
    }

    public void rataUsiaDosenJenisKelamin(Dosen10[] arrayOfDosen) {
        int totalUsiaPria = 0;
        int totalUsiaWanita = 0;
        int jmlhPria = 0, jmlhWanita = 0;

        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].jenisKelamin) {
                totalUsiaPria += arrayOfDosen[i].usia;
                jmlhPria++;
            } else {
                totalUsiaWanita += arrayOfDosen[i].usia;
                jmlhWanita++;
            }
        }

        System.out.println("RATA-RATA USIA DOSEN PER JENIS KELAMIN");
        if (jmlhPria > 0) {
            System.out.println("Rata-rata usia Pria: " + (double) totalUsiaPria / jmlhPria + " tahun");
        } else {
            System.out.println("Tidak ada dosen pria.");
        }
        if (jmlhWanita > 0) {
            System.out.println("Rata-rata usia Wanita: " + (double) totalUsiaWanita / jmlhWanita + " tahun");
        } else {
            System.out.println("Tidak ada dosen wanita.");
        }
        System.out.println("---------------------------");
    }

    public void dosenTua(Dosen10[] arrayOfDosen) {
        Dosen10 palingTua = arrayOfDosen[0];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia > palingTua.usia)
                palingTua = arrayOfDosen[i];

        }
        System.out.println("DATA DOSEN PALING TUA");
        palingTua.CetakInfo();
        System.out.println("---------------------------");
    }

    public void dosenMuda(Dosen10[] arrayOfDosen) {
        Dosen10 palingMuda = arrayOfDosen[0];
        for (int i = 0; i < arrayOfDosen.length; i++) {
            if (arrayOfDosen[i].usia < palingMuda.usia)
                palingMuda = arrayOfDosen[i];
        }
        System.out.println("DATA DOSEN PALING MUDA");
        palingMuda.CetakInfo();
        System.out.println("---------------------------");
    }
}
