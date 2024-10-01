import java.util.Scanner;
public class contadorNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        int numero = scanner.nextInt();
        //Contador para los digitos 
        int contador = 0;
        //mientras en numero sea mayor que cero se divide por 10
        while (numero > 0) {
            numero = numero / 10; 
            contador++;            
        }
        System.out.println("El número de dígitos es: " + contador);
    }
}
