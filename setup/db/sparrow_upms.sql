-- Sparrow UPMS Center 数据表，用于存放Sparrow系统权限管理的数据表
-- 用户表：存储Sparrow系统内部管理人员的表
-- 该管理员是Sparrow组织架构中的一名具有不同权限的管理人员，也可以自己成为一名普通使用人员，只需要通过单点登录，系统就会自动注册该用户到Sparrow Center，然后提示该用户完善信息。
-- 这里有些编码字段的值默认为当前记录的主键值怎么搞？
-- 使用数据库的触发器功能！


SET FOREIGN_KEY_CHECKS=0;


-- ----------------------------
-- Table structure for upms_operation_log
-- 该表暂时放在关系型数据库中，以后移到其他文本类型或文件类型数据库中
-- ----------------------------
DROP TABLE IF EXISTS `upms_operation_log`;
CREATE TABLE `upms_operation_log` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `description` VARCHAR(255) DEFAULT NULL COMMENT '操作描述',
  `uri` VARCHAR(255) DEFAULT NULL COMMENT 'URI',
  `url` VARCHAR(255) DEFAULT NULL COMMENT 'URL',
  `method` VARCHAR(32) DEFAULT NULL COMMENT '请求类型',
  `parameter` MEDIUMTEXT DEFAULT NULL COMMENT '请求参数',
  `result` MEDIUMTEXT DEFAULT NULL COMMENT '请求返回结果',
  `start_time` TIMESTAMP DEFAULT current_timestamp COMMENT '开始时间',
  `consumption_time` INT(11) DEFAULT 0 COMMENT '消耗时长（暂定毫秒级）',
  `permission_value` VARCHAR(255) DEFAULT NULL COMMENT '权限值',
  `state` INT(11) DEFAULT 0 COMMENT '状态（0.显示 1.隐藏）',
  `operation_user_id` INT(11) DEFAULT 0 COMMENT '操作用户id',
  `operation_ip` VARCHAR(64) DEFAULT 'IP: 0.0.0.0' COMMENT '操作者IP地址',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='UPMS中心操作记录表';


-- ----------------------------
-- Records of upms_operation_log
-- ----------------------------




-- ----------------------------
-- Table structure for upms_user
-- ----------------------------
DROP TABLE IF EXISTS `upms_user`;
CREATE TABLE `upms_user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` VARCHAR(32) NOT NULL COMMENT '账户名称',
  `password` VARCHAR(32) NOT NULL COMMENT '密码（MD5（密码+salt））',
  `salt` VARCHAR(32) NOT NULL COMMENT '盐值',
  `nickname` VARCHAR(50) DEFAULT NULL COMMENT '昵称',
  `avatar` VARCHAR(255) DEFAULT NULL COMMENT '头像（url路径）',
  `sex` TINYINT(4) DEFAULT 0 COMMENT '性别（0.保密 1.男 2.女 3.男妖 4.女妖）',
  `age` INT(11) DEFAULT 0 COMMENT '年龄',
  `real_name` VARCHAR(100) DEFAULT NULL COMMENT '真实姓名',
  `id_card_no` VARCHAR(64) DEFAULT NULL COMMENT '身份证号',
  `birthday` TIMESTAMP DEFAULT current_timestamp COMMENT '生日',
  `state` INT(11) DEFAULT 0 COMMENT '状态（0.使用中；1.锁定中；2.已删除）',
  `create_user_id` INT(11) DEFAULT 0 COMMENT '创建者id',
  `create_ip` VARCHAR(64) DEFAULT 'IP: 0.0.0.0' COMMENT '注册IP地址',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '用户注册时间',
  `last_login_time` DATETIME DEFAULT current_timestamp COMMENT '最后登录时间',
  `last_login_ip` VARCHAR(64) DEFAULT 'IP: 0.0.0.0' COMMENT '最后登录IP',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';

-- 主键从666开始
ALTER TABLE upms_user AUTO_INCREMENT=666;


-- ----------------------------
-- Records of upms_user
-- ----------------------------
INSERT INTO upms_user (id, username, password, salt, nickname, avatar, sex, age, real_name, id_card_no, birthday, state, create_time) VALUES (1, 'sonysuo', 'sonysuo', 'sonysuo', 'sonysuo', 'sonysuo-1.png', 1, 27, 'sonysuo', '1234567896541232145', '1990-01-01 00:00:00', 0, '2017-11-13 14:54:00');



