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

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * M�todos utiles para la manipulaci�n de objetos Calendar.
 * @author Jorge Maldonado Ventura
 */
public class CalendarUtils {
    
    /**
     * Devuelve el formato para el tipo date de MySQL en forma de cadena. Solo
     * transforma la fecha, con lo cual se pierde precisi�n.
     * @param calendar el objeto Calendar que se quiere pasar a formato de MySQL para fechas (date).
     * @return el formato para MySQL del objeto Calendar. 
     */
    protected static String mySQLDateFormat(Calendar calendar){
        SimpleDateFormat mySQLDate = new SimpleDateFormat("yyyy-MM-dd");
        return mySQLDate.format(calendar.getTime());
    }
    
    /**
     * Crea un objeto calendar para una fecha del calendario. Pierde precisi�n para
     * las horas, minutos segundos, etc.
     * @param day el d�a.
     * @param month el mes.
     * @param year el a�o.
     * @return el objeto calendar con precisi�n de fecha de calendario.
     */
    protected static Calendar createCalendarDate(byte day, byte month, int year){
        Calendar cal = Calendar.getInstance();
        cal.set(year, (month - 1), day, 0, 0, 0);
        return cal;
    }
}
