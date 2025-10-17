# TP5DPBO2425C2

## Janji
Saya **Putri Ramadhani** dengan **NIM 2410975** mengerjakan **Tugas Praktikum 5** dalam mata kuliah **Desain dan Pemrograman Berbasis Objek (DPBO)**.  
Dengan ini saya menyatakan bahwa saya **tidak melakukan kecurangan** seperti yang telah dispesifikasikan.  
Aamiin.

## Desain Program

Program ini menggunakan koneksi database ke **MySQL** untuk mengelola data produk.  
Terdapat dua file utama yaitu:

## Database.java
- Menyediakan fungsi:
  - selectQuery() untuk SELECT dan
  - insertUpdateDeleteQuery() untuk INSERT, UPDATE, DELETE
 Lalu ada
## ProductMenu.java
Mengatur fungsi dari tombol:
- **Add** → menambahkan produk  
- **Update** → mengubah data produk yang dipilih  
- **Delete** → menghapus data produk  
- **Cancel** → mengosongkan atau membatalkan data

Program memiliki **5 atribut utama** dalam struktur data produk:
- `id` → kode unik dari produk  
- `nama` → nama barang elektronik  
- `harga` → harga barang  
- `kategori` → kategori barang  
- `kondisi` → atribut yang menyatakan apakah barang baru atau bekas  

## Alur Program

- Saat program dijalankan, akan muncul jendela utama dengan form input dan tabel produk.  
- User dapat melakukan Add, Update, dan Delete melalui tombol yang tersedia.  
- Data atau perubahan data akan disimpan dan diperbarui di database.  
- Jika ada kolom input yang kosong saat insert/update, maka akan muncul pesan error  
   "tidak boleh ada kolom input yang kosong".  
- Jika user memasukkan ID yang sudah ada, maka akan muncul pesan error  
  "ID sudah digunakan"  
- Semua data produk ditampilkan dalam tabel JTable isi database MySQL.  
- Tombol Cancel digunakan untuk mengosongkan semua field input agar siap diisi data baru.

---

## Bukti Dokumentasi
![](Dokumentasi/buktiitp5.mp4)
