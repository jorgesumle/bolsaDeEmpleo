DROP DATABASE IF EXISTS bolsaEmpleo;
CREATE DATABASE IF NOT EXISTS bolsaEmpleo;

USE bolsaEmpleo;
CREATE TABLE cursos(
	idCurso INT PRIMARY KEY,
	nombreCurso VARCHAR(100) 
); 

CREATE TABLE estudios(
	idTitulo INT PRIMARY KEY,
	nombreTitulo VARCHAR(100) 
); 

CREATE TABLE idiomas(
	idIdioma INT PRIMARY KEY,
	nombreIdioma VARCHAR(100) 
);

CREATE TABLE ofertantes(
	nif CHAR(9) PRIMARY KEY,
	nombreEmpresa VARCHAR(60)
);

CREATE TABLE demandantes(
	id INT PRIMARY KEY AUTO_INCREMENT ,
	dni CHAR(9) NOT NULL,
	nombre VARCHAR(40) NOT NULL,
	apellido1 VARCHAR(40) NOT NULL,
	apellido2 VARCHAR(40),
	direccion VARCHAR(100) NOT NULL,
	email VARCHAR(320),
	fechaNacimiento DATE NOT NULL,
	consideraciones VARCHAR(100)
);

CREATE TABLE antiguosDemandantes(
	dni CHAR(9) PRIMARY KEY,
	nombre VARCHAR(40) NOT NULL,
	apellido1 VARCHAR(40) NOT NULL,
	apellido2 VARCHAR(40),
	direccion VARCHAR(100) NOT NULL,
	email VARCHAR(320),
	fechaNacimiento DATE NOT NULL,
	fechaDeBaja DATE NOT NULL,
	consideraciones VARCHAR(100)
);

CREATE TABLE ofertas(
	id INT PRIMARY KEY,
	titulo varchar(50) NOT NULL,
	fechaCreacion DATE,
	descripcion VARCHAR(2000),
	categoria VARCHAR(20),
	ubicacion VARCHAR(20),
	vacantes INT(4), 
	nifOfertante CHAR(9),
	FOREIGN KEY (nifOfertante) REFERENCES ofertantes(nif) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE contratos(
	id INT PRIMARY KEY,
	idOferta INT,
	nifOfertante CHAR(9),
	idDemandante INT,
	fechaFin DATE,
	fechaInicio DATE,
	salario DECIMAL(6,2),
	localidad VARCHAR(20),
	FOREIGN KEY (idOferta) REFERENCES ofertas(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (nifOfertante) REFERENCES ofertantes(nif) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idDemandante) REFERENCES demandantes(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE demandantesCurso(
	idCurso INT,
	idDemandante INT,
	fechaFinalizacion DATE,
	PRIMARY KEY(idCurso, idDemandante),
	FOREIGN KEY (idCurso) REFERENCES cursos(idCurso) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idDemandante) REFERENCES demandantes(id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE demandantesEstudios(
	idDemandante INT,
	idTitulo INT,
	fechaFinalizacion DATE,
	PRIMARY KEY (idDemandante, idTitulo),
	FOREIGN KEY (idDemandante) REFERENCES demandantes(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idTitulo) REFERENCES estudios(idTitulo) ON DELETE CASCADE ON UPDATE CASCADE	
);

CREATE TABLE demandantesIdiomas(
	idDemandante INT,
	idIdioma INT,
	nivel CHAR(2),
	PRIMARY KEY(idDemandante, idIdioma),
	FOREIGN KEY (idDemandante) REFERENCES demandantes(id) ON DELETE CASCADE ON UPDATE CASCADE,
	FOREIGN KEY (idIdioma) REFERENCES idiomas(idIdioma) ON DELETE CASCADE ON UPDATE CASCADE
);
