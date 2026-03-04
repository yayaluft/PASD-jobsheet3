# Praktikum 1

1.  Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!
2. Apa yang dilakukan oleh kode program berikut?
```Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];```
3. Apakah class Mahasiswa memiliki konstruktor?Jika tidak, kenapa bisa dilakukan pemanggilan konstruktur pada baris program berikut?
arrayOfMahasiswa[0] = new Mahasiswa();
4. Apa yang dilakukan oleh kode program berikut?
arrayOfMahasiswa[0] = new Mahasiswa();
arrayOfMahasiswa[0].nim = "244107060033";
arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
arrayOfMahasiswa[0].kelas = "SIB-1E";
arrayOfMahasiswa[0].ipk = (float) 3.75;
5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?

### Jawaban: 
1. Class untuk array of object tidak harus memiliki atribut dan method sekaligus, akan tetapi yang terpenting class tersebut dapat membuat object.
2. Kode tersebut membuat array bernama arrayOfMahasiswa. Akan tetapi kode tersebut hanya membuat tempat array, belum membuat object.
3. CLass Mahasiswa tidak memiliki konstruktor. Namun tetapi bisa dipanggil karena program telah memiliki default constructor.
4. Kode tersebut membuat object Mahasiswa pada index ke-0. Setelah itu mengisi atribut diantara lain nim, nama, kelas, ipk.
5. menggunakan PBO (Pemrograman Berorientasi Objek). Sehingga class Mahasiswa sebagai model data, sedangkan class MahasiswaDemo sebagai class yang menjalankan program.