-- ----------------------------
-- Table structure for upms_organization
-- ----------------------------
DROP TABLE IF EXISTS `upms_organization`;
CREATE TABLE `upms_organization` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` VARCHAR(32) DEFAULT NULL COMMENT '组织代码',
  `pid` INT(11) NOT NULL COMMENT '父级id',
  `name` VARCHAR(32) NOT NULL COMMENT '组织名称',
  `status` TINYINT(4) DEFAULT 0 COMMENT '状态（0.关闭 1.启用）',
  `sort` INT(11) DEFAULT 0 COMMENT '排序（同一级别的按照从小到大排序，小的排前面，大的排后面）',
  `description` VARCHAR(255) DEFAULT NULL COMMENT '描述信息',
  `create_user_id` INT(11) DEFAULT 0 COMMENT '创建者编码',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='组织表';


-- ----------------------------
-- Records of upms_organization
-- ----------------------------
INSERT INTO `upms_organization` (id, code, pid, name, status, sort, description, create_user_id) VALUES (1, 'SPARROW_ORGANIZATION_1', 0, '总部', 1, 1, '北京总部', 1);
INSERT INTO `upms_organization` (id, code, pid, name, status, sort, description, create_user_id) VALUES (2, 'SPARROW_ORGANIZATION_2', 0, '河北分部', 1, 2, '河北石家庄', 1);
INSERT INTO `upms_organization` (id, code, pid, name, status, sort, description, create_user_id) VALUES (3, 'SPARROW_ORGANIZATION_3', 0, '河南分部', 1, 3, '河北郑州', 1);
INSERT INTO `upms_organization` (id, code, pid, name, status, sort, description, create_user_id) VALUES (4, 'SPARROW_ORGANIZATION_4', 0, '山东分部', 1, 4, '山东济南', 1);
INSERT INTO `upms_organization` (id, code, pid, name, status, sort, description, create_user_id) VALUES (5, 'SPARROW_ORGANIZATION_5', 0, '山西分部', 1, 5, '山西太原', 1);
INSERT INTO `upms_organization` (id, code, pid, name, status, sort, description, create_user_id) VALUES (6, 'SPARROW_ORGANIZATION_6', 0, '湖北分部', 1, 6, '湖北武汉', 1);





-- ----------------------------
-- Table structure for upms_role
-- ----------------------------
DROP TABLE IF EXISTS `upms_role`;
CREATE TABLE `upms_role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` VARCHAR(32) DEFAULT NULL COMMENT '角色代码',
  `pid` INT(11) NOT NULL COMMENT '父级id',
  `name` VARCHAR(32) NOT NULL COMMENT '角色名称',
  `title` VARCHAR(32) NOT NULL COMMENT '角色标题',
  `status` TINYINT(4) DEFAULT 0 COMMENT '状态（0.关闭 1.启用）',
  `sort` INT(11) DEFAULT 0 COMMENT '排序（同一级别的按照从小到大排序，小的排前面，大的排后面）',
  `description` VARCHAR(255) DEFAULT NULL COMMENT '描述信息',
  `create_user_id` INT(11) DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色表';


-- ----------------------------
-- Records of upms_role
-- ----------------------------
INSERT INTO upms_role (id, code, pid, name, title, status, sort, description, create_user_id, create_time) VALUES (1, 'SPARROW-ROLE-1', 0, '超级管理员', '拥有系统所有权限', 1, 1, '拥有系统所有权限的人员', 1, '2017-11-13 14:30:00');




-- ----------------------------
-- Table structure for upms_system
-- ----------------------------
DROP TABLE IF EXISTS `upms_system`;
CREATE TABLE `upms_system` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` VARCHAR(32) DEFAULT NULL COMMENT '系统编码',
  `name` VARCHAR(32) DEFAULT NULL COMMENT '系统名称',
  `title` VARCHAR(32) DEFAULT NULL COMMENT '系统标题',
  `icon` VARCHAR(255) DEFAULT NULL COMMENT '系统图标',
  `background` VARCHAR(255) DEFAULT NULL COMMENT '系统默认背景图',
  `theme` VARCHAR(255) DEFAULT NULL COMMENT '主题（颜色值）',
  `domain_name` VARCHAR(255) DEFAULT NULL COMMENT '域名',
  `status` TINYINT(4) DEFAULT 0 COMMENT '状态（0.关闭 1.启用）',
  `sort` INT(11) DEFAULT 0 COMMENT '排序（同一级别的按照从小到大排序，小的排前面，大的排后面）',
  `description` VARCHAR(255) DEFAULT NULL COMMENT '描述信息',
  `create_user_id` INT(11) DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统表';


