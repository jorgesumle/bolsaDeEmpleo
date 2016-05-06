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
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Contiene métodos para la realización de operaciones DML sobre la base de datos.
 * @author Jorge Maldonado Ventura
 */
public class DML {
    public static void executeUpdate(String query, Connection connection){
        try{
            Statement st = connection.createStatement();
            int result = st.executeUpdate(query);
            if(result == 1){
                System.out.println("Operación realizada con éxito.");
            } else{
                System.out.println("Ha ocurrido un error durante la operación.");
            }
            st.close();
        } catch(SQLException e){
            System.out.println("Esta sentencia SQL ha fallado: " + query);
            e.getErrorCode();
        }
    }
}
