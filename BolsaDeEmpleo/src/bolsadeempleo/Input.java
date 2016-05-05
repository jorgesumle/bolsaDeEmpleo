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

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Se encarga de las operaciones de entrada de datos por teclado.
 * @author Jorge Maldonado Ventura 
 */
public class Input {
    
    /**
     * Introduce un n�mero entre -128 y 127 por teclado.
     * @param message el mensaje que aparece al preguntar por el n�mero.
     * @return el n�mero introducido.
     */
    public static byte byteInput(String message){
        System.out.print(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean validAnswer = false;
        byte value = 0;
        while (!validAnswer){
            try{
                value = Byte.parseByte(br.readLine()); validAnswer = true;
            }
            catch(Exception e){
                System.out.print("Por favor introduce un valor adecuado. \n>>>");
            }
        }
        return value;
    }
    
    /**
     * Introduce una cadena alfanum�rica por teclado.
     * @param message el mensaje que aparece cuando el programa pregunta por el texto.
     * @return el texto introducido.
     */
    public static String input(String message){
        System.out.print(message);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean validAnswer = false;
        String value = "";
        while (!validAnswer){
            try{
                value = br.readLine(); validAnswer = true;
            }
            catch(Exception e){
                System.out.print("Por favor introduce un valor adecuado. \n>>>");
            }
        }
        return value;
    }

}