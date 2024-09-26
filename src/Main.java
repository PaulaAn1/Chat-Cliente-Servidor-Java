import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una opción:");
        System.out.println("1. Iniciar Servidor");
        System.out.println("2. Iniciar Cliente");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        scanner.nextLine();  // Consumir la nueva línea

        switch (opcion) {
            case 1:
                // Inicia el servidor
                System.out.println("Iniciando el servidor...");
                Servidor.main(args);
                break;
            case 2:
                // Inicia el cliente
                System.out.println("Iniciando el cliente...");
                Cliente.main(args);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige 1 o 2.");
                break;
        }

        scanner.close();
    }
}
