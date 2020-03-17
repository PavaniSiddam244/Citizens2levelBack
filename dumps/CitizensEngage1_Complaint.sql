-- MySQL dump 10.13  Distrib 8.0.18, for macos10.14 (x86_64)
--
-- Host: localhost    Database: CitizensEngage1
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Complaint`
--

DROP TABLE IF EXISTS `Complaint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Complaint` (
  `Cid` int(11) NOT NULL,
  `Id` int(11) NOT NULL,
  `Name` varchar(45) DEFAULT NULL,
  `Email` varchar(75) NOT NULL,
  `Category` varchar(45) NOT NULL,
  `CreatedImage` varchar(75) NOT NULL,
  `ClosedImage` varchar(75) DEFAULT 'Not yet Closed',
  `Location` varchar(45) NOT NULL,
  `CreatedDescription` varchar(200) NOT NULL,
  `ClosedDescription` varchar(200) DEFAULT 'NOT YET SOLVED',
  `CreatedAt` datetime NOT NULL,
  `ClosedAt` datetime DEFAULT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`Cid`),
  KEY `Id_idx` (`Id`),
  KEY `Name_idx` (`Name`),
  CONSTRAINT `Id` FOREIGN KEY (`Id`) REFERENCES `user` (`Id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Complaint`
--

LOCK TABLES `Complaint` WRITE;
/*!40000 ALTER TABLE `Complaint` DISABLE KEYS */;
INSERT INTO `Complaint` VALUES (44,3,'Pavani Siddam','pavanisiddam2k@gmail.com','Water','water4.jpg','waterclean4.jpg','Nizampet','Water is leaking near the metro station ','Water is not leaking and is solved','2020-03-02 09:35:09','2020-03-02 09:56:10','Closed'),(45,1,'Himaja Reddy ','himajareddy2016@gmail.com','Garbage','garbage2.jpg','roadclean2.jpg','Kukatpally','Garbage is filled beside the compound wall of our park.','Solved','2020-03-02 10:33:16','2020-03-11 10:12:26','Closed'),(46,1,'Himaja Reddy ','himajareddy2016@gmail.com','Road','road1.jpg','roadclean1.jpg','Balanagar','Road is damaged and is causing traffic jam.','New road is laid and there is no problem with traffic.','2020-03-02 10:40:14','2020-03-02 10:43:21','Closed'),(49,1,'Himaja Reddy ','himajareddy2016@gmail.com','Electricity','electricity2.jpg','electricityclean2.jpg','Secundrabad','Street light is not working.','Street light is glowing','2020-03-03 09:51:31','2020-03-13 10:53:50','Closed'),(50,1,'Himaja Reddy ','himajareddy2016@gmail.com','Road','road2.jpg','roadclean2.jpg','Khairatabad','Road is damaged.','Solved','2020-03-05 14:14:08','2020-03-12 11:41:53','Closed'),(51,3,'Pavani Siddam','pavanisiddam2k@gmail.com','Garbage','garbage3.jpg','garbageclean2.jpg','Attapur','Please clean the garbage.','Garbage is cleared','2020-03-10 12:44:27','2020-03-13 11:06:04','Closed'),(52,1,'Himaja Reddy ','himajareddy2016@gmail.com','Garbage','garbage3.jpg','garbageclean3.jpg','Shaikpet','Garbage','Solved','2020-03-11 10:23:32','2020-03-11 10:25:17','Closed'),(54,4,'Manchala Sarika','sarikamanchala.999@gmail.com','Water','water3.jpg','garbageclean1.jpg','Nampally','Water is flowing.','mm','2020-03-11 12:15:05','2020-03-12 10:16:44','Closed'),(55,20,'Jinnaram Meghana','meghana.jinnaram44@gmail.com','Electricity','electricity3.jpg','electricityclean3.jpg','Nizampet','Electricity Transformer is damaged','Electricity Problem is solved','2020-03-12 12:40:10','2020-03-13 14:10:34','Closed'),(56,3,'Pavani Siddam','pavanisiddam2k@gmail.com','Water','water4.jpg','Not Yet Closed','Nizampet','Near Metro station water is filled ','Not Yet Solved','2020-03-12 12:43:07',NULL,'Pending'),(57,3,'Pavani Siddam','pavanisiddam2k@gmail.com','Garbage','garbage1.jpg','Not Yet Closed','Shaikpet','Garbage problem','Not Yet Solved','2020-03-12 12:46:32',NULL,'Pending'),(58,3,'Pavani Siddam','pavanisiddam2k@gmail.com','Road','road3.jpg','roadclean2.jpg','Balnagar','Main road of colony is totally damaged due to rains','Road is cleared','2020-03-12 12:47:10','2020-03-13 14:01:33','Closed'),(59,3,'Pavani Siddam','pavanisiddam2k@gmail.com','Road','road3.jpg','Not Yet Closed','Balnagar','Main road is damaged','Not Yet Solved','2020-03-12 12:47:38',NULL,'Pending'),(60,4,'Manchala Sarika','sarikamanchala.999@gmail.com','Road','road3.jpg','roadclean2.jpg','Balnagar','Road damaged due to rain','Road problem is solved','2020-03-12 12:49:20','2020-03-13 14:11:10','Closed'),(61,20,'Jinnaram Meghana','meghana.jinnaram44@gmail.com','Electricity','electricity3.jpg','electricityclean3.jpg','Kukatpally','Transformer is not working.','Transformer is replaced.','2020-03-13 14:16:45','2020-03-13 14:18:49','Closed'),(62,20,'Jinnaram Meghana','meghana.jinnaram44@gmail.com','Water','water2.jpg','waterclean2.jpg','Erragadda','Drainage is blocked.','Drainage is cleared.','2020-03-13 14:25:30','2020-03-13 14:30:22','Closed'),(63,1,'Himaja Reddy ','himajareddy2016@gmail.com','Water','water2.jpg','Not Yet Closed','Musheerabad','Water is flowing on road.\n','Not Yet Solved','2020-03-13 14:44:08',NULL,'Pending'),(65,1,'Himaja Reddy ','himajareddy2016@gmail.com','Road','road1.jpg','roadclean2.jpg','Kondapur','Road is damaged due to rain','Road is repaired','2020-03-16 09:52:09','2020-03-17 09:56:16','Closed'),(67,1,'Himaja Reddy ','himajareddy2016@gmail.com','Electricity','electricity3.jpg','Not Yet Closed','Nampally','Transformer is damaged','Not Yet Solved','2020-03-16 09:57:32',NULL,'Pending'),(69,1,'Himaja Reddy ','himajareddy2016@gmail.com','Garbage','garbage2.jpg','Not Yet Closed','Erragadda','Garbage is dumped and not cleaned','Not Yet Solved','2020-03-17 10:40:08',NULL,'Pending');
/*!40000 ALTER TABLE `Complaint` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-17 11:52:48
