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

/**
 *
 * @author Jorge Maldonado Ventura
 */
public class BolsaDeEmpleo {
    private static final String MAIN_OPTIONS = "¿Qué quieres hacer?\n"
            + "    1) Insertar datos.\n"
            + "    2) Realizar una consulta.\n"
            + "    3) Borrar datos.\n"
            + "    4) Salir del programa\n>>> ";
    private static DatabaseConnection databaseConnection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = new DatabaseConnection("bolsaempleo", "root", "jdbc:mysql://localhost/");
        Connection connection = databaseConnection.connect();
        mainMenu();
        databaseConnection.disconnect(connection);
    }
    
    /**
     * Muestra el menú, que permite que el usuario realice las operaciones
     * disponibles.
     */
    public static void mainMenu(){
        byte option;
        do{
            option = Input.byteInput(MAIN_OPTIONS);
            switch(option){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while(option != 4);
    }
    
}
