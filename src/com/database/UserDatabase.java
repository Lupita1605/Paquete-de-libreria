package com.example.database; // Define el paquete donde se encuentra la clase UserDatabase

import com.example.model.User; // Importa la clase User
import java.util.ArrayList; // Importa la clase ArrayList
import java.util.List; // Importa la clase List

/**
 * Clase que representa la base de datos de usuarios.
 */
public class UserDatabase {
    private List<User> users; // Lista para almacenar los usuarios

    /**
     * Constructor de la clase UserDatabase.
     * Inicializa la lista de usuarios.
     */
    public UserDatabase() {
        this.users = new ArrayList<>(); // Inicializa la lista de usuarios
    }

    /**
     * Agrega un usuario a la base de datos.
     * @param user El usuario a agregar.
     */
    public void addUser(User user) {
        users.add(user); // Agrega el usuario a la lista
    }

    /**
     * Elimina un usuario de la base de datos por correo electrónico.
     * @param email El correo electrónico del usuario a eliminar.
     */
    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email)); // Elimina el usuario cuyo correo electrónico coincide
    }

    /**
     * Obtiene todos los usuarios de la base de datos.
     * @return Una lista de todos los usuarios.
     */
    public List<User> getAllUsers() {
        return new ArrayList<>(users); // Devuelve una copia de la lista de usuarios
    }
}
