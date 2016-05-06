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

import java.util.Calendar;

/**
 *
 * @author Jorge Maldonado Ventura
 */
public class Demandante {
    private static final String tableName = "demandantes";
    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String direccion;
    private String email;
    private Calendar fechaNacimiento;
    private String consideraciones;

    public Demandante(String dni, String nombre, String apellido1, String apellido2, String direccion, String email, Calendar fechaNacimiento, String consideraciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.consideraciones = consideraciones;
    }
    
    /**
     * Inserta un registro en la tabla de demandantes.
     */
    public void insert(){
        String SQLCode = "INSERT INTO " + tableName + "(dni, nombre, apellido1, apellido2, direccion, email, fechaNacimiento, consideraciones)"
                + " VALUES(" + String.format("'%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'", 
                        dni, nombre, apellido1, apellido2, direccion, email, CalendarUtils.mySQLDateFormat(fechaNacimiento), consideraciones) + ");";
        DML.executeUpdate(SQLCode, BolsaDeEmpleo.getDatabaseConnection().getConnection());
    }
    
    public void delete(int id){
        String SQLCode = "DELETE FROM " + tableName + " WHERE id = " + id;
        DML.executeUpdate(SQLCode, BolsaDeEmpleo.getDatabaseConnection().getConnection());
    }
}
