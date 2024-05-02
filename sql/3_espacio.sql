-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: 3
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `espacio`
--

DROP TABLE IF EXISTS `espacio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `espacio` (
  `idEspacio` int NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `turno` varchar(1) DEFAULT NULL,
  `libre` tinyint DEFAULT NULL,
  `idAula` int DEFAULT NULL,
  PRIMARY KEY (`idEspacio`),
  KEY `fk_espacio_aula_idx` (`idAula`),
  CONSTRAINT `fk_espacio_aula` FOREIGN KEY (`idAula`) REFERENCES `aula` (`idAula`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `espacio`
--

LOCK TABLES `espacio` WRITE;
/*!40000 ALTER TABLE `espacio` DISABLE KEYS */;
INSERT INTO `espacio` VALUES (1,'2022-05-01','M',1,5),(2,'2022-05-01','M',1,5),(3,'2022-05-02','M',1,5),(4,'2022-05-03','M',1,5),(5,'2022-05-04','M',1,5),(6,'2022-05-05','M',1,5),(7,'2022-05-06','M',1,5),(8,'2022-05-07','M',1,5),(9,'2022-05-08','M',1,5),(10,'2022-05-09','M',1,5),(11,'2022-05-10','M',1,5),(12,'2022-05-11','M',1,5),(13,'2022-05-12','M',1,5),(14,'2022-05-13','M',1,5),(15,'2022-05-14','M',1,5),(16,'2022-05-15','M',1,5),(17,'2022-05-16','M',1,5),(18,'2022-05-17','M',1,5),(19,'2022-05-18','M',1,5),(20,'2022-05-19','M',1,5),(21,'2022-05-20','M',1,5),(22,'2022-05-21','M',1,5),(23,'2022-05-22','M',1,5),(24,'2022-05-23','M',1,5),(25,'2022-05-24','M',1,5),(26,'2022-05-25','M',1,5),(27,'2022-05-26','M',1,5),(28,'2022-05-27','M',1,5),(29,'2022-05-28','M',1,5),(30,'2022-05-29','M',1,5),(31,'2022-05-30','M',1,5),(32,'2022-05-31','M',1,5);
/*!40000 ALTER TABLE `espacio` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-22 14:25:32
