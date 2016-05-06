 
## ¿Cómo crear la base de datos que usa el programa?

El código para la creación de la base de datos se encuentra en la carpeta MySQLDatabase. Puedes ejecutar el código con MySQL directamente desde consola, ejecuta este código desde la carpeta raíz del proyecto:
`mysql -u tuUsuario -p < MySQLDatabase/createDatabase.sql`
Después de ejecutarlo deberás introducir la contraseña de tuUsuario.
En la carpeta MySQLDatabase hay otros códigos MySQL, para ejecutarlos sigue el mismo procedimiento mostrado anteriormente, solo tienes que cambiar el nombre del archivo .sql. Para ejecutar algunos archivos puede ser necesario especificar el nombre de la base de datos, simplemente pon el bolsaEmpleo después del comando mysql, por ejemplo: `mysql bolsaEmpleo -u tuUsuario -p < MySQLDatabase/moveToTableAntiguosDemandantes.sql`.

Si estás trabajando con xampp, quizás debas especificar la ruta donde se encuentra MySQL: `C:\xampp\mysql\bin\mysql -u tuUsuario -p < MySQLDatabase/createDatabase.sql`. Asegurate de que introduces la ruta de donde tienes instalado MySQL dentro de xampp, puede que la del ejemplo no coincida con la tuya. Si quieres que invocar a MySQL sea más sencillo, simplemente modifica la variable de sistema PATH.