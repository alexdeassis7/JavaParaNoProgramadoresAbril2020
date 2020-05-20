/*1)Calcular el promedio de 50 valores almacenados en un Vector.
Determinar además cuantos son mayores que el promedio, imprimir el promedio,
 y una lista de valores mayores que el promedio . */
package clase.pkg4.ejercicios.arrays;

public class Clase4EjerciciosArrays {

    public static void main(String[] args) {
        //definimos una constante para la dimension del array 
        final int TAMANIO = 50;
        //defino variable donde alojar el promedio de los 50 valores
        float promedio = 0;
        float acumulador = 0;
        int contadorDeDatosMayoresAlPromedio = 0;
        //definimos e instanciamos el array 
        int[] miArray = new int[TAMANIO];
        int[] listaValoresMayoresAlPromedio;

        //Cargamos el array de manera random
        for (int n = 0; n < TAMANIO; n++) {
            //Casting Explicito 
            miArray[n] = (int) (Math.random() * 100) + 1;
            acumulador += miArray[n];

        }

        promedio = acumulador / TAMANIO;

        //mostramos el array Caragado!
        for (int i = 0; i < TAMANIO; i++) {
            if (miArray[i] > promedio) {
                contadorDeDatosMayoresAlPromedio++;
                // System.out.println("ES MAYOR AL PROMDIO!! : " + miArray[i]);
            }
            System.out.println("mi Array [" + i + "]=" + miArray[i]);
        }

        //creaamos un array donde alojamos los datos mayores al promedio 
        listaValoresMayoresAlPromedio = new int[contadorDeDatosMayoresAlPromedio];
        int x = 0;
        for (int i = 0; i < TAMANIO; i++) {

            if (miArray[i] > promedio) {
                listaValoresMayoresAlPromedio[x] = miArray[i];
                x++;
            }
        }
        
         System.out.println("el promedio es " + promedio);
        System.out.println("los datos mayor al promedio son : " + contadorDeDatosMayoresAlPromedio);

        System.out.println("mostramos todos los valores mayores al promedio ");
        for (int i = 0; i < listaValoresMayoresAlPromedio.length; i++) {
            System.out.print(listaValoresMayoresAlPromedio[i] +" - ");
        }
        
        //System.out.println("dimension de array = " + listaValoresMayoresAlPromedio.length);

       
    }

}
