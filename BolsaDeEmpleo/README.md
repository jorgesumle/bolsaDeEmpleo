 
## ¿Cómo crear la base de datos que usa el programa?

El código para la creación de la base de datos se encuentra en la carpeta MySQLDatabase. Puedes ejecutar el código con MySQL directamente desde consola, ejecuta este código desde la carpeta raíz del proyecto:
`mysql -u tuUsuario -p < MySQLDatabase/createDatabase.sql`
Después de ejecutarlo deberás introducir la contraseña de tuUsuario.
En la carpeta MySQLDatabase hay otros códigos MySQL, para ejecutarlos sigue el mismo procedimiento mostrado anteriormente, solo tienes que cambiar el nombre del archivo .sql. Para ejecutar algunos archivos puede ser necesario especificar el nombre de la base de datos, simplemente pon el bolsaEmpleo después del comando mysql, por ejemplo: `mysql bolsaEmpleo -u tuUsuario -p < MySQLDatabase/moveToTableAntiguosDemandantes.sql`.
