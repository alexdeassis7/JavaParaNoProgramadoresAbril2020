package clase2problemassecuenciales;
//importamos la libreria Java Util para poder tomar datos desde el teclado 
import java.util.Scanner;
public class Clase2ProblemasSecuenciales {
    /**     * Suponga que un individuo desea invertir su capital en un banco y desea
     * saber cuanto dinero ganara despues de un mes si el banco paga a razon de
     * 2% mensual     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //definimos las variables de trabajo 
        float capital = 0, ganancia = 0, interes = 0.02f;
        //solicitamos los datos al usuario
        System.out.println("ingrese su capital a invertir ");
        capital = teclado.nextFloat();
        //procesamos la informacion
        ganancia = capital * interes;

        //mostramos los resultados obtenidos
        System.out.println("su ganacia despues de 30 dias sera de " + ganancia);

    }
}
