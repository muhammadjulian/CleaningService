-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 04, 2019 at 05:27 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cs`
--

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
  `Time` date NOT NULL,
  `Hari` varchar(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `lokasi`
--

CREATE TABLE `lokasi` (
  `Nama_Gedung` varchar(25) NOT NULL,
  `No_Lantai` int(2) NOT NULL,
  `Nama_Ruang` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
(12345, 'Coriza', 'qwert', 'Jl raden saleh', 821, 'P', 70, 'S001');

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
('Sapu', 'S001', 50);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gudang`
--
ALTER TABLE `gudang`
  ADD PRIMARY KEY (`No_Gudang`),
  ADD KEY `Nama_Gedung` (`Nama_Gedung`);

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
-- Constraints for table `gudang`
--
ALTER TABLE `gudang`
  ADD CONSTRAINT `gudang_ibfk_1` FOREIGN KEY (`Nama_Gedung`) REFERENCES `lokasi` (`Nama_Gedung`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD CONSTRAINT `pegawai_ibfk_1` FOREIGN KEY (`Kode_Alat`) REFERENCES `peralatan` (`Kode_Alat`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
