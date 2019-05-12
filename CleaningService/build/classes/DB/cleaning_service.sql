-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2019 at 07:28 AM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cleaning_service`
--

-- --------------------------------------------------------

--
-- Table structure for table `bekerja`
--

CREATE TABLE `bekerja` (
  `Pegawai` int(20) NOT NULL,
  `Jadwal` varchar(20) NOT NULL,
  `Ref` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `gudang`
--

CREATE TABLE `gudang` (
  `No_Gudang` int(5) NOT NULL,
  `Nama_Gedung` varchar(25) NOT NULL,
  `No_Lantai` int(2) NOT NULL,
  `Kode_Alat` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `Pekerjaan` varchar(20) NOT NULL,
  `Time` time NOT NULL,
  `Hari` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`Pekerjaan`, `Time`, `Hari`) VALUES
('Mengepel', '00:00:06', 'JUMAT'),
('Mengepel', '00:00:06', 'KAMIS'),
('Mengepel', '00:00:06', 'RABU'),
('Mengepel', '00:00:06', 'SABTU'),
('Mengepel', '00:00:06', 'SELASA'),
('Mengepel', '00:00:09', 'JUMAT'),
('Mengepel', '00:00:09', 'KAMIS'),
('Mengepel', '00:00:09', 'RABU'),
('Mengepel', '00:00:09', 'SABTU'),
('Mengepel', '00:00:09', 'SELASA'),
('Mengepel', '00:00:09', 'SENIN'),
('Mengepel', '00:00:16', 'JUMAT'),
('Mengepel', '00:00:16', 'KAMIS'),
('Mengepel', '00:00:16', 'RABU'),
('Mengepel', '00:00:16', 'SABTU'),
('Mengepel', '00:00:16', 'SELASA'),
('Mengepel', '00:00:16', 'SENIN'),
('Mengepel', '06:00:00', 'SENIN'),
('Menyapu', '00:00:06', 'JUMAT'),
('Menyapu', '00:00:06', 'KAMIS'),
('Menyapu', '00:00:06', 'RABU'),
('Menyapu', '00:00:06', 'SABTU'),
('Menyapu', '00:00:06', 'SELASA'),
('Menyapu', '00:00:09', 'JUMAT'),
('Menyapu', '00:00:09', 'KAMIS'),
('Menyapu', '00:00:09', 'RABU'),
('Menyapu', '00:00:09', 'SABTU'),
('Menyapu', '00:00:09', 'SELASA'),
('Menyapu', '00:00:16', 'JUMAT'),
('Menyapu', '00:00:16', 'KAMIS'),
('Menyapu', '00:00:16', 'RABU'),
('Menyapu', '00:00:16', 'SABTU'),
('Menyapu', '00:00:16', 'SELASA'),
('Menyapu', '00:00:16', 'SENIN'),
('Menyapu', '06:00:00', 'SENIN'),
('Merapihkan Kelas', '00:00:06', 'JUMAT'),
('Merapihkan Kelas', '00:00:06', 'KAMIS'),
('Merapihkan Kelas', '00:00:06', 'RABU'),
('Merapihkan Kelas', '00:00:06', 'SABTU'),
('Merapihkan Kelas', '00:00:06', 'SELASA'),
('Merapihkan Kelas', '00:00:09', 'JUMAT'),
('Merapihkan Kelas', '00:00:09', 'KAMIS'),
('Merapihkan Kelas', '00:00:09', 'RABU'),
('Merapihkan Kelas', '00:00:09', 'SABTU'),
('Merapihkan Kelas', '00:00:09', 'SELASA'),
('Merapihkan Kelas', '00:00:09', 'SENIN'),
('Merapihkan Kelas', '00:00:16', 'JUMAT'),
('Merapihkan Kelas', '00:00:16', 'KAMIS'),
('Merapihkan Kelas', '00:00:16', 'RABU'),
('Merapihkan Kelas', '00:00:16', 'SABTU'),
('Merapihkan Kelas', '00:00:16', 'SELASA'),
('Merapihkan Kelas', '00:00:16', 'SENIN'),
('Merapihkan Kelas', '06:00:00', 'SENIN');

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `Nama_Gedung` varchar(25) NOT NULL,
  `No_Lantai` int(2) NOT NULL,
  `Nama_Ruang` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lokasi`
