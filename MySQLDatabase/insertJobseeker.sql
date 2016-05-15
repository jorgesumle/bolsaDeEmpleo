DELIMITER //
CREATE PROCEDURE insertJobseeker(dniParam CHAR(9), nombre VARCHAR(40), apellido1 VARCHAR(40), apellido2 VARCHAR(40), direccion VARCHAR(100), email VARCHAR(320), fechaNacimiento DATE, consideraciones VARCHAR(100))
BEGIN
    DECLARE existsUser INT;
    SELECT COUNT(*) INTO existsUser FROM antiguosDemandantes WHERE antiguosDemandantes.dni = dniParam;
    IF existsUser = 0 THEN
		INSERT INTO demandantes(dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones) VALUES(dniParam, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones);
	ELSE
		BEGIN
			SELECT existsUser;
			INSERT INTO demandantes(dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones) SELECT dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones FROM antiguosDemandantes;
			DELETE FROM antiguosDemandantes WHERE dni = dniParam;
		END;
	END IF;
END; //
DELIMITER ;
