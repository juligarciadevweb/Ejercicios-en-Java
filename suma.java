/* 
 * Realizar la suma de 2 numeros pedidos al usuario 
 * y multiplicarlos por una constante aleatoria
 * 
 * */
import java.util.Random;
import java.util.Scanner;

public class suma{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //crea un objeto scanner para leer la entrada del usuario
        Random random = new Random();
        final double numeroAleatorio = random.nextDouble(1015); //El argumento especifica el limite superior

        //Pedido del primer numero
        System.out.println("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        //Pedido del segundo numero
        System.out.println("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt(); //guarda el numero de la segunda lectura
        //podemos usar el metodo nextDouble

        double sum2 = (double) (numero1 + numero2 * numeroAleatorio); // especificamos el tipo de dato en la operacion aritmetica
        System.out.println("La operacion es " + sum2);
        scanner.close();
    }
}
