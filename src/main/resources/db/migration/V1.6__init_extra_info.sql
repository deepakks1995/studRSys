CREATE TABLE IF NOT EXISTS `extra_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `general_info_id` int(11) NOT NULL,
  `vehicle` varchar(512) DEFAULT '',
  `registration_number` varchar(512) DEFAULT NULL,
  `company` varchar(512) DEFAULT NULL,
  `make` varchar(512) DEFAULT NULL,
  `idv` varchar(512) DEFAULT NULL,
  `tp` varchar(512) DEFAULT NULL,
  `od_premium` varchar(512) DEFAULT NULL,
  `tp_premium` varchar(512) DEFAULT NULL,
  `policy_doc` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `general_info` (`general_info_id`),
  CONSTRAINT `general_info` FOREIGN KEY (`general_info_id`) REFERENCES `general_info` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;