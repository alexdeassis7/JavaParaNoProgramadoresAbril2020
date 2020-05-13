/*Ciclo con numero determinado de iteraciones  */
package clase3ciclofor;

import java.util.Scanner;

/**
 * Calcular el promedio de un alumno que tiene 7 calificaciones en la materia
 * Disenio de algoritmos
 */
public class Clase3CicloFor {

    public static void main(String[] args) {
        float calificacion = 0, promedio = 0;
        //variables de tipo acumulador 
        float acumuladorNotas = 0;
        Scanner teclado = new Scanner(System.in);
        int cantidadDeNotas = 0 ;
        System.out.println("cuantasa notas desea ingresar ???");
        cantidadDeNotas = teclado.nextInt();
        
        for (int x = 1; x <= cantidadDeNotas; x++) {

            System.out.println("ingrese la nota " + x);
            calificacion = teclado.nextFloat();
            //acumulamos las 7  notas
            acumuladorNotas = acumuladorNotas + calificacion;
        }
        System.out.println("Acumulador es igual a  : " + acumuladorNotas);
        promedio = acumuladorNotas / cantidadDeNotas;
        System.out.println("el promedio de las notas es :" + promedio);
        System.out.println("fin del programa ");

    }

}
