/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 * Representa un usuario que entra al sistema
 * Fecha creacion: 
 * Ultima modificacion: 
 * @author libardo
 */
public class Usuario {
    /**
     * 
     */
    private String login;
    /**
     * 
     */
    private String contrasenia;
    /**
     * Nombres y apellidos completos
     */
    private String nombres;
    /**
     * Constructor que inicializa un usuario
     * @param login nombre del usuario
     * @param contrasenia contraseña secreta
     * @param nombres nombres completos
     */
    public Usuario(String login, String contrasenia, String nombres) {
        this.login = login;
        this.contrasenia = contrasenia;
        this.nombres = nombres;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
}
