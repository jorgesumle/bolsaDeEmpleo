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

/**
 * Clase principal.
 * @author Jorge Maldonado Ventura
 */
public class BolsaDeEmpleo {
    private static final String MAIN_OPTIONS = "�Qu� quieres hacer?\n"
            + "    1) Insertar datos.\n"
            + "    2) Realizar una consulta.\n"
            + "    3) Borrar datos.\n"
            + "    4) Salir del programa\n>>> ",
    INSERTION_OPTIONS = "Elige una opci�n:\n"
            + "    1) Insertar contrato.\n"
            + "    2) Insertar curso.\n"
            + "    3) Insertar demandante.\n"
            + "    4) A�adir curso a demandante.\n"
            + "    5) A�adir t�tulo oficial a demandante.\n"
            + "    6) A�adir idioma a demandante.\n"
            + "    7) Insertar Idioma.\n"
            + "    8) Insertar oferta.\n"
            + "    9) Insertar ofertante.\n"
            + "    10) Insertar t�tulo oficial.\n"
            + "    11) Volver al men� anterior.\n>>> ";
    private static DatabaseConnection databaseConnection;

    protected static DatabaseConnection getDatabaseConnection() {
        return databaseConnection;
    }
    
    public static void main(String[] args) {
        databaseConnection = new DatabaseConnection("bolsaEmpleo", "root", "jdbc:mysql://localhost/");
        Connection connection = databaseConnection.connect();
        mainMenu();
        databaseConnection.disconnect(connection);
    }
    
    /**
     * Muestra el men�, que permite que el usuario realice las operaciones
     * disponibles. Cada opci�n es un tipo de operaci�n.
     */
    public static void mainMenu(){
        byte option;
        do{
            option = Input.byteInput(MAIN_OPTIONS);
            switch(option){
                case 1:
                    insertionMenu();
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
    
    /**
     * Men� que permite al usuario realizar las operaciones de inserci�n en
     * la base de datos.
     */
    public static void insertionMenu(){
        byte option;
        do{
            option = Input.byteInput(INSERTION_OPTIONS);
            switch(option){
                case 1:
                    break;
                case 2:
                    Curso curso = new Curso(Input.input("Nombre del curso\n>>> "));
                    curso.insert();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
            }
        } while(option != 11);
    }
    
}
