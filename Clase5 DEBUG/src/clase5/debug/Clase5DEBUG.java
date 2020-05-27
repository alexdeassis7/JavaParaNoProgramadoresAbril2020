package clase5.debug;

import javax.swing.JOptionPane;

public class Clase5DEBUG {

    public static void main(String[] args) {
        int cantidadDeElementos = Integer.parseInt(JOptionPane.showInputDialog("Cuanto numeros aleatorios deseas generar"));

        //creamos el array dinamicamente  
        int num_aleatorios[] = new int[cantidadDeElementos];
        //cargamos un array con valores aleatorios 
        for (int i = 0; i < num_aleatorios.length; i++) {
            
            num_aleatorios[i] = (int) (Math.random() * 100) ;
            
        }

        System.out.println("Mostramos el array ");
        for (int i = 0; i < num_aleatorios.length; i++) {
            System.out.print(num_aleatorios[i] + " - ");
        }

    }

}
