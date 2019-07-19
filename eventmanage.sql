-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2017 at 09:25 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `eventmanage`
--

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE IF NOT EXISTS `event` (
  `id` int(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `location` varchar(50) NOT NULL,
  `eventduration` varchar(50) NOT NULL,
  `minimum_number_of_attendies` varchar(50) NOT NULL,
  `minimum_number_of_thresold` varchar(50) NOT NULL,
  `event_description` varchar(300) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`id`, `name`, `location`, `eventduration`, `minimum_number_of_attendies`, `minimum_number_of_thresold`, `event_description`) VALUES
(56897, 'bridal', 'Sylheat', '3 Hour', '50', '15', 'welcome'),
(66600, 'breakup', 'Dhaka', '1 Hour', '20', '10', 'whose break mind'),
(123456, 'sunno', 'Mymensingh', '2 Hour', '30', '50%', 'hii'),
(852357, 'dinarkotha', 'Sylheat', '3 Hour', '50', '25', 'islamic alochona hobe');

-- --------------------------------------------------------

--
-- Table structure for table `invaitation`
--

CREATE TABLE IF NOT EXISTS `invaitation` (
  `id` int(11) NOT NULL,
  `Name` int(11) NOT NULL,
  `Email` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `registation`
--

CREATE TABLE IF NOT EXISTS `registation` (
  `id` varchar(10) NOT NULL,
  `Name` varchar(25) NOT NULL,
  `Email` varchar(25) NOT NULL,
  `Password` varchar(25) NOT NULL,
  `Location` varchar(25) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Name` (`Name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registation`
--

INSERT INTO `registation` (`id`, `Name`, `Email`, `Password`, `Location`) VALUES
('00159128', 'rakib', 'rakib@gmail.com', '123', 'Mymensingh'),
('0066600', 'qwe', '1230@gmail.com', '5460', 'Khulna'),
('123456', 'dilruba', 'dilrubaislam@gmail.com', '1230', 'Dhaka'),
('56897', 'mosa', 'mosa@gmail.com', '789', 'Sylheat'),
('852357', 'islam', 'islam@gmail.com', '123789', 'Mymensingh');

-- --------------------------------------------------------

--
-- Table structure for table `time`
--

CREATE TABLE IF NOT EXISTS `time` (
  `id` varchar(10) NOT NULL,
  `saturday` varchar(20) NOT NULL,
  `sunday` varchar(20) NOT NULL,
  `monday` varchar(20) NOT NULL,
  `tuesday` varchar(20) NOT NULL,
  `wetnesday` varchar(20) NOT NULL,
  `thusday` varchar(20) NOT NULL,
  `friday` varchar(20) NOT NULL,
  `description` varchar(300) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `time`
--

INSERT INTO `time` (`id`, `saturday`, `sunday`, `monday`, `tuesday`, `wetnesday`, `thusday`, `friday`, `description`) VALUES
('00159128', '3:01pm_6:00pm', '3:01pm_6:00pm', 'All are Available', 'Not Available', '9:00am_12:00am', '12:01pm_3:00pm', '9:01pm_12:00pm', 'i am a student of NCC'),
('0066600', '6:01pm_9:00pm', '9:00am_12:00am', 'Not Available', 'Not Available', '9:01pm_12:00pm', '9:00am_12:00am', 'All are Available', 'hellow'),
('123456', '9:01pm_12:00pm', '9:01pm_12:00pm', '9:01pm_12:00pm', '9:01pm_12:00pm', '9:01pm_12:00pm', '9:01pm_12:00pm', '9:01pm_12:00pm', 'Jogonnath University'),
('56897', '9:00am_12:00am', '12:01pm_3:00pm', '3:01pm_6:00pm', '9:00am_12:00am', '6:01pm_9:00pm', 'All are Available', 'Not Available', 'hellow'),
('852357', '3:01pm_6:00pm', '9:01pm_12:00pm', 'All are Available', '6:01pm_9:00pm', 'Not Available', 'Not Available', 'All are Available', 'hellow Muslims');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
