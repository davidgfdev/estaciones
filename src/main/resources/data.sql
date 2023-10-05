DROP TABLE estaciones;

CREATE TABLE `railes`.`estaciones` (
  `id_estacion` INT NOT NULL,
  `nombre_estacion` VARCHAR(45) NULL,
  `ubicacion` VARCHAR(45) NULL,
  PRIMARY KEY (`id_estacion`));


insert into estaciones values
(1, 'Sants', 'Barcelona'),
(2, 'Gràcia', 'Barcelona'),
(3, 'Camp de Tarragona', 'Tarragona'),
(4, 'Puerta de Atocha', 'Madrid'),
(5, 'Joaquín Sorolla', 'Valencia');