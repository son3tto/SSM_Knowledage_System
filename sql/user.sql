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
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(40) DEFAULT NULL,
  `phone` varchar(30) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `token` varchar(50) DEFAULT NULL,
  `avatar_url` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `gmt_create` bigint DEFAULT NULL,
  `gmt_motified` bigint DEFAULT NULL,
  `sex` int DEFAULT '0',
  `sign` varchar(110) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL,
  `grade` int DEFAULT '1',
  `follow_count` int DEFAULT '0',
  `fans_count` int DEFAULT '0',
  `address` varchar(50) DEFAULT '保密',
  `score` int DEFAULT '0',
  `type` int DEFAULT '1' COMMENT '1为用户，2为管理员',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'test','15259809973','7f6807694353efa290ca25f1cb5c7064',NULL,'2dac7dfe-cbe4-4c8d-8575-30a2eec38cfc','/images/default-avatar.png',NULL,NULL,0,NULL,1,0,0,'保密',0,1),(2,'asd123','15259809972','7f6807694353efa290ca25f1cb5c7064',NULL,'80e9ebd5-1b72-4ff7-8741-a933dfb51a10','/images/users/head.jpg',1593745105362,1593745105362,0,NULL,1,0,0,'保密',33,1),(3,'test3','15259809974','7f6807694353efa290ca25f1cb5c7064',NULL,'2dac7dfe-cbe4-4c8d-8575-30a2eec38cfc','/images/default-avatar.png',1593745105362,1593745105362,0,NULL,1,0,0,'保密',23,1),(4,'james','15259809975','7f6807694353efa290ca25f1cb5c7064',NULL,'2dac7dfe-cbe4-4c8d-8575-30a2eec38cfc','/images/default-avatar.png',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'jennie','15259809976','7f6807694353efa290ca25f1cb5c7064',NULL,'2dac7dfe-cbe4-4c8d-8575-30a2eec38cfc','/images/default-avatar.png',1593745105362,1593745105362,0,NULL,1,0,0,'保密',23,1),(6,'111','15259809977','7f6807694353efa290ca25f1cb5c7064',NULL,'2dac7dfe-cbe4-4c8d-8575-30a2eec38cfc','/images/default-avatar.png',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-06 16:57:08
