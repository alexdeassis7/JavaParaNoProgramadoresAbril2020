package clase4arrayseduit;

import java.util.Scanner;

public class Clase4ArraysEduIt {
//Calcular el promedio de temperaturas del mes de agosto

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //declaracion 
        float[] temperaturas;
        int tamanioArray = 31;
        float promedio = 0, acumulador = 0;
        temperaturas = new float[tamanioArray];
        
        //solicitamos los datos al usuario mediante un bucle for 
        for (int i = 0; i < tamanioArray; i++) {
            System.out.println("ingrese la temperatura del dia " + (i + 1));
            temperaturas[i] = teclado.nextFloat();
            //acumulamos todas las temperaturas
            acumulador += temperaturas[i];
        }
        promedio = acumulador / tamanioArray;
        //recorremos un array  con bucle for 
        System.out.println("Mostramos los datos del array ");
        for (int i = 0; i < tamanioArray; i++) {
            System.out.println("Temperaturas[" + i + "] = " + temperaturas[i]);
        }

        System.out.println("mostramos el acumulador");
        System.out.println(acumulador);

        System.out.println("mostramos el promedio de temperaturas de agosto ");
        System.out.println(promedio);

    }

}
