package com.example; // Define el paquete donde se encuentra la clase Main
import com.example.gui.UserManagementGUI; // Importa la clase UserManagementGUI
/**
 * Clase principal para ejecutar la aplicación de gestión de usuarios.
 */
public class Main {
    /**
     * Método principal para ejecutar la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        new UserManagementGUI(); // Crea una instancia de UserManagementGUI y ejecuta la aplicación
    }
}
