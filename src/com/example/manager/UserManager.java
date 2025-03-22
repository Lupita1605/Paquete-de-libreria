package com.example.manager; // Define el paquete donde se encuentra la clase UserManager

import com.example.model.User; // Importa la clase User
import com.example.database.UserDatabase; // Importa la clase UserDatabase
import java.util.List; // Importa la clase List

/**
 * Clase que gestiona las operaciones de usuarios.
 */
public class UserManager {
    private UserDatabase userDatabase; // Instancia de UserDatabase para gestionar los usuarios

    /**
     * Constructor de la clase UserManager.
     * Inicializa la instancia de UserDatabase.
     */
    public UserManager() {
        this.userDatabase = new UserDatabase(); // Inicializa la instancia de UserDatabase
    }

    /**
     * Agrega un usuario.
     * @param user El usuario a agregar.
     */
    public void addUser(User user) {
        userDatabase.addUser(user); // Llama al método addUser de UserDatabase
    }

    /**
     * Elimina un usuario por correo electrónico.
     * @param email El correo electrónico del usuario a eliminar.
     */
    public void removeUser(String email) {
        userDatabase.removeUser(email); // Llama al método removeUser de UserDatabase
    }

    /**
     * Lista todos los usuarios.
     * @return Una lista de todos los usuarios.
     */
    public List<User> listUsers() {
        return userDatabase.getAllUsers(); // Llama al método getAllUsers de UserDatabase
    }
}
