 
## ¿Cómo crear la base de datos que usa el programa?

El código para la creación de la base de datos se encuentra en la carpeta MySQLDatabase. Puedes ejecutar el código con MySQL directamente desde consola, ejecuta este código desde la carpeta raíz del proyecto:
`mysql -u tuUsuario -p < MySQLDatabase/createDatabase.sql`
Después de ejecutarlo deberás introducir la contraseña de tuUsuario.
En la carpeta MySQLDatabase hay otros códigos MySQL, para ejecutarlos sigue el mismo procedimiento mostrado anteriormente, solo tienes que cambiar el nombre del archivo .sql. Para ejecutar algunos archivos puede ser necesario especificar el nombre de la base de datos, simplemente pon el bolsaEmpleo después del comando mysql, por ejemplo: `mysql bolsaEmpleo -u tuUsuario -p < MySQLDatabase/moveToTableAntiguosDemandantes.sql`.

Si estás trabajando con xampp, quizás debas especificar la ruta donde se encuentra MySQL: `C:\xampp\mysql\bin\mysql -u tuUsuario -p < MySQLDatabase/createDatabase.sql`. Asegurate de que introduces la ruta de donde tienes instalado MySQL dentro de xampp, puede que la del ejemplo no coincida con la tuya. Si quieres que invocar a MySQL sea más sencillo, simplemente modifica la variable de sistema PATH.

## ¿Cómo empiezo a usar la base de datos?

Una vez tengas creada la base de datos quizás quieras hacer pruebas con ella para comprobar
si se adapta a tus necesidades. Para ello puedes insertarle datos de prueba desde la aplicación Java
o mediante sentencias SQL. Sin embargo, es muy engorroso insertar datos en todas las tablas con sentencias
SQL o incluso desde el programa Java. Para realizar pruebas de forma rápida, podéis encontrar en la carpeta
MySQLDatabase un archivo llamado sampleValues.sql, con valores de muestra. Con esta simple sentencias
no perderás el tiempo insertando valores de prueba, que luego borrarás:
`mysql -u tuUsuario -p < MySQLDatabase/sampleValues.sql`