CREATE TABLE IF NOT EXISTS `insurance_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `insurance_type` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;