DROP TABLE IF EXISTS `articulos`;
DROP table IF EXISTS `fabricantes`;


CREATE TABLE `fabricantes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `articulos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` varchar(250) NOT NULL,
  `precio` INT NOT NULL,
  `fabricante` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fabricantes_fk` FOREIGN KEY (`fabricante`) REFERENCES `fabricantes` (`id`)
);


insert into fabricantes (nombre)values('PCcomponentes');
insert into fabricantes (nombre)values('Mediamarkt');
insert into fabricantes (nombre)values('Coolmod');
insert into fabricantes (nombre)values('Corte Ingles');
insert into fabricantes (nombre)values('Bauhaus');

insert into articulos (nombre, precio, fabricante) values ('Monitor',250,1);
insert into articulos (nombre, precio, fabricante) values ('TV',350,1);
insert into articulos (nombre, precio, fabricante) values ('Raton',150,2);
insert into articulos (nombre, precio, fabricante) values ('Teclado',250,3);
insert into articulos (nombre, precio, fabricante) values ('Torre',520,4);


