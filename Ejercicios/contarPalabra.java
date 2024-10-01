
import java.util.Scanner;
public class contarPalabra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el texto: ");
        String text = new String();
        text = text.trim().replaceAll("\\s+", " ");
        String[] palabras = text.split(" ");
        int numPalabras = palabras.length;
        System.out.println("la cadena tiene "+ numPalabras+ " palabras");
    }
}
