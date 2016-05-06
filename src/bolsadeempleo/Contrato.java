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
 * Un contrato que se ha producido gracias a la bolsa de empleo. Está vinculado
 * con la tabla contratos de la base de datos.
 * @author Jorge Maldonado Ventura
 */
public class Contrato {
    private static final String tableName = "contratos";
    private int id;
    private int idOferta;
    private String nifOfertante;
    private int idDemandante;
    private Calendar fechaInicio;
    private Calendar fechaFin;
    private float salario;
    private String localidad;

    public Contrato(int idOferta, String nifOfertante, int idDemandante, Calendar fechaInicio, Calendar fechaFin, float salario, String localidad) {
        this.idOferta = idOferta;
        this.nifOfertante = nifOfertante;
        this.idDemandante = idDemandante;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.salario = salario;
        this.localidad = localidad;
    }
    
    /**
     * Inserta un contrato en la tabla "contratos" de la base de datos.
     */
    public void insert(){
        String SQLCode = "INSERT INTO " + tableName + " (idOferta, nifOfertante, idDemandante, fechaInicio, fechaFin, salario, localidad) "
                + "VALUES(" + String.format("%d, '%s', %d, '%s', '%s', '%s', '%s'", idOferta, nifOfertante, idDemandante, CalendarUtils.mySQLDateFormat(fechaInicio), CalendarUtils.mySQLDateFormat(fechaFin), salario, localidad) + ");"; 
        DML.executeUpdate(SQLCode, BolsaDeEmpleo.getDatabaseConnection().getConnection());
    }
    
}
