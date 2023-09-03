-- MySQL dump 10.13  Distrib 8.1.0, for macos13 (x86_64)
--
-- Host: 82.156.205.178    Database: db0
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `test`
--

DROP TABLE IF EXISTS `test`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test` (
                        `id` varchar(100) DEFAULT NULL,
                        `text` int DEFAULT NULL,
                        `age` int DEFAULT NULL,
                        `gender` bit(1) DEFAULT NULL,
                        `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test`
--

LOCK TABLES `test` WRITE;
/*!40000 ALTER TABLE `test` DISABLE KEYS */;
/*!40000 ALTER TABLE `test` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_0`
--

DROP TABLE IF EXISTS `test_0`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_0` (
                          `id` varchar(100) DEFAULT NULL,
                          `text` int DEFAULT NULL,
                          `age` int DEFAULT NULL,
                          `gender` bit(1) DEFAULT NULL,
                          `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_0`
--

LOCK TABLES `test_0` WRITE;
/*!40000 ALTER TABLE `test_0` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_0` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_1`
--

DROP TABLE IF EXISTS `test_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_1` (
                          `id` varchar(100) DEFAULT NULL,
                          `text` int DEFAULT NULL,
                          `age` int DEFAULT NULL,
                          `gender` bit(1) DEFAULT NULL,
                          `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_1`
--

LOCK TABLES `test_1` WRITE;
/*!40000 ALTER TABLE `test_1` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_1_man`
--

DROP TABLE IF EXISTS `test_1_man`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_1_man` (
                              `id` varchar(100) DEFAULT NULL,
                              `text` int DEFAULT NULL,
                              `age` int DEFAULT NULL,
                              `gender` bit(1) DEFAULT NULL,
                              `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_1_man`
--

LOCK TABLES `test_1_man` WRITE;
/*!40000 ALTER TABLE `test_1_man` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_1_man` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_1_woman`
--

DROP TABLE IF EXISTS `test_1_woman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `test_1_woman` (
                                `id` varchar(100) DEFAULT NULL,
                                `text` int DEFAULT NULL,
                                `age` int DEFAULT NULL,
                                `gender` bit(1) DEFAULT NULL,
                                `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_1_woman`
--

LOCK TABLES `test_1_woman` WRITE;
/*!40000 ALTER TABLE `test_1_woman` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_1_woman` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
                        `id` varchar(100) DEFAULT NULL,
                        `name` varchar(20) DEFAULT NULL,
                        `gender` bit(1) DEFAULT NULL,
                        `age` int DEFAULT NULL,
                        `email` varchar(20) DEFAULT NULL,
                        `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_0`
--

DROP TABLE IF EXISTS `user_0`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_0` (
                          `id` varchar(100) DEFAULT NULL,
                          `name` varchar(20) DEFAULT NULL,
                          `gender` bit(1) DEFAULT NULL,
                          `age` int DEFAULT NULL,
                          `email` varchar(20) DEFAULT NULL,
                          `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_0`
--

LOCK TABLES `user_0` WRITE;
/*!40000 ALTER TABLE `user_0` DISABLE KEYS */;
INSERT INTO `user_0` VALUES ('1697910981858504704','1693648498392',_binary '',25,NULL,'2022-04-16'),('1697911004453220352','1693648503779',_binary '',99,NULL,'2022-04-25'),('1697911006491652096','1693648504265',_binary '',1,NULL,'2022-01-26'),('1697911006906888192','1693648504364',_binary '\0',97,NULL,'2022-12-10'),('1697911007389233152','1693648504479',_binary '',19,NULL,'2022-04-08'),('1697915266533007360','1693649519938',_binary '',9,NULL,'2023-05-10'),('1697915267363479552','1693649520136',_binary '\0',23,NULL,'2023-12-17'),('1697915268206534656','1693649520337',_binary '\0',35,NULL,'2022-03-21'),('1697915270291103744','1693649520834',NULL,21,NULL,'2023-12-22');
/*!40000 ALTER TABLE `user_0` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_1`
--

DROP TABLE IF EXISTS `user_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_1` (
                          `id` varchar(100) DEFAULT NULL,
                          `name` varchar(20) DEFAULT NULL,
                          `gender` bit(1) DEFAULT NULL,
                          `age` int DEFAULT NULL,
                          `email` varchar(20) DEFAULT NULL,
                          `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_1`
--

LOCK TABLES `user_1` WRITE;
/*!40000 ALTER TABLE `user_1` DISABLE KEYS */;
INSERT INTO `user_1` VALUES ('1697911007804469248','1693648504578',NULL,38,NULL,'2022-04-18');
/*!40000 ALTER TABLE `user_1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_1_man`
--

DROP TABLE IF EXISTS `user_1_man`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_1_man` (
                              `id` varchar(100) DEFAULT NULL,
                              `name` varchar(20) DEFAULT NULL,
                              `gender` bit(1) DEFAULT NULL,
                              `age` int DEFAULT NULL,
                              `email` varchar(20) DEFAULT NULL,
                              `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_1_man`
--

LOCK TABLES `user_1_man` WRITE;
/*!40000 ALTER TABLE `user_1_man` DISABLE KEYS */;
INSERT INTO `user_1_man` VALUES ('1697911005279498240','1693648503976',_binary '',82,NULL,'2023-03-17'),('1697911005677957120','1693648504071',_binary '',20,NULL,'2022-03-09'),('1697915267766132736','1693649520232',_binary '',56,NULL,'2023-10-10'),('1697915268630159360','1693649520439',_binary '',26,NULL,'2022-07-11'),('1697915269066366976','1693649520542',_binary '',86,NULL,'2023-10-01');
/*!40000 ALTER TABLE `user_1_man` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_1_woman`
--

DROP TABLE IF EXISTS `user_1_woman`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_1_woman` (
                                `id` varchar(40) DEFAULT NULL,
                                `name` varchar(20) DEFAULT NULL,
                                `gender` bit(1) DEFAULT NULL,
                                `age` int DEFAULT NULL,
                                `email` varchar(20) DEFAULT NULL,
                                `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_1_woman`
--

LOCK TABLES `user_1_woman` WRITE;
/*!40000 ALTER TABLE `user_1_woman` DISABLE KEYS */;
INSERT INTO `user_1_woman` VALUES ('1697910984765157376','1693648499085',_binary '\0',62,NULL,'2022-08-09'),('1697911006076416000','1693648504166',_binary '\0',38,NULL,'2023-05-16'),('1697915265996136448','1693649519810',_binary '\0',98,NULL,'2022-11-20'),('1697915266948243456','1693649520037',_binary '\0',82,NULL,'2022-06-19'),('1697915269464825856','1693649520637',_binary '\0',98,NULL,'2022-02-08'),('1697915269867479040','1693649520733',_binary '\0',48,NULL,'2022-10-19');
/*!40000 ALTER TABLE `user_1_woman` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-09-03 22:06:53
