package clase2estructurascondicionales;
import java.util.Scanner;
/* Determinar si un alumno aprueba un curso de programación,sabiendo que aprobara 
si su promedio de tres calificaciones es mayor o igual a 7, reprueba en caso contrario.*/
public class Clase2EstructurasCondicionales {
    public static void main(String[] args) {
        //definimos las variables de trabajo
        float notaUno = 0 , notaDos =0 , notaTres = 0 , promedio = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al usuario 
        System.out.println("Ingrese la nota 1");
        notaUno = teclado.nextFloat();
        
        System.out.println("Ingrese la nota 2");
        notaDos = teclado.nextFloat();
       
        System.out.println("Ingrese la nota 3");
        notaTres = teclado.nextFloat();
        //procesamos la informacion 
        promedio = (notaUno + notaDos + notaTres) / 3;

        if(promedio >= 7){
            System.out.println("Esta aprobado su promedio es :" + promedio );
        }else{
            System.out.println("Esta Reprobado su promedio es :" + promedio );
        }
    }

}
