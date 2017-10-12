-- 新建数据库`sparrow`
-- 字符集：utf8
-- 排序规则：utf8_general_ci
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sparrow_user
-- ----------------------------
DROP TABLE IF EXISTS `sparrow_user`;
CREATE TABLE `sparrow_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(30) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `credits` int(11) DEFAULT NULL,
  `last_visit` datetime DEFAULT NULL,
  `last_ip` varchar(23) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sparrow_user
-- ----------------------------
INSERT INTO `sparrow_user` VALUES ('1', 'admin', '123456', '5', '2017-04-15 14:53:40', '0:0:0:0:0:0:0:1');
SET FOREIGN_KEY_CHECKS=1;
