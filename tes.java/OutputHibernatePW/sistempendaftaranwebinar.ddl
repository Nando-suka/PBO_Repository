CREATE TABLE Webinar (id int(10) NOT NULL AUTO_INCREMENT, nama_webinar varchar(30) NOT NULL UNIQUE, kapasitas int(1) NOT NULL, sisa_kapasitas int(1) NOT NULL, tanggal_pendaftaran date NOT NULL, Jenis_Webinarid int(3) NOT NULL, PRIMARY KEY (id)) ENGINE=InnoDB;
CREATE TABLE Peserta (id int(11) NOT NULL AUTO_INCREMENT, nama_peserta varchar(30) NOT NULL, jenis_kelamin char(1) NOT NULL, tanggal_lahir date NOT NULL, Webinarid int(10) NOT NULL, PRIMARY KEY (id)) ENGINE=InnoDB;
CREATE TABLE Jenis_Webinar (id int(3) NOT NULL AUTO_INCREMENT, jenis_webinar varchar(20) NOT NULL UNIQUE, biaya int(10) NOT NULL, durasi int(1) NOT NULL, deskripsi_jenis varchar(30) NOT NULL, PRIMARY KEY (id)) ENGINE=InnoDB;
ALTER TABLE Peserta ADD CONSTRAINT FKPeserta588685 FOREIGN KEY (Webinarid) REFERENCES Webinar (id);
ALTER TABLE Webinar ADD CONSTRAINT FKWebinar389568 FOREIGN KEY (Jenis_Webinarid) REFERENCES Jenis_Webinar (id);
