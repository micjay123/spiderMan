/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : hot_searcher

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2021-03-16 14:01:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for hot_type
-- ----------------------------
DROP TABLE IF EXISTS `hot_type`;
CREATE TABLE `hot_type` (
  `type_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `source_name` varchar(20) NOT NULL COMMENT '热搜类型名',
  `description` varchar(100) DEFAULT '无' COMMENT '类型描述',
  `is_del` smallint(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hot_type
-- ----------------------------
INSERT INTO `hot_type` VALUES ('1', 'B站', 'B站热搜', '1');
INSERT INTO `hot_type` VALUES ('2', '知乎', '知乎热搜', '1');
INSERT INTO `hot_type` VALUES ('3', '微博', '微博热搜', '1');
INSERT INTO `hot_type` VALUES ('4', '豆瓣', '豆瓣资源', '1');
INSERT INTO `hot_type` VALUES ('5', '少数派', '少数派资源', '0');
