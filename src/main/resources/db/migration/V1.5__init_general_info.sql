CREATE TABLE IF NOT EXISTS `general_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_id` int(11) NOT NULL,
  `name` varchar(512) NOT NULL DEFAULT '',
  `address` varchar(512) DEFAULT '',
  `mobile` varchar(32) DEFAULT '',
  `email` varchar(256) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `point_of_association` varchar(512) DEFAULT NULL,
  `policy_number` varchar(512) DEFAULT NULL,
  `policy_validity` date DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `product_id` (`product_id`),
  KEY `company` (`company_id`),
  CONSTRAINT `company` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `insurance_type` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;