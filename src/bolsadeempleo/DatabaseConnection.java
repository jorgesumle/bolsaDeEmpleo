/*
 * Copyright (C) 2016 Jorge Maldonado Ventura
 *
 * Este programa es software libre: usted puede redistruirlo y/o modificarlo
 * bajo los t�rminos de la Licencia P�blica General GNU, tal y como est� publicada por
 * la Free Software Foundation; ya sea la versi�n 3 de la Licencia, o
 * (a su elecci�n) cualquier versi�n posterior.
 *
 * Este programa se distribuye con la intenci�n de ser �til,
 * pero SIN NINGUNA GARANT�A; incluso sin la garant�a impl�cita de
 * USABILIDAD O UTILIDAD PARA UN FIN PARTICULAR. Vea la
 * Licencia P�blica General GNU para m�s detalles.
 *
 * Usted deber�a haber recibido una copia de la Licencia P�blica General GNU
 * junto a este programa.  Si no es as�, vea <http://www.gnu.org/licenses/>.
 */
package bolsadeempleo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Permite conectarse y desconectarse con una base de datos MySQL.
 * @author Jorge Maldonado Ventura
 */
public class DatabaseConnection {
    
    private String databaseName;
    private String user;
    private String password;
    private String url;
    /**
     * Inicializa las variables necesarias para realizar la conexi�n
     * con una base de datos, la contrase�a se debe introducir por teclado.
     * @param databaseName el nombre de la base de datos.
     * @param user el usuario de la base de datos.
     * @param url la URL de la base de datos sin el nombre de la base de datos.
     */
    public DatabaseConnection(String databaseName, String user, String url){
        this.databaseName = databaseName;
        this.user = user;
        this.url = url + databaseName;
        password = Input.input("Introduce tu contrase�a, " + user + "\n>>> ");
    }
    
    /**
     * Realiza la conexi�n con la base de datos usando los atributos de la clase.
     * @return la conexi�n (Connection).
     */
    public Connection connect() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Conexi�n con la base de datos " + databaseName + " realizada con �xito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    /**
     * Se desconecta de la base de datos.
     * @param connection la conexi�n de la base de datos.
     */
    public void disconnect(Connection connection){
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
