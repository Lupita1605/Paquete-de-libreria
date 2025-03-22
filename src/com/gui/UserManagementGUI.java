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
        userListArea = new JTextArea(10, 30); // Crea el área de texto para mostrar la lista de usuarios
        userListArea.setEditable(false); // Establece el área de texto como no editable
        JScrollPane scrollPane = new JScrollPane(userListArea); // Crea un panel de desplazamiento para el área de texto

        // Agregar componentes al marco
        frame.add(new JLabel("Nombre:")); // Agrega la etiqueta para el primer nombre
        frame.add(firstNameField); // Agrega el campo de texto para el primer nombre
        frame.add(new JLabel("Apellido:")); // Agrega la etiqueta para el apellido
        frame.add(lastNameField); // Agrega el campo de texto para el apellido
        frame.add(new JLabel("Teléfono:")); // Agrega la etiqueta para el teléfono
        frame.add(phoneField); // Agrega el campo de texto para el teléfono
        frame.add(new JLabel("Correo:")); // Agrega la etiqueta para el correo electrónico
        frame.add(emailField); // Agrega el campo de texto para el correo electrónico
        frame.add(new JLabel("Edad:")); // Agrega la etiqueta para la edad
        frame.add(ageField); // Agrega el campo de texto para la edad
        frame.add(addButton); // Agrega el botón para agregar usuario
        frame.add(removeButton); // Agrega el botón para eliminar usuario
        frame.add(listButton); // Agrega el botón para listar usuarios
        frame.add(scrollPane); // Agrega el panel de desplazamiento
        // Acción para agregar usuario
        addButton.addActionListener(new ActionListener() { // Agrega un ActionListener al botón de agregar usuario
            @Override
            public void actionPerformed(ActionEvent e) { // Define la acción a realizar cuando se presiona el botón
                try {
                    String firstName = firstNameField.getText(); // Obtiene el texto del campo de primer nombre
                    String lastName = lastNameField.getText(); // Obtiene el texto del campo de apellido
                    String phone = phoneField.getText(); // Obtiene el texto del campo de teléfono
                    String email = emailField.getText(); // Obtiene el texto del campo de correo electrónico
                    int age = Integer.parseInt(ageField.getText()); // Convierte el texto del campo de edad a un entero

                    User user = new User(firstName, lastName, phone, email, age); // Crea una instancia de User
                    userManager.addUser(user); // Agrega el usuario usando UserManager
                    clearFields(); // Limpia los campos de entrada
                    JOptionPane.showMessageDialog(frame, "Usuario agregado."); // Muestra un mensaje de confirmación
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Edad inválida. Por favor, ingrese un número."); // Maneja el error de formato de número
                }
            }
        });

        // Acción para eliminar usuario
        removeButton.addActionListener(new ActionListener() { // Agrega un ActionListener al botón de eliminar usuario
            @Override
            public void actionPerformed(ActionEvent e) { // Define la acción a realizar cuando se presiona el botón
                String email = emailField.getText(); // Obtiene el texto del campo de correo electrónico
                userManager.removeUser(email); // Elimina el usuario usando UserManager
                clearFields(); // Limpia los campos de entrada
                JOptionPane.showMessageDialog(frame, "Usuario eliminado."); // Muestra un mensaje de confirmación
            }
        });

        // Acción para listar usuarios
        listButton.addActionListener(new ActionListener() { // Agrega un ActionListener al botón de listar usuarios
            @Override
            public void actionPerformed(ActionEvent e) { // Define la acción a realizar cuando se presiona el botón
                userListArea.setText(""); // Limpiar el área de texto
                for (User user : userManager.listUsers()) { // Itera sobre la lista de usuarios
                    userListArea.append("Nombre: " + user.getFirstName() + " " + user.getLastName() + "\n"); // Muestra el nombre del usuario
                    userListArea.append("Teléfono: " + user.getPhone() + "\n"); // Muestra el teléfono del usuario
                    userListArea.append("Correo: " + user.getEmail() + "\n"); // Muestra el correo electrónico del usuario
                    userListArea.append("Edad: " + user.getAge() + "\n"); // Muestra la edad del usuario
                    userListArea.append("-------------------------\n"); // Muestra una línea de separación
                }
            }
        });

        // Hacer visible el marco
        frame.setVisible(true); // Hace visible el marco
    }

    /**
     * Método para limpiar los campos de entrada.
     */
    private void clearFields() {
        firstNameField.setText(""); // Limpia el campo de primer nombre
        lastNameField.setText(""); // Limpia el campo de apellido
        phoneField.setText(""); // Limpia el campo de teléfono
        emailField.setText(""); // Limpia el campo de correo electrónico
        ageField.setText(""); // Limpia el campo de edad
    }

    /**
     * Método principal para ejecutar la aplicación.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        new UserManagementGUI(); // Crea una instancia de UserManagementGUI y ejecuta la aplicación
    }
}
