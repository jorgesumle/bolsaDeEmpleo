DELIMITER //
CREATE PROCEDURE insertJobseeker(dniParam CHAR(9), nombre VARCHAR(40), apellido1 VARCHAR(40), apellido2 VARCHAR(40), direccion VARCHAR(100), email VARCHAR(320), fechaNacimiento DATE, consideraciones VARCHAR(100))
BEGIN
    DECLARE existsUser;
    SELECT COUNT(*) FROM antiguosDemandantes WHERE antiguosDemandantes.dni = dniParam INTO existsUser;
    IF existsUser = 0 THEN
        INSERT INTO demandantes(`dni`, `nombre`, `apellido1`, `apellido2`, `direccion`, `email`, `fechaNacimiento`, `consideraciones`) VALUES(dniParam, nombre, apellido1, apellido2, direccion, email, fechaNacimiento);
    ELSE
        INSERT INTO demandantes SELECT dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones FROM antiguosDemandantes;
        DELETE FROM antiguosDemandantes WHERE antiguosDemandantes.dni = dniParam;
    END IF;
END; //
DELIMITER ;
