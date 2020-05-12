package clase3.pkgswitch;

import java.util.Scanner;

public class Clase3SWITCH {

    public static void main(String[] args) {
        int opcionIngresada = 0;
        float numero1 = 0, numero2 = 0, resultado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Welcome a La Calculadora");
        System.out.println("Ingrese la opcion deseada ");
        System.out.println("1 Sumar ");
        System.out.println("2 restar ");
        System.out.println("3 multiplicar ");
        System.out.println("4 dividir");
        opcionIngresada = teclado.nextInt();

        if (opcionIngresada > 0 && opcionIngresada < 5) {
            System.out.println("ingrese numero1 ");
            numero1 = teclado.nextFloat();
            System.out.println("ingrese numero2 ");
            numero2 = teclado.nextFloat();
        }
        //Declaracion de Switch
        switch (opcionIngresada) {
            //declaracion de Case
            case 1:
                System.out.println("usted selecciono la opcion 1 de sumar ");
                resultado = numero1 + numero2;
                break;
            case 2:
                System.out.println("usted selecciono la opcion 2 de restar");
                resultado = numero1 - numero2;
                break;
            case 3:
                System.out.println("usted selecciono la opcion 3 de multiplicar");
                resultado = numero1 * numero2;
                break;
            case 4:
                System.out.println("usted selecciono la opcion 4 de dividir");
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                } else {
                    System.out.println("No se puede dividir por cero en el conjunto de los numeros reales!");
                }
                break;
            default:
                System.out.println("la opcion " + opcionIngresada + " no es una opcion valida ");
        }

        if (opcionIngresada > 0 && opcionIngresada < 5) {
            System.out.println("El Resultado es : " + resultado);
        }

        System.out.println("Fin del programa ");

    }

}
