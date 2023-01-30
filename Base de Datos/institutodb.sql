 DROP DATABASE IF EXISTS institutodb;
 CREATE DATABASE institutodb CHARACTER SET utf8mb4; 
 USE institutodb;

 CREATE TABLE alumno (
   id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
   nombre VARCHAR(100) NOT NULL,
   apellido1 VARCHAR(100) NOT NULL,
   apellido2 VARCHAR(100),
   fecha_nacimiento DATE NOT NULL, 
   es_repetidor ENUM('si', 'no') NOT NULL, 
   telefono VARCHAR(9)
 );

 INSERT INTO alumno VALUES(1, 'Maria', 'Sanchez', NULL, '1990/12/01', 'no', NULL);
 INSERT INTO alumno VALUES(2, 'Juan', 'Saez', 'Vega', '1998/04/02', 'no', 618253876);
 INSERT INTO alumno VALUES(3, 'Pepe', 'Ramirez', 'Gea', '1988/01/03', 'no', NULL); 
 INSERT INTO alumno VALUES(4, 'Lucia', 'Sanchez', 'Ortega', '1993/06/13', 'si', 678516294);
 INSERT INTO alumno VALUES(5, 'Paco', 'Martinez', 'Lopez', '1995/11/24', 'no', 692735409);
 INSERT INTO alumno VALUES(6, 'Irene', 'Gutierrez', 'Sanchez', '1991/03/28', 'si', NULL);
 INSERT INTO alumno VALUES(7, 'Cristina', 'Fernandez', 'Ramirez', '1996/09/17', 'no', 628349590);
 INSERT INTO alumno VALUES(8, 'Antonio', 'Carretero', 'Ortega', '1994/05/20', 'si', 612345633);
 INSERT INTO alumno VALUES(9, 'Manuel', 'Dominguez', 'Hernandez', '1999/07/08', 'no', NULL);
 INSERT INTO alumno VALUES(10, 'Daniel', 'Moreno', 'Ruiz', '1998/02/03', 'no',NULL);
 INSERT INTO alumno VALUES(11, 'Pepe', 'Sanchez', 'Acedo', '1997/05/23', 'si',251222555);
 INSERT INTO alumno VALUES(12, 'Samuel', 'Sanchez', 'Acedo', '1998/11/23', 'si',251333777);
 INSERT INTO alumno VALUES(13, 'Juan', 'Sanchez', 'Acedo', '2000/12/20', 'si',251333444);
 INSERT INTO alumno VALUES(14, 'Zacarias', 'Sanchez', 'Acedo', '2001/12/25', 'si',251333555);