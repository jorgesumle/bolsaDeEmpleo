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

import java.util.Calendar;

/**
 *
 * @author Jorge Maldonado Ventura
 */
public class Contrato {
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
     * Inserta un contrato en la base de datos.
     */
    public void insertContrato(){
        String SQLCode = "INSERT INTO contratos (idOferta, nifOfertante, idDemandante, fechaInicio, fechaFin, salario, localidad) "
                + "VALUES(" + String.format("%d, '%s', %d, '%s', ", idOferta, nifOfertante, idDemandante, fechaInicio) + ");"; 
        //DML.updateTable(SQLCode);
    }
    
    
}