--

INSERT INTO `lokasi` (`Nama_Gedung`, `No_Lantai`, `Nama_Ruang`) VALUES
('A', 1, '01'),
('A', 1, '02'),
('A', 1, '03'),
('A', 1, '10'),
('A', 1, 'PRODI'),
('A', 1, 'SLSR'),
('A', 1, 'WC'),
('A', 2, '01'),
('A', 2, '02'),
('A', 2, 'PRODI'),
('A', 2, 'SLSR'),
('A', 2, 'WC'),
('A', 3, 'PRODI'),
('A', 3, 'PRPS'),
('A', 3, 'SLSR'),
('A', 4, 'RFTOP'),
('B', 1, '01'),
('B', 1, '02'),
('B', 1, 'PRODI'),
('B', 1, 'SLSR'),
('B', 1, 'WC'),
('B', 2, '01'),
('B', 2, '02'),
('B', 2, 'PRODI'),
('B', 2, 'PRPS'),
('B', 2, 'SLSR'),
('B', 2, 'WC'),
('B', 3, '01'),
('B', 3, '02'),
('B', 3, 'PRODI'),
('B', 3, 'SLSR'),
('B', 3, 'WC'),
('B', 4, 'RFTOP'),
('C', 1, '01'),
('C', 1, '02'),
('C', 1, '03'),
('C', 1, 'LAB'),
('C', 1, 'PRODI'),
('C', 1, 'SLSR'),
('C', 1, 'WC'),
('C', 2, '01'),
('C', 2, '02'),
('C', 2, '03'),
('C', 2, 'LAB'),
('C', 2, 'PRODI'),
('C', 2, 'SLSR'),
('C', 2, 'WC'),
('C', 3, 'AULA'),
('C', 3, 'LAB'),
('C', 3, 'PRODI'),
('C', 3, 'WC'),
('C', 4, 'RFTOP'),
('D', 1, '01'),
('D', 1, '02'),
('D', 1, '03'),
('D', 1, 'PRODI'),
('D', 1, 'SLSR'),
('D', 1, 'WC'),
('D', 2, '01'),
('D', 2, '02'),
('D', 2, '03'),
('D', 2, 'PRODI'),
('D', 2, 'SLSR'),
('D', 2, 'WC'),
('D', 3, '01'),
('D', 3, '02'),
('D', 3, '03'),
('D', 3, 'PRODI'),
('D', 3, 'SLSR'),
('D', 3, 'WC'),
('D', 4, 'RFTOP'),
('E', 0, '01'),
('E', 0, '02'),
('E', 0, '03'),
('E', 0, 'SLSR'),
('E', 0, 'WC'),
('E', 1, '01'),
('E', 1, '02'),
('E', 1, 'SLSR'),
('E', 1, 'WC'),
('E', 2, '01'),
('E', 2, 'SLSR'),
('E', 2, 'WC'),
('E', 3, '01'),
('E', 3, '02'),
('E', 3, 'SLSR'),
('E', 3, 'WC'),
('E', 4, 'RFTOP'),
('GKU', 1, 'ALL'),
('GKU', 2, 'ALL'),
('GKU', 3, 'ALL'),
('LABTEK', 1, 'LAB'),
('LABTEK', 2, 'LAB'),
('LABTEK', 3, 'LAB');

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `NIK` int(20) NOT NULL,
  `Nama_Pegawai` varchar(50) NOT NULL,
  `Password` varchar(150) NOT NULL,
  `Alamat_Pegawai` varchar(350) NOT NULL,
  `No_Telp` int(15) NOT NULL,
  `Jenis_Kelamin` enum('L','P') NOT NULL,
  `Usia` int(3) NOT NULL,
  `Kode_Alat` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`NIK`, `Nama_Pegawai`, `Password`, `Alamat_Pegawai`, `No_Telp`, `Jenis_Kelamin`, `Usia`, `Kode_Alat`) VALUES
