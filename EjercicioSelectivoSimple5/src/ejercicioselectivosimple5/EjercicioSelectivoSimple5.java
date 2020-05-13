/* 5) Hacer un algoritmo que calcule el total a pagar por la compra de laptops de un local 
comercial, Si se compran tres laptops o más se aplica un descuento del 20% sobre el total
de la compra y si son menos de tres Laptop un descuento de 10%
 */
package ejercicioselectivosimple5;

import java.util.Scanner;

public class EjercicioSelectivoSimple5 {
    public static void main(String[] args) {
        int numeroDeLaptops = 0;
        float precioLaptop = 0  , total_compra = 0 , total_a_pagar = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("ingrese la cantidad de computadoras que compro");
        numeroDeLaptops = teclado.nextInt();

        System.out.println("ingrese el precio de las computadoras que adquirio");
        precioLaptop = teclado.nextFloat();
        //calculamos el precio a pagar 
        total_compra = numeroDeLaptops * precioLaptop;
        //calculamos el descuento a otorgar
        if(numeroDeLaptops >= 3 ){
            System.out.println("Se aplico $" + total_compra * 0.20f + " de descuento ");
            total_a_pagar = total_compra  - (total_compra * 0.20f);              
        }else{
            System.out.println("Se aplico $" + total_compra * 0.10f + " de descuento ");
            total_a_pagar = total_compra  - (total_compra * 0.10f);     
        }
        
        //mostramos el precio final con el correspondiente descuento 
        System.out.println("el precio a pagar por sus " + numeroDeLaptops+ " Laptops es de " + total_a_pagar);
        
    }

}
