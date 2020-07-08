-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tree
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comment` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `parent_id` bigint NOT NULL,
  `type` int NOT NULL,
  `commentator` bigint NOT NULL,
  `gmt_create` bigint NOT NULL,
  `gmt_modified` bigint NOT NULL,
  `like_count` int DEFAULT '0',
  `content` varchar(1024) DEFAULT NULL,
  `comment_count` int DEFAULT '0',
  `target_id` bigint DEFAULT NULL,
  `addition` tinyint(1) DEFAULT '0' COMMENT '是否加积分',
  `question_id` bigint DEFAULT NULL COMMENT '帖子id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,1,1,2,1593756700168,1593756700168,1,'eee',1,1,1,1),(2,1,2,2,1593760601164,1593760601164,0,'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e\'e',0,1,0,1),(3,1,1,2,1593760604718,1593760604718,0,'dsadasdasd',1,1,1,1),(4,1,1,2,1593760607792,1593760607792,0,'dasdasda',0,1,1,1),(5,3,2,2,1593760613836,1593760613836,0,'ssssssssssssssssssxzxz',0,3,0,1),(6,2,1,2,1593760630507,1593760630507,0,'1',1,2,0,2),(7,6,2,2,1593760635011,1593760635011,0,'ddddddd',0,6,0,2),(8,2,1,2,1593760640483,1593760640483,0,'ddddddd',0,2,0,2),(9,3,1,2,1593760675823,1593760675823,1,'fdfdfdfd',0,3,0,3);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-06 16:57:06
