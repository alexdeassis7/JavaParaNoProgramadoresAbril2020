package clase5calculadoraconmetodos;

import java.util.Scanner;

public class Clase5CalculadoraConMetodos {

    public static void main(String[] args) {
        int opcionIngresada = 0;
        float numero1 = 0, numero2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Welcome Calculadora Application ");
        do {
            System.out.println("Ingrese la opcion deseada");
            System.out.print(" 1) SUMAR \n 2) RESTAR \n 3) MULTIPLICAR \n 4) DIVIDIR");
            opcionIngresada = teclado.nextInt();

            if (opcionIngresada >= 1 && opcionIngresada <= 4) {
                System.out.println("ingrese primer numero");
                numero1 = teclado.nextFloat();
                System.out.println("ingrese segundo numero");
                numero2 = teclado.nextFloat();
                mostrarOpciones(opcionIngresada, numero1, numero2);
            }
            System.out.println("Desea realizar otra operacion \n presione 9 (SI) o 0 para salir ");
            opcionIngresada = teclado.nextInt();
            if (opcionIngresada == 0) {
                break;
            }

        } while (opcionIngresada >= 5 != opcionIngresada < 1 || opcionIngresada == 9);

        System.out.println("Gracias por utilizar la application ");
    }

    //metodos
    public static float sumar(float numero1, float numero2) {
        float resultado = numero1 + numero2;
        return resultado;
    }

    public static float restar(float numero1, float numero2) {
        float resultado = numero1 - numero2;
        return resultado;
    }

    public static float multiplicar(float numero1, float numero2) {
        float resultado = numero1 * numero2;
        return resultado;
    }

    public static float dividir(float numero1, float numero2) {
        float resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            error();
        }
        return resultado;
    }

    //metodo : procedimiento 
    public static void error() {
        System.out.println("ERROR!!! , no se puede dividir por cero en los numeros reales");
    }

    public static void mostrarOpciones(int op, float n1, float n2) {
        switch (op) {
            case 1://SUMAR
                System.out.println("El Resultado de la suma es " + sumar(n1, n2));
                break;
            case 2://RESTAR
                System.out.println("El resultado de la resta es " + restar(n1, n2));
                break;
            case 3://MULTIPLICAR
                System.out.println("El resultado de la multiplicacion es " + multiplicar(n1, n2));
                break;
            case 4://DIVIDIR 
                System.out.println("El resultado de la Diovision es : " + dividir(n1, n2));
                break;
            default:
                System.out.println("la opcion " + op + " Es invalida! intente nuevamente ");
        }
    }
}
