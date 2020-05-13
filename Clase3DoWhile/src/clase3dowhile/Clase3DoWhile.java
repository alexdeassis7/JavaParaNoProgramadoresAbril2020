package clase3dowhile;

public class Clase3DoWhile {

    public static void main(String[] args) {
        int contador = 0;
        
        System.out.println("incrementamos de cero a cien ");
        do {
            System.out.println(contador);
            contador++;
        } while (contador <= 100);
        contador = 100 ;
        System.out.println("decrementamos de cien a cero  ");
        do {
            System.out.println(contador);
            contador--;
        } while (contador >= 0);

    }

}
