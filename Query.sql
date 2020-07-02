SQL> CREATE TABLESPACE M_Rafel_06981
  2  datafile 'C:\Kuliah\Praktikum Basis Data\Modul 1\Praktikum\Rafel_06981.dbf'
  3  size 30M;

Tablespace created.

SQL> CREATE USER M_Rafel_06981
  2  IDENTIFIED BY rafel
  3  DEFAULT TABLESPACE M_Rafel_06981
  4  QUOTA 30M ON M_Rafel_06981;

User created.

SQL> GRANT ALL PRIVILEGES TO M_Rafel_06981
  2
SQL> GRANT ALL PRIVILEGES TO Rafel_Daffa_06981;

Grant succeeded.

SQL> conn M_Rafel_06981/rafel
Connected.

SQL> create table Barang
  2  (
  3  Id_barang INTEGER not null,
  4  Nama_barang VARCHAR2(25),
  5  Harga_barang NUMBER(9),
  6  Merk VARCHAR2(20),
  7  Stok NUMBER(5),
  8  Ukuran VARCHAR2(10),
  9  constraint PK_Barang primary key (Id_barang)
  10  );

Table created.

SQL> create table Pelanggan
  2  (
  3  Id_pelanggan INTEGER not null,
  4  Nama_pelanggan VARCHAR2(50),
  5  No_tlp NUMBER(12),
  6  constraint PK_Pelanggan primary key (Id_pelanggan)
  7  );

Table created.

SQL> create table Transaksi
  2  (
  3  Id_Transaksi INTEGER not null,
  4  Id_barang INTEGER,
  5  Id_pelanggan INTEGER,
  6  Total_harga NUMBER(9),
  7  Bayar NUMBER(9),
  8  Kembalian NUMBER(9),
  9  Tanggal_transaksi DATE,
  10  Jumlah_pesan NUMBER(5),
  11  constraint PK_Transaksi primary key (Id_transaksi)
  12  );

Table created.

SQL> alter table Transaksi
  2  add constraint FK_Id_barang FOREIGN KEY (Id_barang)
  3  references Barang(Id_barang)
  2  add constraint FK_Id_pelanggan FOREIGN KEY (Id_pelanggan)
  3  references Barang(Id_pelanggan);

Table altered.


SQL> create sequence Id_barang
  2  minvalue 1
  3  maxvalue 999
  4  start with 1
  5  increment by 1
  6  cache 20m;

Sequence created.

SQL> create sequence Id_pelanggan
  2  minvalue 1
  3  maxvalue 999
  4  start with 1
  5  increment by 1
  6  cache 20m;

Sequence created.

SQL> create sequence Id_transaksi
  2  minvalue 1
  3  maxvalue 999
  4  start with 1
  5  increment by 1
  6  cache 20m;

Sequence created.

SQL> select a.total_harga, a.bayar, a.kembalian, b.nama_pelanggan
  2  from Transaksi a join
  3  Pelanggan b
  4  on a.Id_pelanggan = b.Id_pelanggan
  5  where rownum <= 10;

SQL> select a.Id_transaksi, b.Nama_barang, c.Nama_pelanggan, a.total_harga
  2  from Transaksi a left join Barang b
  3  on a.Id_barang = b.Id_barang
  4  left join Pelanggan c
  5  on a.Id_pelanggan = c.Id_pelanggan
  6  where Id_transaksi <=(select avg(total_harga) from Transaksi);

SQL> select a.Id_transaksi, b.Nama_barang, c.Nama_pelanggan, a.total_harga
    from Transaksi a right join Barang b
    on a.Id_barang = b.Id_barang
    right join Pelanggan c
    on a.Id_pelanggan = c.Id_pelanggan
    where Id_transaksi <=(select count(Id_transaksi) from Transaksi)
    and Id_transaksi > (select min(Id_transaksi) from Transaksi);

SQL> create view List_detail as
  2  select a.total_harga, a.bayar, a.kembalian, b.nama_pelanggan
  3  from Transaksi a join
  4  Pelanggan b
  5  on a.Id_pelanggan = b.Id_pelanggan
  6  ;

SQL> select * from List_detail;

SQL> SELECT * FROM TRANSAKSI JOIN BARANG ON TRANSAKSI.ID_BARANG = BARANG.ID_BARANG JOIN PELANGGAN ON TRANSAKSI.ID_PELANGGAN = PELANGGAN.ID_PELANGGAN;