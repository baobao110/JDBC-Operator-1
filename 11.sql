/*
Navicat MySQL Data Transfer

Source Server         : 333
Source Server Version : 50551
Source Host           : localhost:3306
Source Database       : 11

Target Server Type    : MYSQL
Target Server Version : 50551
File Encoding         : 65001

Date: 2017-11-14 02:44:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for text
-- ----------------------------
DROP TABLE IF EXISTS `text`;
CREATE TABLE `text` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `weather` varchar(255) NOT NULL,
  `context` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of text
-- ----------------------------
INSERT INTO `text` VALUES ('1', 'ewe', '2017-11-13 21:59:29', '阴天', 'sdsds');
INSERT INTO `text` VALUES ('7', '', '2017-11-14 00:14:01', '晴天', 'ttt');
INSERT INTO `text` VALUES ('8', '323', '2017-11-14 01:00:09', '阴天', 'eeeeeeee');
INSERT INTO `text` VALUES ('9', '232', '2017-11-14 01:00:09', '晴天', 'ererer');
