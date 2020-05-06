package clase2ejerciciosecuencial2;
//Un maestro desea saber que porcentaje de hombres y que porcentaje de mujeres
//tiene en un grupo de estudiantes 
import java.util.Scanner;
public class Clase2EjercicioSecuencial2 {

    public static void main(String[] args) {
        //Definimos las variables de trabajo 
        int numHombres = 0 , numMujeres = 0 , totalAlumnos = 0 ;
        float porcentajeHombres = 0 , porcentajeMujeres = 0;
        Scanner teclado = new Scanner (System.in);
        //solicitamos los datos a usuario
        System.out.println("Ingrese la cantidad de Mujeres");
        numMujeres = teclado.nextInt();
        System.out.println("Ingrese la cantidad de Hombres");
        numHombres = teclado.nextInt();
        //procesamos la informacion
        totalAlumnos = numHombres + numMujeres ;
        porcentajeHombres = numHombres * 100 / totalAlumnos;
        porcentajeMujeres = numMujeres * 100 / totalAlumnos;
        //mostramos los ressultados procesados
        System.out.println("Porcentaje Hombres =" + porcentajeHombres);
        System.out.println("Porcentaje Mujeres =" + porcentajeMujeres);
        
    }
    
}
