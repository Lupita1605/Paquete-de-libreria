package com.example.model; // Define el paquete donde se encuentra la clase User

/**
 * Clase que representa un usuario en el sistema.
 */
public class User {
    private String firstName; // Campo para almacenar el primer nombre del usuario
    private String lastName; // Campo para almacenar el apellido del usuario
    private String phone; // Campo para almacenar el teléfono del usuario
    private String email; // Campo para almacenar el correo electrónico del usuario
    private int age; // Campo para almacenar la edad del usuario

    /**
     * Constructor de la clase User.
     * @param firstName El primer nombre del usuario.
     * @param lastName El apellido del usuario.
     * @param phone El teléfono del usuario.
     * @param email El correo electrónico del usuario.
     * @param age La edad del usuario.
     */
    public User(String firstName, String lastName, String phone, String email, int age) {
        this.firstName = firstName; // Inicializa el primer nombre
        this.lastName = lastName; // Inicializa el apellido
        this.phone = phone; // Inicializa el teléfono
        this.email = email; // Inicializa el correo electrónico
        this.age = age; // Inicializa la edad
    }

    // Métodos Getters y Setters para acceder y modificar los campos privados

    /**
     * Obtiene el primer nombre del usuario.
     * @return El primer nombre del usuario.
     */
    public String getFirstName() {
        return firstName; // Devuelve el primer nombre
    }

    /**
     * Establece el primer nombre del usuario.
     * @param firstName El primer nombre del usuario.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName; // Establece el primer nombre
    }

    /**
     * Obtiene el apellido del usuario.
     * @return El apellido del usuario.
     */
    public String getLastName() {
        return lastName; // Devuelve el apellido
    }

    /**
     * Establece el apellido del usuario.
     * @param lastName El apellido del usuario.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName; // Establece el apellido
    }

    /**
     * Obtiene el teléfono del usuario.
     * @return El teléfono del usuario.
     */
    public String getPhone() {
        return phone; // Devuelve el teléfono
    }

    /**
     * Establece el teléfono del usuario.
     * @param phone El teléfono del usuario.
     */
    public void setPhone(String phone) {
        this.phone = phone; // Establece el teléfono
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * @return El correo electrónico del usuario.
     */
    public String getEmail() {
        return email; // Devuelve el correo electrónico
    }

    /**
     * Establece el correo electrónico del usuario.
     * @param email El correo electrónico del usuario.
     */
    public void setEmail(String email) {
        this.email = email; // Establece el correo electrónico
    }

    /**
     * Obtiene la edad del usuario.
     * @return La edad del usuario.
     */
    public int getAge() {
        return age; // Devuelve la edad
    }

    /**
     * Establece la edad del usuario.
     * @param age La edad del usuario.
     */
    public void setAge(int age) {
        this.age = age; // Establece la edad
    }
}
