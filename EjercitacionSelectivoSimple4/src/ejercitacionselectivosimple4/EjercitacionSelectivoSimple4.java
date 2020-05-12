/*
4) Que lea dos números  y los imprima por pantalla en forma ascendente
 */
package ejercitacionselectivosimple4;

import java.util.Scanner;

public class EjercitacionSelectivoSimple4 {

    public static void main(String[] args) {
        //variables de trabajo
        int num1 = 0, num2 = 0;
        Scanner teclado = new Scanner(System.in);

        //solicitando datos a usuario 
        System.out.println("ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        num2 = teclado.nextInt();

        System.out.println("numero de forma ascendente");
        if (num1 > num2) {
            System.out.println(num2 + " - " + num1);
        } else {
            System.out.println(num1 + " - " + num2);
        }
    }

}
