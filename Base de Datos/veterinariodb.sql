DROP DATABASE IF EXISTS veterinariodb; 
CREATE DATABASE IF NOT EXISTS veterinariodb;
USE veterinariodb;

--
-- Table structure for table `mascota`
--

DROP TABLE IF EXISTS `mascota`;
CREATE TABLE `mascota` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `raza` varchar(15) DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `cod_amo` int(11) NOT NULL,
  PRIMARY KEY (`codigo`),
  KEY `cod_amo` (`cod_amo`),
  CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`cod_amo`) REFERENCES `amo` (`codigo_amo`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mascota`
--

LOCK TABLES `mascota` WRITE;

INSERT INTO `mascota` VALUES (1,'Chispa','podenco','2018-10-18',110);
INSERT INTO `mascota` VALUES (2,'Nemo','pez payaso','2017-11-30',2);
INSERT INTO `mascota` VALUES (4,'Nuka','pichon maltes','2018-06-03',20);
INSERT INTO `mascota` VALUES (5,'Niebla','san Bernardo','2018-04-16',110);
INSERT INTO `mascota` VALUES (6,'mora',NULL,NULL,5),(7,'lufi','dalmata',NULL,20);
INSERT INTO `mascota` VALUES (8,'luna','york shire',NULL,110);

UNLOCK TABLES;

--
-- Table structure for table `amo`
--

DROP TABLE IF EXISTS `amo`;
CREATE TABLE `amo` (
  `codigo_amo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellidos` varchar(20) DEFAULT 'Pérez Gúzman',
  `correo` varchar(20) DEFAULT NULL,
  `direccion` varchar(50) NOT NULL,
  `tfno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codigo_amo`)
) ENGINE=InnoDB AUTO_INCREMENT=203 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `amo`
--

LOCK TABLES `amo` WRITE;

INSERT INTO `amo` VALUES (2,'Juan','Pérez Gúzman','demalaga@notiene.es','C/Barón de Les 5','666-445533');
INSERT INTO `amo` VALUES (5,'Pedro','Santos Gómez','campeon@notiene.es','C/marmol 18','333-824288');
INSERT INTO `amo` VALUES (20,'Luisa','Subirez','subi84@gmail.com','C/Salitre 25, 1ºA','222-114477');
INSERT INTO `amo` VALUES (110,'Antonio','Diaz Baeza','adiaz23@hotmail.com','C/abeto 25','555-112233');
INSERT INTO `amo` VALUES (200,'Fernando','Caldito Porrón','gacaXX@cai.es','C/Hamlet 12','122-101010');
INSERT INTO `amo` VALUES (201,'Alberto','Saiz-Vicuña','Alberto@notiene.es','C/Eugenio Gross 21','300-303030');
INSERT INTO `amo` VALUES (202,'Fulanito','Pérez Gúzman',NULL,'C/del pino 7',NULL);

UNLOCK TABLES;