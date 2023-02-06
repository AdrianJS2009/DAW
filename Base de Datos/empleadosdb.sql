-- SOLO SE CREAN LAS TABLAS
-- HAS DE ACTIVAR LA BASE DE DATOS DONDE COLOCARLAS 
-- ANTES DE LLAMAR AL SCRIPT.

DROP DATABASE IF EXISTS empleadosdb;
CREATE DATABASE empleadosdb CHARACTER SET utf8mb4;
USE empleadosdb;

DROP TABLE IF EXISTS `departamento`;
CREATE TABLE IF NOT EXISTS `departamento` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) NOT NULL,
  `presupuesto` int(11) DEFAULT '0',
  `gastos` int(11) DEFAULT '1500',
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;


DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
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



INSERT INTO `departamento` VALUES (1,'Sistemas',2000,3500);
INSERT INTO `departamento` VALUES (2,'Desarrollo',2000,1500);
INSERT INTO `departamento` VALUES (3,'Recursos Humanos',4000,3500);
INSERT INTO `departamento` VALUES (4,'Ventas',4000,3500);
INSERT INTO `departamento` VALUES (5,'Contabilidad',2000,1500);
INSERT INTO `departamento` VALUES (6,'I+D',4000,7732);


INSERT INTO `empleado` VALUES (1,'20111222x','Julio','Romero','de Torres',1,3);
INSERT INTO `empleado` VALUES (2,'20111333y','Antonio','Reyna','Manescau',6,4);
INSERT INTO `empleado` VALUES (3,'20111444z','Juana','de Arcos',NULL,1,NULL);
INSERT INTO `empleado` VALUES (4,'20111111a','Ada','Bayron',NULL,6,NULL);
INSERT INTO `empleado` VALUES (5,'20222111a','Jimena','Burgos','Madrid',2,NULL);
INSERT INTO `empleado` VALUES (6,'20222555b','Remedios','Varo','Sánchez',2,5);
INSERT INTO `empleado` VALUES (7,'20222666c','Frida','Kalo',NULL,3,8);
INSERT INTO `empleado` VALUES (8,'20222666c','Antonio','Candela','Heredia',3,NULL);
INSERT INTO `empleado` VALUES (9,'20222777r','Maria','Triana','Fuentes',NULL,NULL);
INSERT INTO `empleado` VALUES (10,'20222888h','Fernano','Fernan','Gómez',NULL,NULL);
INSERT INTO `empleado` VALUES (11,'33000111s','Pepe','Ruiz','Santana',2,5);
INSERT INTO `empleado` VALUES (12,'33000222d','David','Ruiz','Santana',3,8);
INSERT INTO `empleado` VALUES (13,'33000333e','David','Ruiz','Ruiz',1,3);
INSERT INTO `empleado` VALUES (14,'33000444R','Pepe','Ruiz','Ruiz',1,3);