(12345, 'Coriza', 'qwert', 'Jl raden saleh', 821, 'P', 70, 'S001'),
(123123123, 'Yapi', '123123123', 'JL. Sukajadi', 811928123, 'P', 24, 'P001'),
(123919289, 'Robby', '123919289', 'Jl. Sayur Kol', 891283292, 'P', 35, 'K002'),
(696912029, 'A. Budrahman', '696912029', 'Jl. Arab Butek', 89201292, 'P', 25, 'B001'),
(832754255, 'Egi Rachma', '832754255', 'Jl. Antar Sari', 723716282, 'P', 24, 'K001'),
(837292942, 'M. Rizki Ramzxx', '837292942', 'Jl. Kemiling Lingkaran', 76462826, 'P', 24, 'S002');

-- --------------------------------------------------------

--
-- Table structure for table `peralatan`
--

CREATE TABLE `peralatan` (
  `Nama_Alat` varchar(25) NOT NULL,
  `Kode_Alat` varchar(5) NOT NULL,
  `Jumlah_Alat` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peralatan`
--

INSERT INTO `peralatan` (`Nama_Alat`, `Kode_Alat`, `Jumlah_Alat`) VALUES
('Busa', 'B001', 100),
('Kemoceng', 'K001', 5),
('Kamper', 'K002', 500),
('Lap', 'L001', 200),
('Pel', 'P001', 30),
('Pengharum', 'P002', 100),
('Sapu', 'S001', 50),
('Sikat', 'S002', 10),
('Sabun', 'S003', 600);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bekerja`
--
ALTER TABLE `bekerja`
  ADD PRIMARY KEY (`Ref`),
  ADD KEY `Pegawai` (`Pegawai`,`Jadwal`),
  ADD KEY `Jadwal` (`Jadwal`);

--
-- Indexes for table `gudang`
--
ALTER TABLE `gudang`
  ADD PRIMARY KEY (`No_Gudang`),
  ADD KEY `Nama_Gedung` (`Nama_Gedung`),
  ADD KEY `Kode_Alat` (`Kode_Alat`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`Pekerjaan`,`Time`,`Hari`);

--
-- Indexes for table `lokasi`
--
ALTER TABLE `lokasi`
  ADD PRIMARY KEY (`Nama_Gedung`,`No_Lantai`,`Nama_Ruang`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`NIK`),
  ADD KEY `Kode_Alat` (`Kode_Alat`);

--
-- Indexes for table `peralatan`
--
ALTER TABLE `peralatan`
  ADD PRIMARY KEY (`Kode_Alat`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bekerja`
--
ALTER TABLE `bekerja`
  ADD CONSTRAINT `bekerja_ibfk_1` FOREIGN KEY (`Pegawai`) REFERENCES `pegawai` (`NIK`),
  ADD CONSTRAINT `bekerja_ibfk_2` FOREIGN KEY (`Jadwal`) REFERENCES `jadwal` (`Pekerjaan`);

--
-- Constraints for table `gudang`
--
ALTER TABLE `gudang`
  ADD CONSTRAINT `gudang_ibfk_1` FOREIGN KEY (`Nama_Gedung`) REFERENCES `lokasi` (`Nama_Gedung`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `gudang_ibfk_2` FOREIGN KEY (`Kode_Alat`) REFERENCES `peralatan` (`Kode_Alat`);

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`Kode_Alat`) REFERENCES `peralatan` (`Kode_Alat`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
