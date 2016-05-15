USE bolsaEmpleo;

INSERT INTO cursos (nombreCurso) VALUES
('Mecanografía'),
('Ofimática'),
('Introducción al software libre'),
('Taller de ofimática');

INSERT INTO estudios (nombreTitulo) VALUES
('Desarrollo de Aplicaciones Web'),
('Desarrollo de Aplicaciones Multiplataforma'),
('Traducción e Interpretación (Alemán)'),
('Traducción e Interpretación (Inglés)');

INSERT INTO idiomas (nombreIdioma) VALUES
('Inglés'),
('Alemán'),
('Francés'),
('Italiano'),
('Ruso'),
('Chino'),
('Coreano'),
('Árabe'),
('Griego'),
('Ucraniano'),
('Polaco'),
('Sueco');

INSERT INTO ofertantes (nif, nombreEmpresa) VALUES
('54373755F', 'Luz Mayor'),
('46672335E', 'Red Hat'),
('64380959A', 'Canonical');

INSERT INTO demandantes (dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones) VALUES
('12293389G', 'Juan', 'Hernández', 'Escobar', 'Calle Fuente 23', 'No tiene.', '1976-05-23', 'Es ciego.'),
('79309251F', 'David', 'López', 'García', 'Calle Azaña 21', 'deividman@mail.com', '1988-01-20', ''),
('39454620Y', 'Álvaro', 'Cuadrado', 'Aguilera', 'Calle Palmera 2', 'rondd@gmail.com', '1979-04-03', '');

INSERT INTO antiguosDemandantes (dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, fechaDeBaja, consideraciones)
VALUES
('10912122W', 'Javier', 'Álvarez', 'García', 'Calle Rosa 23', 'javiis@hotmail.com', '1995-03-02', '2015-06-30', '');

INSERT INTO ofertas (titulo, fechaCreacion, descripcion, categoria, ubicacion, vacantes, nifOfertante) VALUES
('Administrador Linux/Shell', '2016-06-01', 'Empresa X precisa incorporar un Administrador Linux con al
menos 2 años de experiencia...', 'Informática', 'Barcelona', 1, '54373755F'),
('Frontend Software Engineer', '2016-04-02', 'Buscamos a un 
excepcional Frontend Software Engineer para nuestro equipo de Product Advertising,
que da soporte a todos nuestros portales.', 'Informática', 'Valencia', 1, '64380959A');

INSERT INTO contratos (idOferta, nifOfertante, idDemandante, fechaFin, fechaInicio, salario, localidad) VALUES
(1, '54373755F', 1, '2016-05-14', '2013-02-24', 1200.32, 'Almería'),
(2, '64380959A', 3, '', '2014-09-02', 2400.23, 'Girona');

INSERT INTO demandantesCurso (idCurso, idDemandante, fechaFinalizacion) VALUES 
(1, 2, '2010-02-03'),
(1, 1, '2009-02-03'),
(2, 3, '2014-06-15');

INSERT INTO demandantesEstudios (idDemandante, idTitulo, fechaFinalizacion) VALUES
(3, 3, '2015-05-30'),
(2, 1, '2014-02-25'),
(1, 4, '2000-04-01');

INSERT INTO demandantesIdiomas (idDemandante, idIdioma, nivel) VALUES
(2, 3, 'B1'),
(1, 3, 'C1'),
(3, 5, 'A1');