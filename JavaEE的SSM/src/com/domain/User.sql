-- auto Generated on 2019-07-10
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
  id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT 'name',
  money DECIMAL (13,4) NOT NULL DEFAULT -1 COMMENT '用户工资',
INDEX `ix_name_money`(name,money),
  PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'user';
