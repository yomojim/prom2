import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        String invertida = "";

        // Recorremos la cadena desde el último carácter hasta el primero
        for (int i = cadena.length() - 1; i >= 0; i--) {
            invertida += cadena.charAt(i);
        }

        System.out.println("Cadena original:  " + cadena);
        System.out.println("Cadena invertida: " + invertida);

        scanner.close();
    }
}