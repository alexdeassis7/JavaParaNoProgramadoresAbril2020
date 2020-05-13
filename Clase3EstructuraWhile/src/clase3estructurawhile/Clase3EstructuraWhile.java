/*
Estrucutura Ciclicas
 */
/** Crear un algoritmo que permita realizar 3 veces lo siguiente :
 * ingresar dos numeros calcular su suma e informar el resultado */
package clase3estructurawhile;

import java.util.Scanner;

public class Clase3EstructuraWhile {

    public static void main(String[] args) {
        //variables de trabajo 
        int num1 = 0, num2 = 0, resultado = 0;
        int contador = 0 ;
        Scanner teclado = new Scanner(System.in);
        while (contador < 3) {
            //acciones a ejecutar si se cumple la condicion
            System.out.println("ingrese el numero 1");
            num1 = teclado.nextInt();
            System.out.println("ingrese el numero 2");
            num2 = teclado.nextInt();
            resultado = num1 + num2;
            System.out.println("EL resultado es  :" + resultado);
            //incrementamos el   contador 
            //contador = contador + 1 ;
            contador++ ; //operador autoincremental 
                
        }
        //1
        /**
         * System.out.println("ingrese el numero 1"); num1 = teclado.nextInt();
         * System.out.println("ingrese el numero 2"); num2 = teclado.nextInt();
         * resultado = num1 + num2; System.out.println("EL resultado es :" +
         * resultado); //2 System.out.println("ingrese el numero 1"); num1 =
         * teclado.nextInt(); System.out.println("ingrese el numero 2"); num2 =
         * teclado.nextInt(); resultado = num1 + num2; System.out.println("EL
         * resultado es ;" + resultado); //3 System.out.println("ingrese el
         * numero 1"); num1 = teclado.nextInt(); System.out.println("ingrese el
         * numero 2"); num2 = teclado.nextInt(); resultado = num1 + num2;
         * System.out.println("EL resultado es ;" + resultado);
         */

    }

}
