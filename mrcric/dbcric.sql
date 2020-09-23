-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 04, 2018 at 07:00 AM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbcric`
--

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `itemno` varchar(4) NOT NULL,
  `item` varchar(400) NOT NULL,
  `trademark` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `itemtransaction`
--

CREATE TABLE `itemtransaction` (
  `transno` int(11) NOT NULL,
  `ordno` int(10) DEFAULT NULL,
  `itemno` varchar(4) NOT NULL,
  `uprice` decimal(9,2) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `qty_issued` int(6) NOT NULL,
  `qty_rec` int(6) NOT NULL,
  `remarks` varchar(500) DEFAULT NULL,
  `batch` varchar(50) DEFAULT NULL,
  `date_add` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `titem`
--

CREATE TABLE `titem` (
  `itemno` varchar(4) NOT NULL,
  `uprice` decimal(9,2) NOT NULL,
  `price` decimal(8,2) NOT NULL,
  `qty_issued` int(6) NOT NULL,
  `batch` varchar(160) DEFAULT NULL,
  `user` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(10) NOT NULL,
  `password` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `password`) VALUES
('admin', '123'),
('user1', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `itemtransaction`
--
ALTER TABLE `itemtransaction`
  ADD PRIMARY KEY (`transno`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `itemtransaction`
--
ALTER TABLE `itemtransaction`
  MODIFY `transno` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
