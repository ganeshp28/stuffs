CREATE TABLE IF NOT EXISTS `winappcode` (   `id` int(11) NOT NULL AUTO_INCREMENT,   `code` varchar(45) NOT NULL,   `status` char(1) NOT NULL,   UNIQUE KEY `id_UNIQUE` (`id`),   UNIQUE KEY `code_UNIQUE` (`code`) ) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;