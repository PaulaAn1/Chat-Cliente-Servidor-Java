import java.io.*;
import java.net.*;

public class Cliente {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 12345);
             BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Conectado al servidor");

            String mensajeServidor;
            String mensajeCliente;

            while (true) {
                System.out.print("Escribe tu mensaje: ");
                mensajeCliente = teclado.readLine();
                salida.println(mensajeCliente);

                mensajeServidor = entrada.readLine();
                System.out.println("Servidor: " + mensajeServidor);

                if (mensajeCliente.equalsIgnoreCase("adiós")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

