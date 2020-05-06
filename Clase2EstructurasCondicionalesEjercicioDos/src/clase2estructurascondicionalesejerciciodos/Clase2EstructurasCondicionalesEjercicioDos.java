package clase2estructurascondicionalesejerciciodos;
import java.util.Scanner;
/**Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
Si trabaja 40 horas o menos se le paga $16 por cada hora.
Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y 
* $20 por cada hora extra.*/
public class Clase2EstructurasCondicionalesEjercicioDos {    
    public static void main(String[] args) {
        //definimos las variables de trabajo 
        int hsTrabajadas = 0 ,hsExtras = 0;
        float salarioSemanal = 0 ;
        Scanner teclado = new Scanner(System.in);
        //solicitamos datos al usuario 
        System.out.println("Por favor ingrese las hora que trabajo esta semana");
        hsTrabajadas =teclado.nextInt();
        //procesamos la informacion
        if(hsTrabajadas > 40){
            //calculamos la cantidad de hs extras
            hsExtras = hsTrabajadas - 40;
            //calculamos el salario con Hs Extras 
            salarioSemanal = hsExtras * 20 + 40 * 16 ;
        }else{
            //calculamos el salario sin hs Extras
            salarioSemanal = hsTrabajadas * 16 ;
        }
        //mostramos los resultados obtenidos 
        System.out.println("su salario semanal sera de $ " + salarioSemanal);
        
        
        
    }
    
}
