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

/**
 * 
 * @author Jorge Maldonado Ventura
 */
public class Curso {
    private static final String tableName = "cursos";
    private int idCurso;
    private String nombreCurso;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
    
    /**
     * Inserta un curso en la tabla "cursos" de la base de datos.
     */
    public void insert(){
        String SQLCode = "INSERT INTO " + tableName + "(nombreCurso) VALUES('" + nombreCurso + "');"; 
        DML.executeUpdate(SQLCode, BolsaDeEmpleo.getDatabaseConnection().getConnection());
    }
}
