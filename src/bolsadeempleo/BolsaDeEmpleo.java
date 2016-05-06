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
 * Clase principal.
 * @author Jorge Maldonado Ventura
 */
public class BolsaDeEmpleo {
    private static final String MAIN_OPTIONS = "¿Qué quieres hacer?\n"
            + "    1) Insertar datos.\n"
            + "    2) Realizar una consulta.\n"
            + "    3) Borrar datos.\n"
            + "    4) Salir del programa\n>>> ",
    INSERTION_OPTIONS = "Elige una opción:\n"
            + "    1) Insertar contrato.\n"
            + "    2) Insertar curso.\n"
            + "    3) Insertar demandante.\n"
            + "    4) Añadir curso a demandante.\n"
            + "    5) Añadir título oficial a demandante.\n"
            + "    6) Añadir idioma a demandante.\n"
            + "    7) Insertar idioma.\n"
            + "    8) Insertar oferta.\n"
            + "    9) Insertar ofertante.\n"
            + "    10) Insertar título oficial.\n"
            + "    11) Volver al menú anterior.\n>>> ",
    DELETION_OPTIONS = "Elige una opción:\n"
            + "    1) Borrar contrato.\n"
            + "    2) Borrar curso.\n"
            + "    3) Borrar demandante.\n"
            + "    4) Borrar curso de demandante.\n"
            + "    5) Borrar título oficial de demandante.\n"
            + "    6) Borrar idioma de demandante.\n"
            + "    7) Borrar idioma.\n"
            + "    8) Borrar oferta.\n"
            + "    9) Borrar ofertante.\n"
            + "    10) Borrar título oficial.\n"
            + "    11) Volver al menú anterior.\n";
            
            
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
     * Muestra el menú, que permite que el usuario realice las operaciones
     * disponibles. Cada opción es un tipo de operación.
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
                    deletionMenu();
                    break;
                case 4:
                    break;
            }
        } while(option != 4);
    }
    
    /**
     * Menú que permite al usuario realizar las operaciones de inserción en
     * la base de datos.
     */
    public static void insertionMenu(){
        byte option;
        final String ANOTHER_INSERT_TEXT = "Introduce 's' para insertar otro registro y cualquier otra tecla para volver al menú anterior\n>>> ";
        do{
            option = Input.byteInput(INSERTION_OPTIONS);
            switch(option){
                case 1:
                    break;
                case 2:
                    do{
                        Curso curso = new Curso(Input.input("Nombre del curso\n>>> "));
                        curso.insert();
                    } while(Input.yesOrNoQuestion(ANOTHER_INSERT_TEXT));
                    break;
                case 3:
                    do{
                        Demandante demandante = new Demandante(Input.input("DNI\n>>> "), 
                                Input.input("Nombre\n>>>"), 
                                Input.input("Primer apellido\n>>> "), 
                                Input.input("Segundo apellido\n>>> "), 
                                Input.input("Dirección\n>>> "), 
                                Input.input("Correo electrónico\n>>> "), 
                                CalendarUtils.createCalendarDate(Input.byteInput("Día de nacimiento\n>>> "), 
                                        Input.byteInput("Mes de nacimiento\n>>> "), 
                                        Input.shortInput("Año de nacimiento\n>>> ")),
                                Input.input("Consideraciones\n>>> "));
                                demandante.insert();
                    } while(Input.yesOrNoQuestion(ANOTHER_INSERT_TEXT));
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

    private static void deletionMenu() {
        byte option;
        do{
            option = Input.byteInput(DELETION_OPTIONS);
            switch(option){
                case 1: 
                    break;
                case 2:
                    Curso curso = new Curso(Input.input("Nombre del curso\n>>> "));
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
