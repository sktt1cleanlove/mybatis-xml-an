/*
SQLyog Ultimate v8.53 
MySQL - 5.1.40-community-log : Database - mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `id` bigint(10) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `moeny` double(5,2) DEFAULT NULL,
  `user_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `account` */

insert  into `account`(`id`,`name`,`moeny`,`user_id`) values (1,'icbc',12.00,1),(2,'cbc',13.00,2);

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` bigint(10) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `author_id` bigint(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `article` */

insert  into `article`(`id`,`name`,`author_id`) values (1,'武动乾坤',1),(2,'斗破苍穹',1),(3,'斗罗大陆',2),(4,'龙王传说',2),(5,'空速星痕',2);

/*Table structure for table `author` */

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` bigint(10) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `author` */

insert  into `author`(`id`,`name`) values (1,'天蚕土豆'),(2,'唐家三少'),(3,'骷髅精灵');

/*Table structure for table `power` */

DROP TABLE IF EXISTS `power`;

CREATE TABLE `power` (
  `id` bigint(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `power` */

insert  into `power`(`id`,`name`) values (1,'查阅资料'),(2,'发布信息'),(3,'编辑信息');

/*Table structure for table `role` */

DROP TABLE IF EXISTS `role`;

CREATE TABLE `role` (
  `id` bigint(10) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role` */

insert  into `role`(`id`,`name`) values (1,'管理员'),(2,'经理'),(3,'会员');

/*Table structure for table `role_power` */

DROP TABLE IF EXISTS `role_power`;

CREATE TABLE `role_power` (
  `role_id` bigint(10) DEFAULT NULL,
  `power_id` bigint(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `role_power` */

insert  into `role_power`(`role_id`,`power_id`) values (1,1),(2,1),(1,2),(2,2);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` bigint(10) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `pwd` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`pwd`) values (1,'zs','123'),(2,'ls','123'),(3,'泰达米尔','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
