CREATE TRIGGER trasladarAAntiguosDemandantes BEFORE DELETE ON demandantes
FOR EACH ROW 
INSERT INTO antiguosDemandantes VALUES (OLD.dni, OLD.nombre, OLD.apellido1, OLD.apellido2, OLD.direccion, OLD.fechaNacimiento, CURDATE(), OLD.consideraciones);
