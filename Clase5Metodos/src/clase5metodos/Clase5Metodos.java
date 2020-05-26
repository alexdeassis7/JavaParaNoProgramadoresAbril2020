package clase5metodos;

import java.util.Scanner;

public class Clase5Metodos {

    public static void main(String[] args) {

        mostrarMensaje("soy un nuevo procedimiento");

        float n1 = 0, n2 = 0;
        Scanner teclado = new Scanner(System.in);
        //solicitamos los datos al usuario 
        System.out.println("ingrese el primer numero ");
        n1 = teclado.nextFloat();

        System.out.println("ingrese el segundo numero ");
        n2 = teclado.nextFloat();

        //invocacion a un metodo
        System.out.println("el metodo sumar me retorno :" + sumar(n1, n2));
        System.out.println(sumar(2, 2));
        System.out.println(sumar(2, 8));
    }

    //metodo de tipo funcion que suma dos numeros 
    public static float sumar(float num1, float num2) {
        //cuerpo del metodo
        return num1 + num2;

    }

    //Metodo de tipo procedimiento : no tiene valor de retorno 
    public static void mostrarMensaje(String mensaje) {
        //cuerpo del procedimiento 
        System.out.println(mensaje);

    }

//    public tipodeRetorno nombreMetodo(tipo1Param nombre1Param,t2 nombre2 ) {
//        //cuerpo del metodo 
//        
//        
//    }
}
