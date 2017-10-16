-- 新建数据库`sparrow`
-- 字符集：utf8
-- 排序规则：utf8_general_ci
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for center_user
-- ----------------------------
DROP TABLE IF EXISTS `center_user`;
CREATE TABLE `center_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键-用户编码',
  `password` VARCHAR(32) NOT NULL COMMENT '密码（MD5（密码+salt））',
  `salt` VARCHAR(32) NOT NULL COMMENT '盐值',
  `nickname` VARCHAR(50) DEFAULT NULL COMMENT '昵称',
  `avatar` VARCHAR(255) DEFAULT NULL COMMENT '头像（url路径）',
  `sex` TINYINT(4) DEFAULT 0 COMMENT '性别（0.保密 1.男 2.女 3.男妖 4.女妖）',
  `age` VARCHAR(32) DEFAULT '保密' COMMENT '年龄',
  `real_name` VARCHAR(100) DEFAULT NULL COMMENT '真实姓名',
  `id_card_no` VARCHAR(64) DEFAULT NULL COMMENT '身份证号',
  `birthday` TIMESTAMP DEFAULT NULL COMMENT '生日',
  `state` INT(11) DEFAULT 0 COMMENT '状态（0.使用中；1.锁定中；2.已删除）',
  `create_id` INT(11) DEFAULT 0 COMMENT '创建者ID',
  `create_ip` VARCHAR(64) DEFAULT 'IP: 0.0.0.0' COMMENT '注册IP地址',
  `create_time` TIMESTAMP DEFAULT NULL COMMENT '用户注册时间',
  `last_login_time` DATETIME DEFAULT NULL COMMENT '最后登录时间',
  `last_login_ip` VARCHAR(64) DEFAULT 'IP: 0.0.0.0' COMMENT '最后登录IP',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 主键从666开始
ALTER TABLE center_user AUTO_INCREMENT=666;

-- ----------------------------
-- Records of center_user
-- ----------------------------


-- ----------------------------
-- Table structure for center_user_details
-- ----------------------------
DROP TABLE IF EXISTS `center_user_details`;
CREATE TABLE `center_user_details` (
  `user_id` INT(11) NOT NULL COMMENT '主键-外键-用户编码',
  `mobile` VARCHAR(32) DEFAULT NULL COMMENT '手机号',
  `email` VARCHAR(200) DEFAULT NULL COMMENT '邮箱',
  `signature` VARCHAR(255) DEFAULT NULL COMMENT '个性签名',
  `integral` INT(11) NOT NULL DEFAULT 0 COMMENT '积分',
  `homepage` VARCHAR(200) DEFAULT NULL COMMENT '用户的主页',
  `login_count` int(11) NOT NULL DEFAULT 1 COMMENT '登录次数',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户详情表';

-- ----------------------------
-- Records of center_user_details
-- ----------------------------



-- ----------------------------
-- Table structure for center_user_log
-- 以后所有日志类信息会放到文档类或文件类数据库中，而不放在关系型数据库中
-- ----------------------------
DROP TABLE IF EXISTS `center_user_log`;
CREATE TABLE `center_user_log` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `operation_id` INT(11)  DEFAULT NULL COMMENT '操作人-外键',
  `content` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '操作内容',
  `state` INT(10) NOT NULL DEFAULT 0 COMMENT '状态（0.显示；1.隐藏）',
  `operation_ip` VARCHAR(40) DEFAULT NULL COMMENT '操作人IP',
  `longitude` VARCHAR(100) DEFAULT '' COMMENT '经度',
  `latitude` VARCHAR(100) DEFAULT '' COMMENT '维度',
  `operation_envi` VARCHAR(255) DEFAULT '' COMMENT '操作环境',
  `create_time` DATETIME DEFAULT NULL COMMENT '创建时间',
  `last_time` TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户操作记录表';

-- ----------------------------
-- Records of center_user_log
-- ----------------------------























SET FOREIGN_KEY_CHECKS=1;
