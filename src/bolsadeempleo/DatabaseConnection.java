/*
 * Copyright (C) 2016 Jorge Maldonado Ventura
 *
 * Este programa es software libre: usted puede redistruirlo y/o modificarlo
 * bajo los términos de la Licencia Pública General GNU, tal y como está publicada por
 * la Free Software Foundation; ya sea la versión 3 de la Licencia, o
 * (a su elección) cualquier versión posterior.
 *
 * Este programa se distribuye con la intención de ser útil,
 * pero SIN NINGUNA GARANTÍA; incluso sin la garantía implícita de
 * USABILIDAD O UTILIDAD PARA UN FIN PARTICULAR. Vea la
 * Licencia Pública General GNU para más detalles.
 *
 * Usted debería haber recibido una copia de la Licencia Pública General GNU
 * junto a este programa.  Si no es así, vea <http://www.gnu.org/licenses/>.
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
    private Connection connection;
    
    /**
     * Inicializa las variables necesarias para realizar la conexión
     * con una base de datos, la contraseña se debe introducir por teclado.
     * @param databaseName el nombre de la base de datos.
     * @param user el usuario de la base de datos.
     * @param url la URL de la base de datos sin el nombre de la base de datos.
     */
    public DatabaseConnection(String databaseName, String user, String url){
        this.databaseName = databaseName;
        this.user = user;
        this.url = url + databaseName;
        password = Input.input("Introduce tu contraseña, " + user + "\n>>> ");
    }

    public Connection getConnection() {
        return connection;
    }
    
    /**
     * Realiza la conexión con la base de datos usando los atributos de la clase.
     * @return la conexión (Connection).
     */
    public Connection connect() {
        connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(url, user, password);
            if (connection != null) {
                System.out.println("Conexión con la base de datos " + databaseName + " realizada con éxito");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    /**
     * Se desconecta de la base de datos.
     * @param connection la conexión de la base de datos.
     */
    public void disconnect(Connection connection){
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
