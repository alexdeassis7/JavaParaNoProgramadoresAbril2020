/*
2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno del vector A
con el elemento uno del vector B y así sucesivamente hasta 45,
almacenar el resultado en un vector C, e imprimir el vector resultante por pantalla.
 */
package ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {

        final int TAMANIO = 45;
        int[] arrayA = new int[TAMANIO];
        int[] arrayB = new int[TAMANIO];
        int[] arrayC = new int[TAMANIO];

        //cargamos los dos array de manera aleatoria 
        for (int i = 0; i < TAMANIO; i++) {
            arrayA[i] = (int) (Math.random() * 100) + 1;
            arrayB[i] = (int) (Math.random() * 100) + 1;
        }
        //sumamos
        for (int i = 0; i < TAMANIO; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }
        //imprimo resultados 
         for (int i = 0; i < TAMANIO; i++) {
             System.out.println(arrayA[i] + " + " + arrayB[i] + " = " + arrayC[i]);
        }
        

    }

}
