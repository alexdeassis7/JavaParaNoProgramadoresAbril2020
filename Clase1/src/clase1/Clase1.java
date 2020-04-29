/** soy un comentario de
 * bloque
 */
//comentarios de linea asdasd
package clase1;
//importando una libreria de utilidades Java

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        //main :punto de inicio de ejecucion de nuetro programa

        //declaro un Scanner para poder tomar datos del teclado 
        Scanner teclado = new Scanner(System.in);

        //definimos e inicializamos las variables 
        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        //solicitamos datos al usuario 
        System.out.println(" ingrese el primer numero");
        //capturar el dato ingresado 
        num1 = teclado.nextInt();

        //solicitamos datos al usuario 
        System.out.println(" ingrese el segundo numero");
        //capturar el dato ingresado 
        num2 = teclado.nextInt();

        //procesamos la informacion ingresada por el usuario 
        resultado = num1 + num2;

        //mostramos la salida del programa 
        System.out.println("El Resultado de la suma es : " + resultado);

    }

}
