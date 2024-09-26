import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        try (ServerSocket servidor = new ServerSocket(12345)) {
            System.out.println("Servidor iniciado en el puerto 12345...");

            while (true) {
                Socket socket = servidor.accept();
                System.out.println("Cliente conectado");

                new HiloServidor(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class HiloServidor extends Thread {
    private Socket socket;

    public HiloServidor(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try (
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
        ) {
            String mensajeCliente;
            while ((mensajeCliente = entrada.readLine()) != null) {
                System.out.println("Cliente: " + mensajeCliente);

                // Lógica para responder al cliente
                if (mensajeCliente.equalsIgnoreCase("hola")) {
                    salida.println("Hola, ¿cómo puedo ayudarte?, escoge las siguientes opciones: 1. busqueda de archivos, 2. agregar un archivo, 3. salir");
                } else if (mensajeCliente.equalsIgnoreCase("1")) {
                    salida.println("Estos son los archivos disponibles...");
                    break;
                } else if (mensajeCliente.equalsIgnoreCase("2")) {
                    salida.println("Para agregar una nueva carpeta inserte...");
                    break;
                } else if (mensajeCliente.equalsIgnoreCase("3")) {
                    salida.println("Adiós, ¡hasta luego!");
                    break;
                }
                else if (mensajeCliente.equalsIgnoreCase("adiós")) {
                    salida.println("Adiós, ¡hasta luego!");
                    break;
                } else {
                    salida.println("No entiendo tu mensaje.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
