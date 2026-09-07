import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("===== CALCULADORA BÁSICA =====");
            System.out.println("Seleccione una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            // Validamos que la opción sea un número entero
            int opcion;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Ingrese un número del 1 al 5.\n");
                scanner.next(); // descarta la entrada inválida
                continue;
            }

            if (opcion == 5) {
                continuar = false;
                System.out.println("¡Hasta luego!");
                break;
            }

            // Validamos que la opción esté en el rango correcto
            if (opcion < 1 || opcion > 4) {
                System.out.println("Opción no válida. Intente de nuevo.\n");
                continue;
            }

            System.out.print("Ingrese el primer número: ");
            double num1 = leerNumero(scanner);

            System.out.print("Ingrese el segundo número: ");
            double num2 = leerNumero(scanner);

            double resultado = 0;
            boolean errorDivision = false;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir entre cero.");
                        errorDivision = true;
                    } else {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                    }
                    break;
            }

            System.out.println(); // línea en blanco para separar operaciones
        }

        scanner.close();
    }

    // Método auxiliar para leer un número válido (evita errores si el usuario escribe texto)
    private static double leerNumero(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Ingrese un número: ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
}