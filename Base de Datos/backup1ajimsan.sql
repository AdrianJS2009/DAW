-- MySQL dump 10.13  Distrib 5.7.40, for Linux (x86_64)
--
-- Host: localhost    Database: 1ajimsan
-- ------------------------------------------------------
-- Server version	5.7.40-0ubuntu0.18.04.1-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `amo`
--

DROP TABLE IF EXISTS `amo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `amo` (
  `codigo_amo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `tfno` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codigo_amo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amo`
--

LOCK TABLES `amo` WRITE;
/*!40000 ALTER TABLE `amo` DISABLE KEYS */;
INSERT INTO `amo` VALUES (1,'Raul Alvarez','C/abeto 25','555-112233'),(2,'Juan Antonio RodrÃ­guez FernÃ¡ndez','C/BarÃ³n de Les 5','666-445533'),(3,'MarÃ­a SÃ¡nchez','C/reyes catÃ³licos 23','111-112299'),(4,'Luisa CortÃ©s','C/Salitre 25, 1ÂºA','222-114477');
/*!40000 ALTER TABLE `amo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `aval`
--

DROP TABLE IF EXISTS `aval`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `aval` (
  `aval` int(11) NOT NULL,
  `avalado` int(11) NOT NULL,
  PRIMARY KEY (`aval`,`avalado`),
  KEY `avalado` (`avalado`),
  CONSTRAINT `aval_ibfk_1` FOREIGN KEY (`aval`) REFERENCES `cliente` (`codcliente`),
  CONSTRAINT `aval_ibfk_2` FOREIGN KEY (`avalado`) REFERENCES `cliente` (`codcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `aval`
--

LOCK TABLES `aval` WRITE;
/*!40000 ALTER TABLE `aval` DISABLE KEYS */;
/*!40000 ALTER TABLE `aval` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `codcliente` int(11) NOT NULL AUTO_INCREMENT,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`codcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coche`
--

DROP TABLE IF EXISTS `coche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coche` (
  `matricula` varchar(7) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `color` varchar(20) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `preciohora` int(11) DEFAULT '100',
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coche`
--

LOCK TABLES `coche` WRITE;
/*!40000 ALTER TABLE `coche` DISABLE KEYS */;
/*!40000 ALTER TABLE `coche` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `departamento`
--

DROP TABLE IF EXISTS `departamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `departamento` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `presupuesto` int(11) DEFAULT '0',
  `gastos` int(11) DEFAULT '1500',
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (1,'Sistemas',2000,3500),(2,'Desarrollo',2000,1500),(3,'Recursos Humanos',4000,3500),(4,'Ventas',4000,3500),(5,'Contabilidad',2000,1500),(6,'I+D',4000,7732);
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleado` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nif` varchar(9) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido1` varchar(30) NOT NULL,
  `apellido2` varchar(30) DEFAULT NULL,
  `codigo_departamento` int(11) DEFAULT NULL,
  `codigo_jefe` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_departamento` (`codigo_departamento`),
  CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`codigo_departamento`) REFERENCES `departamento` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
INSERT INTO `empleado` VALUES (1,'20111222x','Julio','Romero','de Torres',1,3),(2,'20111333y','Antonio','Reyna','Manescau',6,4),(3,'20111444z','Juana','de Arcos',NULL,1,NULL),(4,'20111111a','Ada','Bayron',NULL,6,NULL),(5,'20222111a','Jimena','Burgos','Madrid',2,NULL),(6,'20222555b','Remedios','Varo','SÃ¡nchez',2,5),(7,'20222666c','Frida','Kalo',NULL,3,8),(8,'20222666c','Antonio','Candela','Heredia',3,NULL),(9,'20222777r','Maria','Triana','Fuentes',NULL,NULL),(10,'20222888h','Fernano','Fernan','GÃ³mez',NULL,NULL),(11,'33000111s','Pepe','Ruiz','Santana',2,5),(12,'33000222d','David','Ruiz','Santana',3,8),(13,'33000333e','David','Ruiz','Ruiz',1,3),(14,'33000444R','Pepe','Ruiz','Ruiz',1,3);
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mascota`
--

DROP TABLE IF EXISTS `mascota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mascota` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(20) NOT NULL,
  `raza` varchar(15) DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `codigo_amo` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_amo` (`codigo_amo`),
  CONSTRAINT `mascota_ibfk_1` FOREIGN KEY (`codigo_amo`) REFERENCES `amo` (`codigo_amo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mascota`
--

LOCK TABLES `mascota` WRITE;
/*!40000 ALTER TABLE `mascota` DISABLE KEYS */;
INSERT INTO `mascota` VALUES (1,'Elur','Pastor Aleman','2021-11-20',1),(2,'Nemo','pez payaso','2017-11-30',4),(3,'Yaki','Pastor Aleman','2018-10-12',3),(4,'Nuka','pichon maltes','2018-06-03',4),(5,'Niebla','Pastor Aleman','2018-04-16',2),(6,'mora','Black dogo','2003-04-11',2);
/*!40000 ALTER TABLE `mascota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserva` (
  `numreserva` int(11) NOT NULL AUTO_INCREMENT,
  `codcliente` int(11) NOT NULL,
  `fechainicio` date NOT NULL,
  `fechafin` date NOT NULL,
  `total` int(11) DEFAULT '0',
  PRIMARY KEY (`numreserva`),
  KEY `codcliente` (`codcliente`),
  CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`codcliente`) REFERENCES `cliente` (`codcliente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservacoche`
--

DROP TABLE IF EXISTS `reservacoche`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservacoche` (
  `numreserva` int(11) NOT NULL,
  `matricula` varchar(7) NOT NULL,
  `gasolina` int(11) DEFAULT '0',
  PRIMARY KEY (`numreserva`,`matricula`),
  KEY `matricula` (`matricula`),
  CONSTRAINT `reservacoche_ibfk_1` FOREIGN KEY (`numreserva`) REFERENCES `reserva` (`numreserva`),
  CONSTRAINT `reservacoche_ibfk_2` FOREIGN KEY (`matricula`) REFERENCES `coche` (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservacoche`
--

LOCK TABLES `reservacoche` WRITE;
/*!40000 ALTER TABLE `reservacoche` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservacoche` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-14 13:05:13
