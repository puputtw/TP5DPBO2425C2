# TP5DPBO2425C2

# Janji
Saya Putri Ramadhani dengan NIM 2410975 mengerjakan Tugas Praktikum 4 dalam mata kuliah Desain dan Pemrograman Berbasis Objek (DPBO).
Dengan ini saya menyatakan bahwa saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin

# Desain Program:

Program ini menggunakan koneksi database ke MySQL untuk mengelola data produk. Terdapat dua file utama yaitu
Database.java
menyediakan fungsi selectQuery() untuk SELECT dan insertUpdateDeleteQuery() untuk INSERT, UPDATE, DELETE

Lalu adda ProductMenu.java yang mengatur dari tombol:
-Add, menambahkan produk
-Update, mengubah data produk yang dipilih
-Delete, menghapus data produk
-Cancel, ,mengosongkan atau membatalkan data

Program memiliki 5 atribut utama dalam struktur data produk:
id → kode unik dari produk
nama → nama barang elektronik
harga → harga barang
kategori → kategori barang
kondisi → atribut yang menyatakan apakah barang baru atau bekas

# Alur Program:


-Saat program dijalankan, akan muncul jendela utama dengan form input dan tabel produk.
-user dapat add data, update dan delete melalui tombol yang tersedia
-data atau perubahan ata akan disimpan dan diperbarui di database
-jika ada kolom input yang kosong saat insert/update maka akan menampilkan error atau pesan "tidak boleh ada kolom input yang kosong
-jika user memasukkan data dengan id yang sudah ada maka akan menampilkan pesan eror yaitu "id sudah digunakan"
-Semua data produk ditampilkan dalam tabel (JTable) dan selalu disinkronkan dengan isi database MySQL.
-Tombol Cancel digunakan untuk mengosongkan semua field input agar siap diisi data baru.

# Bukti Dokumentasi:

(Dokumentasi/buktii%20tp5.mp4)

