package clase3;

public class Clase3 {

    public static void main(String[] args) {

        int contador = 0;
        /*crear un algoritmo que muesrtre los numeros  pares del cero al cien  */
        while (contador < 100) {
            System.out.println(contador);
            contador += 2;

        }
        /*crear un algoritmo que muestre los numeros  pares del cien al cero  */
        while (contador >= 0) {
            System.out.println(contador);
            contador -= 2;
        }

    }
}
