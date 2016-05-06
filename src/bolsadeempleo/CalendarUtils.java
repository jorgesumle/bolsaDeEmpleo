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

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Métodos utiles para la manipulación de objetos Calendar.
 * @author Jorge Maldonado Ventura
 */
public class CalendarUtils {
    
    /**
     * Devuelve el formato para el tipo date de MySQL en forma de cadena. Solo
     * transforma la fecha, con lo cual se pierde precisión.
     * @param calendar el objeto Calendar que se quiere pasar a formato de MySQL para fechas (date).
     * @return el formato para MySQL del objeto Calendar. 
     */
    protected static String mySQLDateFormat(Calendar calendar){
        SimpleDateFormat mySQLDate = new SimpleDateFormat("yyyy-MM-dd");
        return mySQLDate.format(calendar.getTime());
    }
    
    /**
     * Crea un objeto calendar para una fecha del calendario. Pierde precisión para
     * las horas, minutos segundos, etc.
     * @param day el día.
     * @param month el mes.
     * @param year el año.
     * @return el objeto calendar con precisión de fecha de calendario.
     */
    protected static Calendar createCalendarDate(byte day, byte month, int year){
        Calendar cal = Calendar.getInstance();
        cal.set(year, (month - 1), day, 0, 0, 0);
        return cal;
    }
}
