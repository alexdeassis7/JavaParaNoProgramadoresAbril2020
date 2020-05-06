package calse2problemaselectivocompuesto;
//Leer 3 numeros diferentes e imprimir el mayor de los tres

import java.util.Scanner;

public class Calse2ProblemaSelectivoCompuesto {

    public static void main(String[] args) {
        //defino las variables de trabajo 
        int num1 = 0, num2 = 0, num3 = 0, mayor = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos a usuario 
        System.out.println("ingrese el numero 1");
        num1 = teclado.nextInt();

        System.out.println("ingrese el numero 2");
        num2 = teclado.nextInt();

        System.out.println("ingrese el numero 3");
        num3 = teclado.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            mayor = num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        
        System.out.println("el mayor es : "+ mayor );

    }

}
