import java.util.Scanner;

public class ContarVocalesConsonantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra (solo minúsculas, sin acentos ni símbolos): ");
        String palabra = scanner.nextLine();

        int vocales = 0;
        int consonantes = 0;

        // Recorremos cada carácter de la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // Estructura de control if/else para clasificar cada letra
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else {
                consonantes++;
            }
        }

        System.out.println("\nPalabra ingresada: " + palabra);
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);

        scanner.close();
    }
}