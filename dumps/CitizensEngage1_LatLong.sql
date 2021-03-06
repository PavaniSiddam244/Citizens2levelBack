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
-- Table structure for table `LatLong`
--

DROP TABLE IF EXISTS `LatLong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `LatLong` (
  `Id` int(11) NOT NULL,
  `Location` varchar(75) NOT NULL,
  `Latitude` decimal(9,6) DEFAULT NULL,
  `Longitude` decimal(9,6) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Location_UNIQUE` (`Location`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `LatLong`
--

LOCK TABLES `LatLong` WRITE;
/*!40000 ALTER TABLE `LatLong` DISABLE KEYS */;
INSERT INTO `LatLong` VALUES (1,'Ameerpet',17.437462,78.448288),(2,'Asif Nagar',17.496850,78.505900),(3,'Attapur',17.369949,78.429710),(4,'Bahadurpura',17.358650,78.446230),(5,'Balnagar',17.464310,78.454930),(6,'Domalguda',17.411051,78.479820),(7,'Khairatabad',17.410720,78.461460),(8,'Kukatpally',17.494793,78.399643),(9,'LB Nagar',17.341631,78.504700),(10,'Malakpet',17.373093,78.490036),(11,'Musheerabad',17.419979,78.511810),(12,'Nizampet',17.516481,78.376625),(13,'Saidabad',17.362551,78.508423),(14,'Miyapur',17.495831,78.373619),(15,'Nampally',17.389940,78.472054),(16,'Secundrabad',17.441339,78.488640),(17,'Shaikpet',17.400480,78.394470),(18,'Lakdikapul',17.361720,78.475170),(19,'Panjagutta',17.393860,78.347221),(20,'Erragadda',17.453199,78.434128),(21,'Kondapur',17.474260,78.327133),(22,'Gachibowli',17.432051,78.372658);
/*!40000 ALTER TABLE `LatLong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-03-17 11:52:50