-- ----------------------------
-- Records of upms_system
-- ----------------------------
INSERT INTO `upms_system` (id, code, name, title, icon, background, theme, domain_name, status, sort, description, create_user_id) VALUES (1, 'SPARROW_SYSTEM_UPMS', 'sparrow-upms', '权限管理系统', NULL, NULL, '#FFFFFF', 'http://sonymm.sparrow.upms.cn:8081', 1, 1, '权限管理系统', 1);





-- ----------------------------
-- Table structure for upms_permission
-- ----------------------------
DROP TABLE IF EXISTS `upms_permission`;
CREATE TABLE `upms_permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `pid` INT(11) NOT NULL DEFAULT 0 COMMENT '父级id',
  `code` VARCHAR(32) DEFAULT NULL COMMENT '权限编码',
  `name` VARCHAR(32) DEFAULT NULL COMMENT '权限名称',
  `type` TINYINT(4) DEFAULT NULL COMMENT '权限类型（1.目录 2.菜单 3.按钮）',
  `value` VARCHAR(255) DEFAULT '' COMMENT '权限值（用于shiro权限管理设置）',
  `uri` VARCHAR(100) DEFAULT '' COMMENT '路径',
  `icon` VARCHAR(100) DEFAULT '' COMMENT '图标？',
  `status` TINYINT(4) DEFAULT 0 COMMENT '状态（0.关闭 1.启用）',
  `sort` INT(11) DEFAULT 0 COMMENT '排序（同一级别的按照从小到大排序，小的排前面，大的排后面）',
  `description` VARCHAR(255) DEFAULT NULL COMMENT '描述信息',
  `create_user_id` INT(11) DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='权限表';


-- ----------------------------
-- Records of upms_permission
-- ----------------------------




-- ----------------------------
-- Table structure for upms_user_permission
-- ----------------------------
DROP TABLE IF EXISTS `upms_user_permission`;
CREATE TABLE `upms_user_permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户id',
  `permission_id` INT(11) NOT NULL DEFAULT 0 COMMENT '权限id',
  `type` TINYINT(4) NOT NULL COMMENT '用户持有权限类型（0.增权限 1.减权限）',
  `create_user_id` INT(11) DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户权限表';


-- ----------------------------
-- Records of upms_user_permission
-- ----------------------------




-- ----------------------------
-- Table structure for upms_user_organization
-- ----------------------------
DROP TABLE IF EXISTS `upms_user_organization`;
CREATE TABLE `upms_user_organization` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户id',
  `organization_id` INT(11) NOT NULL DEFAULT 0 COMMENT '权限id',
  `create_user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户组织表';


-- ----------------------------
-- Records of upms_user_organization
-- ----------------------------




-- ----------------------------
-- Table structure for upms_user_role
-- ----------------------------
DROP TABLE IF EXISTS `upms_user_role`;
CREATE TABLE `upms_user_role` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '用户id',
  `role_id` INT(11) NOT NULL DEFAULT 0 COMMENT '权限id',
  `create_user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';


-- ----------------------------
-- Records of upms_user_role
-- ----------------------------





-- ----------------------------
-- Table structure for upms_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `upms_role_permission`;
CREATE TABLE `upms_role_permission` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_id` INT(11) NOT NULL DEFAULT 0 COMMENT '权限id',
  `permission_id` INT(11) NOT NULL DEFAULT 0 COMMENT '权限id',
  `create_user_id` INT(11) NOT NULL DEFAULT 0 COMMENT '创建者id',
  `create_time` TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  `last_time`  TIMESTAMP NOT NULL DEFAULT current_timestamp ON UPDATE current_timestamp COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色权限表';


-- ----------------------------
-- Records of upms_role_permission
-- ----------------------------







SET FOREIGN_KEY_CHECKS=1;