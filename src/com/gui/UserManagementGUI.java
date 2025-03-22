package com.example.gui; // Define el paquete donde se encuentra la clase UserManagementGUI

import com.example.manager.UserManager; // Importa la clase UserManager
import com.example.model.User; // Importa la clase User
import javax.swing.*; // Importa las clases de Swing para la interfaz gráfica
import java.awt.*; // Importa las clases de AWT para el diseño de la interfaz gráfica
import java.awt.event.ActionEvent; // Importa la clase ActionEvent para manejar eventos
import java.awt.event.ActionListener; // Importa la clase ActionListener para manejar eventos

/**
 * Clase que representa la interfaz gráfica de gestión de usuarios.
 */
public class UserManagementGUI {
    private UserManager userManager; // Instancia de UserManager para gestionar los usuarios
    private JTextField firstNameField; // Campo de texto para el primer nombre
    private JTextField lastNameField; // Campo de texto para el apellido
    private JTextField phoneField; // Campo de texto para el teléfono
    private JTextField emailField; // Campo de texto para el correo electrónico
    private JTextField ageField; // Campo de texto para la edad
    private JTextArea userListArea; // Área de texto para mostrar la lista de usuarios
    /**
     * Constructor de la clase UserManagementGUI.
     * Inicializa la instancia de UserManager y crea la interfaz gráfica.
     */
    public UserManagementGUI() {
        userManager = new UserManager(); // Inicializa la instancia de UserManager
        createGUI(); // Llama al método createGUI para crear la interfaz gráfica
    }

    /**
     * Método para crear la interfaz gráfica.
     */
    private void createGUI() {
        JFrame frame = new JFrame("User Management System"); // Crea el marco de la interfaz gráfica
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Establece la operación de cierre
        frame.setSize(400, 400); // Establece el tamaño del marco
        frame.setLayout(new FlowLayout()); // Establece el diseño del marco
        // Campos de entrada
        firstNameField = new JTextField(10); // Crea el campo de texto para el primer nombre
        lastNameField = new JTextField(10); // Crea el campo de texto para el apellido
        phoneField = new JTextField(10); // Crea el campo de texto para el teléfono
        emailField = new JTextField(10); // Crea el campo de texto para el correo electrónico
        ageField = new JTextField(3); // Crea el campo de texto para la edad

        // Botones
        JButton addButton = new JButton("Agregar Usuario"); // Crea el botón para agregar usuario
        JButton removeButton = new JButton("Eliminar Usuario"); // Crea el botón para eliminar usuario
        JButton listButton = new JButton("Listar Usuarios"); // Crea el botón para listar usuarios

        // Área de texto para mostrar la lista de usuarios
        userListArea = new JTextArea(10, 30);
    }
}