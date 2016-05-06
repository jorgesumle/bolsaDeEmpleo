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

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Se encarga de las operaciones de entrada de datos por teclado.
 * @author Jorge Maldonado Ventura 
 */
public class Input {
    
    /**
     * Introduce un número entre -128 y 127 por teclado.
     * @param message el mensaje que aparece al preguntar por el número.
     * @return el número introducido.
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
     * Introduce una cadena alfanumérica por teclado.
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
    
    public static boolean yesOrNoQuestion(String question){
        boolean response = false;
        String answer = input(question);
        if(answer.charAt(0) == 's'){
            response = true;
        } else{
            response = false;
        }
        return response;
    }

}