-- MySQL dump 10.13  Distrib 5.6.33, for Linux (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	5.6.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `application`
--

DROP TABLE IF EXISTS `application`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `application` (
  `idx` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) NOT NULL,
  `period` int(11) NOT NULL DEFAULT '0',
  `category` varchar(256) DEFAULT NULL,
  `type` enum('개인','법인','기타') DEFAULT '개인',
  `owner` enum('동일','다름','') NOT NULL DEFAULT '',
  `owner_name` varchar(256) DEFAULT '',
  `owner_birthdate` varchar(256) DEFAULT '',
  `owner_gender` enum('남자','여자','기타','') NOT NULL DEFAULT '',
  `owner_phone` varchar(256) DEFAULT '' COMMENT '상점명 ',
  `applicant_name` varchar(256) DEFAULT '',
  `applicant_birthdate` varchar(256) DEFAULT '',
  `applicant_gender` enum('남자','여자','기타','') NOT NULL DEFAULT '',
  `applicant_phone` varchar(256) DEFAULT '',
  `applicant_relation` varchar(256) DEFAULT '',
  `corperate_name` varchar(256) DEFAULT '' COMMENT '입력시간',
  `corperate_type` varchar(256) DEFAULT '',
  `corperate_address` varchar(256) DEFAULT '',
  `corperate_year` varchar(256) DEFAULT '',
  `corperate_phone` varchar(256) DEFAULT '',
  `datetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `utm_source` varchar(256) DEFAULT '',
  `utm_medium` varchar(256) DEFAULT '',
  `utm_keyword` varchar(256) DEFAULT '',
  `utm_campaign` varchar(256) DEFAULT '',
  `marketing` varchar(45) DEFAULT 'n',
  `validation` int(11) DEFAULT '1' COMMENT '0: 삭제\n1: 일반신청\n2: bc카드 신청\n',
  `query` mediumtext,
  `drop_outCd` enum('','A','B','C','D','E','F','G','T') DEFAULT '' COMMENT 'A : 지역\nB : 타겟\nC : 상환능력\nD : 신용등급\nE : 운영기간\nF : 중복접수\nG : 기타\nT : 테스트',
  `progress` enum('심사중','승인','탈락','기타') DEFAULT '심사중' COMMENT '심사 진행상\n',
  `store_name` varchar(256) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  `user_note` mediumtext,
  `funda_memo` mediumtext,
  `store_idx` int(11) DEFAULT NULL,
  `user_id` varchar(45) DEFAULT NULL,
  `ip` varchar(45) DEFAULT NULL,
  `is_delete` int(11) DEFAULT '0',
  `debtcode` varchar(45) DEFAULT NULL,
  `descmemo` varchar(45) DEFAULT NULL,
  `registerkey` varchar(45) DEFAULT NULL,
  `replacekey` varchar(45) DEFAULT NULL,
  `rainbowscore` int(11) DEFAULT NULL COMMENT '레인보우 스코어',
  PRIMARY KEY (`idx`)
) ENGINE=InnoDB AUTO_INCREMENT=119085 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `application`
--

LOCK TABLES `application` WRITE;
/*!40000 ALTER TABLE `application` DISABLE KEYS */;
INSERT INTO `application` VALUES (119078,50000000,0,NULL,'개인','','','','','','','','','','','','','','','','2016-10-25 06:47:30','','','','','n',1,NULL,'','심사중','KCB홈페이지신청','01050400258','KCB신용송부인증신청',NULL,1,NULL,NULL,0,'심사완료','','20161025154627237445','7223092987',2),(119079,100000,0,NULL,'개인','','','','','','정다미','','','','','','','','','','2016-10-25 07:10:21','','','','','n',1,NULL,'','심사중','문자전송신청','01092581385','테스트',NULL,1,NULL,NULL,0,'심사대기',NULL,'20161025161021237350',NULL,NULL),(119080,100000,0,NULL,'개인','','','','','','양귀호','','','','','','','','','','2016-10-25 07:12:02','','','','','n',1,NULL,'','심사중','문자전송신청','01033311444','테스트',NULL,1,NULL,NULL,0,'심사대기',NULL,'20161025161202237457',NULL,NULL),(119081,100000,0,NULL,'개인','','','','','','양귀호','','','','','','','','','','2016-10-25 07:13:02','','','','','n',1,NULL,'','심사중','문자전송신청','01033311444','테스트',NULL,1,NULL,NULL,0,'심사대기',NULL,'20161025161302237351',NULL,NULL),(119082,100000,0,NULL,'개인','','','','','','양귀호','','','','','','','','','','2016-10-25 07:14:00','','','','','n',1,NULL,'','심사중','문자전송신청','01033311444','테스트',NULL,1,NULL,NULL,0,'심사대기',NULL,'20161025161400237459',NULL,NULL),(119083,100000,0,NULL,'개인','','','','','','양귀호','','','','','','','','','','2016-10-25 07:15:09','','','','','n',1,NULL,'','심사중','문자전송신청','01033311444','테스트',NULL,1,NULL,NULL,0,'심사대기',NULL,'20161025161509237460',NULL,NULL),(119084,100000,0,NULL,'개인','','','','','','염귀호','','','','','','','','','','2016-10-25 07:16:09','','','','','n',1,NULL,'','심사중','문자전송신청','01033311444','테스트',NULL,1,NULL,NULL,0,'심사탈락','','20161025161609237352','7327052251',7);
/*!40000 ALTER TABLE `application` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-10-25 19:04:37
