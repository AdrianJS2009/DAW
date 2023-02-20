DROP DATABASE IF EXISTS examalqdb;
CREATE DATABASE IF NOT EXISTS examalqdb;
USE examalqdb;


DROP TABLE IF EXISTS `alquileres`;
CREATE TABLE `alquileres` (
  `codalquiler` int(11) NOT NULL AUTO_INCREMENT,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellido1` varchar(30) NOT NULL,
  `apellido2` varchar(30),
  `fechanac` date,
  `tfno` varchar(9),
  `fechasalida` date,
  `fechaentrega` date,
  PRIMARY KEY (`codalquiler`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `coches`;
CREATE TABLE `coches` (
  `matricula` varchar(8) NOT NULL,
  `modelo` varchar(20) NOT NULL,
  `color` varchar(20) NOT NULL,
  `marca` varchar(15) NOT NULL,
  `preciodia` int(5) DEFAULT NULL,
  PRIMARY KEY (`matricula`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `alquileres` VALUES (1,'17102z','Pablillo','Roque',NULL,'2000/01/01','45252100','2022/01/01','2022/01/12');
INSERT INTO `alquileres` VALUES (2,'102000o','Pablete','Roman','Luque','1997/11/03','245252100','2022/01/01','2022/01/07');
INSERT INTO `alquileres` VALUES (3,'33200200','Luisa','Santos','Sanchez','1998/05/01',NULL,'2022/01/01','2022/01/03');
INSERT INTO `alquileres` VALUES (4,'1000x','Pablote','Roca','Zarria','1994/01/23',NULL,'2022/01/02','2022/01/10');
INSERT INTO `alquileres` VALUES (6,'66200200','Ana','Ruiz','Sanchez','1977/08/21','661223344','2022/01/02','2022/02/10');
INSERT INTO `alquileres` VALUES (7,'77200200','Ana','Lopez','Sanchez','1972/09/05','771223344','2022/01/02','2022/01/18');
INSERT INTO `alquileres` VALUES (8,'88200200','Ana','Gamez','Lopez','1978/12/11','881223344','2022/01/03','2022/01/06');
INSERT INTO `alquileres` VALUES (9,'99100200','Marcos','Dominguez','Sanchez','1975/11/17','991223344','2022/01/03','2022/01/16');
INSERT INTO `alquileres` VALUES (10,'10100200','Ines','Sanchez','Ramirez','2001/05/15','101223300','2022/01/03','2022/01/20');
INSERT INTO `alquileres` VALUES (11,'11100201','Marcos','Ramos','Gamez','2000/04/09','111223301','2022/01/03','2022/01/06');
INSERT INTO `alquileres` VALUES (13,'22222101','Juan','Gomez','Lopez','1990/09/11','111909090','2022/01/04','2022/01/11');
INSERT INTO `alquileres` VALUES (14,'22222102','Roberto','Sanchez','Lopez','1998/11/09','111909091','2022/01/04','2022/02/01');
INSERT INTO `alquileres` VALUES (15,'22222103','Rocio','Sanchez','Lopez','2002/01/12',NULL,'2022/01/05','2022/01/06');
INSERT INTO `alquileres` VALUES (16,'22222104','Amelia','Sanchez','Lopez','2003/01/01','111909093','2022/01/05','2022/01/10');
INSERT INTO `alquileres` VALUES (17,'22222105','Jorge','Gomez','Lopez','2002/12/31','111909094','2022/01/07','2022/01/18');
INSERT INTO `alquileres` VALUES (18,'22222106','Manuel','Gomez','Lopez','1995/12/25','111909095','2022/01/07','2022/01/14');
INSERT INTO `alquileres` VALUES (19,'22222110','Maria','Garcia','Lopez','1999/05/01','111909107','2022/01/07','2022/01/17');
INSERT INTO `alquileres` VALUES (22,'10102102z','Pablo','Robles',NULL,'1990/07/18','452521','2022/01/09','2022/01/18');
INSERT INTO `alquileres` VALUES (30,'11100202','Rafael','Rafael',NULL,'1976/10/19','111223302','2022/01/09','2022/01/18');
INSERT INTO `alquileres` VALUES (33,'44200200','Jorge','Ruiz','Sanchez','1974/06/01','441223344','2022/01/09','2022/01/18');
INSERT INTO `alquileres` VALUES (34,'77200200','Ana','Lopez','Sanchez','1972/09/05','771223344','2022/01/10','2022/01/14');
INSERT INTO `alquileres` VALUES (35,'77200200','Ana','Lopez','Sanchez','1972/09/05','771223344','2022/01/18','2022/01/20');
INSERT INTO `alquileres` VALUES (36,'77200200','Ana','Lopez','Sanchez','1972/09/05','771223344','2022/01/25','2022/01/28');
INSERT INTO `alquileres` VALUES (37,'99100200','Marcos','Dominguez','Sanchez','1975/11/17','991223344','2022/01/26','2022/01/28');
INSERT INTO `alquileres` VALUES (38,'10100200','Ines','Sanchez','Ramirez','2001/05/15','101223300','2022/01/26','2022/01/30');
INSERT INTO `alquileres` VALUES (39,'11100201','Marcos','Ramos','Gamez','2000/04/09','111223301','2022/01/27','2022/02/02');


INSERT INTO `coches` VALUES ('1111DAA','Zafira','Azul','Opel',25);
INSERT INTO `coches` VALUES ('2222ABB','Corolla','Blanco','Toyota',30);
INSERT INTO `coches` VALUES ('2233ABK','Corsa','Blanco','Opel',20);
INSERT INTO `coches` VALUES ('2763AFF','Corsa','Beig','Opel',20);
INSERT INTO `coches` VALUES ('3333GTA','Picasso','Blanco','Citroen',35);
INSERT INTO `coches` VALUES ('4114GTA','Picasso','Rojo','Citroen',35);
INSERT INTO `coches` VALUES ('0962DSF','Yaris','Verde','Toyota',25);
INSERT INTO `coches` VALUES ('0972GDA','Rav-4','Verde','Toyota',40);
INSERT INTO `coches` VALUES ('9963KFF','Vectra','Beig','Opel',40);
INSERT INTO `coches` VALUES ('MA0962CF','Yaris','Verde','Toyota',25);
INSERT INTO `coches` VALUES ('CA0972X','Rav-4','Verde','Toyota',40);
INSERT INTO `coches` VALUES ('M9963Z','Vectra','Beig','Opel',40);
INSERT INTO `coches` VALUES ('M9963CZ','Vectra','Beig','Opel',40);
