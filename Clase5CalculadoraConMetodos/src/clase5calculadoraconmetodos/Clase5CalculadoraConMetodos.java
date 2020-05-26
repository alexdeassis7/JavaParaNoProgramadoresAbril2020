package clase5calculadoraconmetodos;

import java.util.Scanner;

public class Clase5CalculadoraConMetodos {

    public static void main(String[] args) {
        int opcionIngresada = 0;
        float numero1 = 0, numero2 = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Welcome Calculadora Application ");
        System.out.println("Ingrese la opcion deseada");
        System.out.print(" 1) SUMAR \n 2) RESTAR \n 3) MULTIPLICAR \n 4) DIVIDIR");
        opcionIngresada = teclado.nextInt();

        if (opcionIngresada >= 1 && opcionIngresada <= 4) {
            System.out.println("ingrese primer numero");
            numero1 = teclado.nextFloat();
            System.out.println("ingrese segundo numero");
            numero2 = teclado.nextFloat();
        }
        
        switch (opcionIngresada) {
            case 1://SUMAR
                System.out.println("El Resultado de la suma es " + sumar(numero1, numero2));
                break;
            case 2://RESTAR
                System.err.println("El resultado de la resta es " + restar(numero1, numero2));
                break;
            case 3://MULTIPLICAR

                break;
            case 4://DIVIDIR 

                break;
            default:
                System.out.println("la opcion " + opcionIngresada + " Es invalida!");
        }

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

}
